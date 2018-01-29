package com.mlight.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.mlight.mapper.BasicInformationMapper;
import com.mlight.mapper.HazardCharacteristicsMapper;
import com.mlight.model.BasicInformation;
import com.mlight.model.BasicInformationExample;
import com.mlight.model.HazardCharacteristics;
import com.mlight.model.HazardCharacteristicsExample;
import com.mlight.service.CollectionService;
import com.mlight.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by Administrator on 2018/1/23.
 */
@Service
public class CollectionServiceImpl implements CollectionService{

    @Autowired
    JdbcTemplate jdbcTemplate;


    @Autowired
    BasicInformationMapper basicInformationMapper;

    @Autowired
    HazardCharacteristicsMapper hazardCharacteristicsMapper;

    /**
     * 保存基本信息表
     * @param basicInformation
     * @return
     */
    @Override
    public int saveBasicInformation(BasicInformation basicInformation){
        return this.basicInformationMapper.insert(basicInformation);
    }

    public int saveHazardCharacteristics(HazardCharacteristics hazardCharacteristics) {
        return this.hazardCharacteristicsMapper.insert(hazardCharacteristics);
    }

    @Override
    public List<BasicInformation> queryBasicInformation(int page,int pageSize) {
        BasicInformationExample bi = new BasicInformationExample();
        BasicInformationExample.Criteria criteria = bi.createCriteria();
        PageHelper.startPage(page, pageSize);
        List<BasicInformation> list = this.basicInformationMapper.selectByExample(bi);
        return list;
    }


    @Override
    public String queryDicByDm(String dicName,String dm) {
        String sql = "select mc from "+dicName+" where dm = ?";
        List list = this.jdbcTemplate.queryForList(sql,dm);
        System.out.println(JSONObject.toJSONString(list
        ));
        String returnString = "";
        for (Object obj:list){
            returnString = String.valueOf(((Map)obj).get("MC"));
        }
        return returnString;
    }

    @Override
    public String getIdByName(String name) {
        String sql = "select id from t_basic_information where enterprise_name = ?";
        List list = this.jdbcTemplate.queryForList(sql,name);
        String returnString = "";
        for (Object obj:list){
            returnString = String.valueOf(((Map)obj).get("id"));
        }
        return returnString;
    }

    @Override
    public BasicInformation queryBasicInformationById(Integer id) {
        BasicInformationExample bi = new BasicInformationExample();
        BasicInformationExample.Criteria criteria = bi.createCriteria();
        criteria.andIdEqualTo(id);
        List<BasicInformation> list = this.basicInformationMapper.selectByExample(bi);
        BasicInformation basicInformation = new BasicInformation();
        for(BasicInformation b:list){
            basicInformation = b;
        }
        return basicInformation;
    }

    @Override
    public HazardCharacteristics queryHazardCharacteristicsById(Integer id) {
        HazardCharacteristicsExample he = new HazardCharacteristicsExample();
        HazardCharacteristicsExample.Criteria criteria = he.createCriteria();
        criteria.andBasicIdEqualTo(id);
        List<HazardCharacteristics> list = this.hazardCharacteristicsMapper.selectByExample(he);
        HazardCharacteristics hc = new HazardCharacteristics();
        for(HazardCharacteristics h : list){
            hc = h;
        }
        return hc;
    }
}
