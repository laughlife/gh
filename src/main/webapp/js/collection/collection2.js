$(document).ready(function () {
    //所在区域
    loadDic("d_area", "area", "td_area", 5);

    //所在地块属性
    loadDic("d_area_property", "area_property", "td_area_property", 0);

    //经济类型
    loadDic("d_economic_type", "economic_type", "td_economic_type", 3);

    //行业性质
    loadDic("d_industry_nature", "industry_nature", "td_industry_nature", 0);

    //是否专门组建安全管理部门
    loadDic("d_confirm", "safety_management", "td_safety_management", 0);
    //安全生产许可证
    loadDic("d_confirm", "safe_production_licence", "td_safe_production_licence", 0);
    //应急预案备案
    loadDic("d_confirm", "emergency_plan_record", "td_emergency_plan_record", 0);
    //职业病危害申报
    loadDic("d_confirm", "occupational_diseases", "td_occupational_diseases", 0);
    //是否涉及重点监管工艺
    loadDic("d_confirm", "supervise", "td_supervise", 0);
    //是否涉及重点监管危险化学品
    loadDic("d_confirm", "hazardous_chemicals", "td_hazardous_chemicals", 0);
    //是否存在可燃粉尘
    loadDic("d_confirm", "combustible_dust", "td_combustible_dust", 0);
    //是否使用危险设备
    loadDic("d_confirm", "dangerous_equipment", "td_dangerous_equipment", 0);

    //是否涉及危险化学品
    loadDic("d_have_or_not_have", "involve_hazardous_chemicals", "td_involve_hazardous_chemicals", 0);
    //是否有重大危险源
    loadDic("d_have_or_not_have", "major_hazard_sources", "td_major_hazard_sources", 0);
    //是否存在有限空间作业
    loadDic("d_have_or_not_have", "finite_space", "td_finite_space", 0);
    //是否存在制氨制冷
    loadDic("d_have_or_not_have", "ammonia_refrigeration", "td_ammonia_refrigeration", 0);
    //是否有喷涂、烘干室
    loadDic("d_have_or_not_have", "drying_room", "td_drying_room", 0);
    //是否有洁净厂房
    loadDic("d_have_or_not_have", "clean_workshop", "td_clean_workshop", 0);


});

/**
 * 所在区域
 */
function loadDic(dicName, inputName, tdName, splitNumber) {
    $.ajax({
        url: "/dictionaries/queryDictionaries.action",
        data: {dicName: dicName},
        dataType: "json",
        method: "get",
        async: false,
        success: function (data) {
            var appendHtml = "";
            for (var i = 0; i < data.length; i++) {
                appendHtml = "<label style='padding-right:10px;'>"
                    + "<input type=\"radio\" name=\"" + inputName + "\" value=\"" + data[i].dm + "\">"
                    + data[i].mc
                    + "</label>";
                $("#" + tdName).append($(appendHtml));
                if (splitNumber != 0 && i != 0 && i % splitNumber == 0) {
                    $("#" + tdName).append("<br />");
                }
            }
        }
    });
}