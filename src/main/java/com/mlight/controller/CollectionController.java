package com.mlight.controller;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mlight.model.BasicInformation;
import com.mlight.model.HazardCharacteristics;
import com.mlight.service.CollectionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;
import java.util.List;

/**
 * Created by Administrator on 2018/1/23.
 */
@Controller
@RequestMapping(value = "/collection")
public class CollectionController {

    @Autowired
    private CollectionService collectionService;


    @RequestMapping(value = "/saveBasicInformation.action", method = RequestMethod.POST)
    public String saveBasicInformation(@ModelAttribute BasicInformation basicInformation, @ModelAttribute HazardCharacteristics hzardCharacteristics, HttpServletRequest request, HttpServletResponse response) {
        //TODO 前台表单提交的地址为这里，从前台获取基本信息表，在这里对基本信息表中的数据进行封装。封装之后的数据再保存数据库。
        System.out.println(JSONObject.toJSONString(basicInformation));
        //request取提交表单的信息方式
       /* Enumeration enu=request.getParameterNames();
        while(enu.hasMoreElements()){
            String paraName=(String)enu.nextElement();
            System.out.println(paraName+": "+request.getParameter(paraName));
        }
*/



        String area = this.collectionService.queryDicByDm("d_area", basicInformation.getAreaDm());  //所在区域
        String areaProperty = this.collectionService.queryDicByDm("d_area_property", basicInformation.getAreaPropertyDm());  //区域属性
        String economicType = this.collectionService.queryDicByDm("d_economic_type", basicInformation.getEconomicTypeDm());  //经济类型
        String industryNature = this.collectionService.queryDicByDm("d_industry_nature", basicInformation.getIndustryNatureDm());  //行业性质
        String enterpriseScale = this.collectionService.queryDicByDm("d_qygm", basicInformation.getEnterpriseScaleDm());  //企业规模
        String safetyManagement = this.collectionService.queryDicByDm("d_confirm", basicInformation.getSafetyManagementDm());  //是否组建安全部门
        String safetyProductionPermit = this.collectionService.queryDicByDm("d_confirm", basicInformation.getSafetyProductionPermitDm());  //安全许可证
        String standardization = this.collectionService.queryDicByDm("d_db_level", basicInformation.getStandardizationDm());  //标准化达标
        String record = this.collectionService.queryDicByDm("d_confirm", basicInformation.getRecordDm());  //应急预案备案
        String declare = this.collectionService.queryDicByDm("d_confirm", basicInformation.getDeclareDm());  //职业病危害申报


        basicInformation.setArea(area);
        basicInformation.setAreaProperty(areaProperty);
        basicInformation.setEconomicType(economicType);
        basicInformation.setIndustryNature(industryNature);
        basicInformation.setEnterpriseScale(enterpriseScale);
        basicInformation.setSafetyManagement(safetyManagement);
        basicInformation.setSafetyProductionPermit(safetyProductionPermit);
        basicInformation.setStandardization(standardization);
        basicInformation.setRecord(record);
        basicInformation.setDeclareMc(declare);
        int saveResult1 = this.collectionService.saveBasicInformation(basicInformation);   //保存基本信息表


        String id = this.collectionService.getIdByName(basicInformation.getEnterpriseName());
        String hazardousChemicals = this.collectionService.queryDicByDm("d_have_or_not_have", hzardCharacteristics.getHazardousChemicalsDm());  //是否涉及危险化学品
        String hazardousChemicalsType = this.collectionService.queryDicByDm("d_hx_type", hzardCharacteristics.getHazardousChemicalsTypeDm());  //产品化学类型
        String hazardousChemicalsOtherType= this.collectionService.queryDicByDm("d_other_attr", hzardCharacteristics.getHazardousChemicalsTypeDescribeDm());  //其他产品化学类型
        String majorHazardSources= this.collectionService.queryDicByDm("d_have_or_not_have", hzardCharacteristics.getMajorHazardSourcesDm());  //是否有重大危险源
        String majorHazardSourcesType= this.collectionService.queryDicByDm("d_wxy_type", hzardCharacteristics.getMajorHazardSourcesTypeDm());  //重大危险源类型
        String majorHazardSourcesLeval= this.collectionService.queryDicByDm("d_wx_level", hzardCharacteristics.getMajorHazardSourcesLevalDm());  //重大危险源等级
        String technicsType= this.collectionService.queryDicByDm("d_zdjggy", hzardCharacteristics.getTechnicsTypeDm());  //涉及重点监管工艺
        String technics= this.collectionService.queryDicByDm("d_confirm", hzardCharacteristics.getTechnicsDm());  //是否涉及重点监管工艺
        String emphasisHazardousChemicals= this.collectionService.queryDicByDm("d_confirm", hzardCharacteristics.getEmphasisHazardousChemicalsDm());     //是否涉及重点监管危险化学品
        String specialEquipment= this.collectionService.queryDicByDm("d_confirm", hzardCharacteristics.getSpecialEquipmentDm());     //是否使用特设设备种类
        String specialEquipmentType= this.collectionService.queryDicByDm("d_tzsb", hzardCharacteristics.getSpecialEquipmentTypeDm());     //特设设备种类
        String combustibleDust= this.collectionService.queryDicByDm("d_confirm", hzardCharacteristics.getCombustibleDustDm());    //是否存在可燃粉尘
        String combustibleDustType= this.collectionService.queryDicByDm("d_fcsb", hzardCharacteristics.getCombustibleDustTypeDm());    //可燃粉尘类型
        String dangerousEquipment= this.collectionService.queryDicByDm("d_confirm", hzardCharacteristics.getDangerousEquipmentDm());     //是否使用危险设备
        String dangerousEquipmentType= this.collectionService.queryDicByDm("d_wxsb_type", hzardCharacteristics.getDangerousEquipmentTypeDm());     //危险设备类型
        String punchingPressMachine= this.collectionService.queryDicByDm("d_cjysb", hzardCharacteristics.getPunchingPressMachineDm());     //冲剪压设备类型
        String dangerousEquipmentTypeOther= this.collectionService.queryDicByDm("d_qtsb_type", hzardCharacteristics.getDangerousEquipmentTypeOtherDm());     //其他设备类型
        String finiteSpace= this.collectionService.queryDicByDm("d_have_or_not_have", hzardCharacteristics.getFiniteSpaceDm());     //是否存在有限空间作业
        String ammoniaRefrigeration= this.collectionService.queryDicByDm("d_have_or_not_have", hzardCharacteristics.getAmmoniaRefrigerationDm());     //是否存在制氨制冷
        String dryingRoom= this.collectionService.queryDicByDm("d_have_or_not_have", hzardCharacteristics.getDryingRoomDm());     //是否有喷涂、烘干室
        String cleanWorkshop= this.collectionService.queryDicByDm("d_have_or_not_have", hzardCharacteristics.getCleanWorkshopDm());     //是否有洁净厂房



        hzardCharacteristics.setBasicId(Integer.parseInt(id));
        hzardCharacteristics.setHazardousChemicals(hazardousChemicals);
        hzardCharacteristics.setHazardousChemicalsType(hazardousChemicalsType);
        hzardCharacteristics.setHazardousChemicalsTypeDescribe(hazardousChemicalsOtherType);
        hzardCharacteristics.setMajorHazardSources(majorHazardSources);
        hzardCharacteristics.setMajorHazardSourcesType(majorHazardSourcesType);
        hzardCharacteristics.setMajorHazardSourcesLeval(majorHazardSourcesLeval);
        hzardCharacteristics.setTechnics(technics);
        hzardCharacteristics.setTechnicsType(technicsType);
        hzardCharacteristics.setEmphasisHazardousChemicals(emphasisHazardousChemicals);
        hzardCharacteristics.setSpecialEquipment(specialEquipment);
        hzardCharacteristics.setSpecialEquipmentType(specialEquipmentType);
        hzardCharacteristics.setCombustibleDust(combustibleDust);
        hzardCharacteristics.setCombustibleDustType(combustibleDustType);
        hzardCharacteristics.setDangerousEquipment(dangerousEquipment);
        hzardCharacteristics.setDangerousEquipmentType(dangerousEquipmentType);
        hzardCharacteristics.setPunchingPressMachine(punchingPressMachine);
        hzardCharacteristics.setDangerousEquipmentTypeOther(dangerousEquipmentTypeOther);
        hzardCharacteristics.setFiniteSpace(finiteSpace);
        hzardCharacteristics.setAmmoniaRefrigeration(ammoniaRefrigeration);
        hzardCharacteristics.setDryingRoom(dryingRoom);
        hzardCharacteristics.setCleanWorkshop(cleanWorkshop);


        int saveResult2 = this.collectionService.saveHazardCharacteristics(hzardCharacteristics);  //保存危险特性

//        return "/page/collection/collectionxx.jsp";
        return "/index.jsp";
    }

    @RequestMapping("/queryBasicInformation.action")
    public String queryBasicInformation(BasicInformation basicInformation, HttpServletRequest request, HttpServletResponse response) {
        int pageNum = Integer.parseInt(request.getParameter("pageNum"));
        List<BasicInformation> list = this.collectionService.queryBasicInformation(pageNum, 20);
        PageInfo pageInfo = new PageInfo(list);
        request.setAttribute("pageInfo", pageInfo);
        return "/page/enterpriseList.jsp";
    }

    @RequestMapping("/queryEnterprise.action")
    public String queryEnterprise(Integer id,HttpServletRequest request, HttpServletResponse response) {
        BasicInformation basicInformation = this.collectionService.queryBasicInformationById(id);
        request.setAttribute("bo", basicInformation);
        HazardCharacteristics hazardCharacteristics = this.collectionService.queryHazardCharacteristicsById(basicInformation.getId());
        request.setAttribute("info",hazardCharacteristics);
        return "/page/enterpriseDetailed.jsp";
    }
}
