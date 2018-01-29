$(document).ready(function () {
    //所在区域
    loadDic("d_area", "areaDm", "td_area", 5, 1);
    //所在地块属性
    loadDic("d_area_property", "areaPropertyDm", "td_area_property", 0, 1);
    //经济类型
    loadDic("d_economic_type", "economicTypeDm", "td_economic_type", 3,1);
    //行业性质
    loadDic("d_industry_nature", "industryNatureDm", "td_industry_nature", 0,1);
    //是否专门组建安全管理部门
    loadDic("d_confirm", "safetyManagementDm", "td_safety_management", 0,1);
    //安全生产许可证
    loadDic("d_confirm", "safetyProductionPermitDm", "td_safe_production_licence", 0,1);
    //应急预案备案
    loadDic("d_confirm", "recordDm", "td_emergency_plan_record", 0,1);
    //职业病危害申报
    loadDic("d_confirm", "declareDm", "td_occupational_diseases", 0,1);
    //是否涉及重点监管工艺
    loadDic("d_confirm", "technicsDm", "td_supervise", 0,1);
    //是否涉及重点监管危险化学品
    loadDic("d_confirm", "emphasisHazardousChemicalsDm", "td_hazardous_chemicals", 0,1);
    //是否存在可燃粉尘
    loadDic("d_confirm", "combustibleDustDm", "td_combustible_dust", 0,1);
    //是否使用危险设备
    loadDic("d_confirm", "dangerousEquipmentDm", "td_dangerous_equipment", 0,1);
    //是否涉及危险化学品
    loadDic("d_have_or_not_have", "hazardousChemicalsDm", "td_involve_hazardous_chemicals", 0,1);
    //是否有重大危险源
    loadDic("d_have_or_not_have", "majorHazardSourcesDm", "td_major_hazard_sources", 0,1);
    //是否存在有限空间作业
    loadDic("d_have_or_not_have", "finiteSpaceDm", "td_finite_space", 0,1);
    //是否存在制氨制冷
    loadDic("d_have_or_not_have", "ammoniaRefrigerationDm", "td_ammonia_refrigeration", 0,1);
    //是否有喷涂、烘干室
    loadDic("d_have_or_not_have", "dryingRoomDm", "td_drying_room", 0,1);
    //是否有洁净厂房
    loadDic("d_have_or_not_have", "cleanWorkshopDm", "td_clean_workshop", 0,1);
    //是否使用特设设备种类
    loadDic("d_confirm", "specialEquipmentDm", "td_special_equipment", 0,1);
    //企业规模
    loadDic("d_qygm", "enterpriseScaleDm", "td_qygm", 0,1);
    //安全生产标准化
    loadDic("d_db_level", "standardizationDm", "td_safe_bzh_db", 0,1);
    //经营类型
    //loadDic("d_jy_type", "jy_type", "td_jy_type", 0);
    //危险源类型
    loadDic("d_wxy_type", "majorHazardSourcesTypeDm", "td_wxy_type", 0,2);
    //危险源等级
    loadDic("d_wx_level", "majorHazardSourcesLevalDm", "td_wx_level", 0,1);
    //涉及重点监管工艺
    loadDic("d_zdjggy", "technicsTypeDm", "td_zdjggy", 0,2);
    //特种设备种类
    loadDic("d_tzsb", "specialEquipmentTypeDm", "td_tzsb", 0,2);
    //粉尘设备类型
    loadDic("d_fcsb", "combustibleDustTypeDm", "td_fcsb", 0,2);
    //冲剪压设备
    loadDic("d_cjysb", "punchingPressMachineDm", "td_cjyjx", 0,2);
    //其他设备类型
    loadDic("d_qtsb_type", "dangerousEquipmentTypeOtherDm", "td_qtsb_type", 0,2);

    submitNBasicInfoForm();
});

/**
 *
 * @param dicName 对应的数据库字典表名称
 * @param inputName input的name值
 * @param tdName 页面id值
 * @param splitNumber
 * @param flag  1 单选 2复选
 */
function loadDic(dicName, inputName, tdName, splitNumber, flag) {
    $.ajax({
        url: basePath + "/dictionaries/queryDictionaries.action",
        data: {dicName: dicName},
        dataType: "json",
        method: "get",
        async: false,
        success: function (data) {
            var appendHtml = "";
            switch (flag){
                case 1:
                    for (var i = 0; i < data.length; i++) {
                        if(i == 0){
                            appendHtml = "<label style='padding-right:10px;'>"
                                + "<input type=\"radio\" name=\"" + inputName + "\" value=\"" + data[i].dm + "\" checked>"
                                + data[i].mc
                                + "</label>";
                        }else{
                            appendHtml = "<label style='padding-right:10px;'>"
                                + "<input type=\"radio\" name=\"" + inputName + "\" value=\"" + data[i].dm + "\">"
                                + data[i].mc
                                + "</label>";
                        }
                        $("#" + tdName).append($(appendHtml));
                        if (splitNumber != 0 && i != 0 && i % splitNumber == 0) {
                            $("#" + tdName).append("<br />");
                        }
                    }
                    break;
                case 2:
                    for (var i = 0; i < data.length; i++) {
                        if(i == 0){
                            appendHtml = "<label style='padding-right:10px;'>"
                                + "<input type=\"checkbox\" name=\"" + inputName + "\" value=\"" + data[i].dm + "\" checked>"
                                + data[i].mc
                                + "</label>";
                        }else{
                            appendHtml = "<label style='padding-right:10px;'>"
                                + "<input type=\"checkbox\" name=\"" + inputName + "\" value=\"" + data[i].dm + "\">"
                                + data[i].mc
                                + "</label>";
                        }
                        $("#" + tdName).append($(appendHtml));
                        if (splitNumber != 0 && i != 0 && i % splitNumber == 0) {
                            $("#" + tdName).append("<br />");
                        }
                    }
                    break;
            }

        }
    });
}

/**
 * 根据id获取值
 * @param id
 * @returns {Element}
 */
function getValueById(id) {
    var resultValue = document.getElementById(id);
    return resultValue;
}

/**
 * 获取基础信息表单中所有的表单值
 */
function getBasicInfoValue() {
    var list = [];

}

/**
 * 生成主键的UUID值
 */
function getUUID() {
    function S4() {
        return (((1+Math.random())*0x10000)|0).toString(16).substring(1);
    }
    return (S4()+S4()+"-"+S4()+"-"+S4()+"-"+S4()+"-"+S4()+S4()+S4());
}


/**
 * 点击提交按钮提交基础信息表单和验证表单
 * @param id
 */
function submitNBasicInfoForm() {
    $("#_submit").click(function() {
        if (checkSubmit()) {  //验证通过
            $("#basicForm").submit();
        }
    });

}

/**
 * 校验栏位值 栏位id值
 * @param filedName
 */
function proofField(filedName) {
    var flag = false;
    var filedValue = $("input[name="+filedName+"]").val();  //拿到栏位值
    if(getOfNull(filedValue) || filedValue == "") {   //全是空格情况或者没有值的情况
        flag = false;
    }else {
        flag = true;
    }
    return flag;
}
/**
 * 校验单选是、否的情况下关联该单选栏位的禁用情况
 * @param boxId  选项id
 * @param fieldNam
 */
function proofSingleBox(boxId,filedName) {
    //选择否
    var boxValue = $("#"+boxId+"").val();
    if (boxValue != "" && boxValue == "2") {  //选项为否时
        //禁止栏位填写和选项的选择
        banFillFiled(filedName);
    }
    if (boxValue != "" && boxValue == "1") {  //选项为是时
        //禁止栏位填写和选项的选择
        allowFillField(filedName);
    }
}

/**
 * 禁止填写栏位
 * @param fieldName  栏位的标识Name值
 */
function banFillFiled(fieldName) {
    $("input[name="+fieldName+"]").attr("disabled",true);
}

/**
 * 解除禁止填写的状态
 * @param fieldName 栏位的标识Name值
 */
function allowFillField(fieldName) {
    $("input[name="+fieldName+"]").attr("disabled","");
}
/**
 * 控制表单部分栏位的可填性
 */
function controlForm() {

}

/**
 * 判断是否全是空格情况
 * @param str  校验的字符串
 */
function getOfNull(str) {
    var result = (str + "").split("");
    var strFlag = true;
    for (var i = 0; i < result.length; i ++) {
        if ((result[i] + "") == " " ) {
            strFlag = true;
        }else {
            strFlag = false;
            break;
        }
    }
    return strFlag;
}

/**
 * 提交前的检查
 */
function  checkSubmit() {
    //
    return true;
}


