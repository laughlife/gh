<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    request.setAttribute("basePath",basePath);
%>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>奉贤区生产经营单位安全生产基础信息采集表</title>
    <link href="${basePath}/other/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
    <link href="${basePath}/css/collection/collection1.css" rel="stylesheet"/>
    <script type="text/javascript" src="${basePath}/js/jquery/jquery-3.3.1.min.js"></script>
</head>
<body>
<div class="container">
    <div class="container-fluid">

        <div class="tabletitle1">奉贤区安全生产信息系统<br/>生产经营单位基础信息采集表</div>

    </div>


    <div class="container-fluid">
        <div class="container">
            <form role="form">
                <table class="table table-bordered">
                    <tbody>
                    <tr>
                        <td colspan="5" class="text-center bggray"><h4><strong>一、基本信息</strong></h4></td>
                    </tr>
                    <tr>
                        <td class="firsttd">单位名称：</td>
                        <td colspan="4">${bo.enterpriseName}</td>
                    </tr>
                    <tr>
                        <td class="firsttd" style="min-width:240px;">所在区域：</td>
                        <td id="td_area" style="width:25%;min-width:200px;">${bo.area}</td>
                        <td class="firsttd" style="min-width:240px;">邮政编码：</td>
                        <td colspan="2">${bo.postCode}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">生产经营地址：</td>
                        <td>${bo.productionAddress}</td>
                        <td class="firsttd">所在地块属性：</td>
                        <td colspan="2" id="td_area_property">${bo.areaProperty}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">法定代表人：</td>
                        <td>${bo.legalRepresentative}</td>
                        <td class="firsttd">联系电话：</td>
                        <td colspan="2">${bo.legalRepresentativePhone}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">安全负责人：</td>
                        <td>${bo.securityOfficer}</td>
                        <td class="firsttd">联系电话：</td>
                        <td colspan="2">${bo.securityOfficerPhone}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">企业成立日期：</td>
                        <td>${bo.establishDateFormat}</td>
                        <td class="firsttd">注册资本（万元）：</td>
                        <td colspan="2">${bo.registeredCapital}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">经济类型：</td>
                        <td id="td_economic_type">${bo.economicType}</td>
                        <td class="firsttd">营业期限：</td>
                        <td colspan="2">${bo.operationPeriodBeginFormat}-${bo.operationPeriodEndFormat}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">经营范围：</td>
                        <td colspan="4">${bo.scopeOfOperation}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">行业性质：</td>
                        <td colspan="4" id="td_industry_nature">${bo.industryNature}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">企业规模：</td>
                        <td>${bo.enterpriseScale}</td>
                        <td class="firsttd">生产经营场所建筑面积（m2）：</td>
                        <td colspan="2">${bo.coveringArea}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">主要原料：</td>
                        <td>${bo.mainMaterial}</td>
                        <td class="firsttd">主要产品：</td>
                        <td colspan="2">${bo.mainProduct}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">员工人数（人）：</td>
                        <td>${bo.numberOfStaff}</td>
                        <td class="firsttd"> 年营业收入（万元）：</td>
                        <td colspan="2">${bo.annualRevenue}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否专门组建安全管理部门：</td>
                        <td id="td_safety_management">${bo.safetyManagement}</td>
                        <td class="firsttd">生产设备数量（台/套）：</td>
                        <td colspan="2">${bo.productionEquipmentNo}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">安全管理人员（持证人数）：</td>
                        <td>${bo.securityManagerNo}</td>
                        <td class="firsttd">特种作业人员（持证人数）：</td>
                        <td colspan="2">${bo.specialOperatorNo}</td>
                    </tr>
                    <tr>
                        <td class="firsttd" rowspan="2">安全生产许可证：</td>
                        <td rowspan="2" id="td_safe_production_licence">${bo.safetyProductionPermit}</td>
                        <td class="firsttd">证书编号：</td>
                        <td colspan="2">${bo.safetyProductionPermitNo}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">有效期：</td>
                        <td colspan="2">${bo.safetyProductionPermitBeginFormat}-${bo.safetyProductionPermitEndFormat}</td>
                    </tr>
                    <tr>
                        <td class="firsttd" rowspan="2">安全生产标准化达标：</td>
                        <td rowspan="2">${bo.standardization}</td>
                        <td class="firsttd">证书编号：</td>
                        <td colspan="2">${bo.standardizationCardNo}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">发证日期：</td>
                        <td colspan="2">${bo.standardizationCardDateFormat}</td>
                    </tr>
                    <tr>
                        <td class="firsttd" rowspan="2">应急预案备案：</td>
                        <td rowspan="2" id="td_emergency_plan_record">${bo.record}</td>
                        <td class="firsttd">备案编号：</td>
                        <td colspan="2">${bo.recordNo}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">时间：</td>
                        <td colspan="2">${bo.recordDateFormat}</td>
                    </tr>
                    <tr>
                        <td class="firsttd" rowspan="2">职业病危害申报：</td>
                        <td rowspan="2" id="td_occupational_diseases">${bo.declareMc}</td>
                        <td class="firsttd">申报备案号：</td>
                        <td colspan="2">${bo.declareNo}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">接触人数：</td>
                        <td colspan="2">${bo.declareNumber}</td>
                    </tr>
                    <tr>
                        <td colspan="5" class="shuoming"><strong>说明：</strong><br/>
                            1、有关工商注册信息:按《企业法人营业执照》中信息对照填写。<br/>
                            2、企业规模:按国家统计局《关于印发统计上大中小微型企业划分办法的通知》（国统字〔2011〕75号）执行。详细见附件1
                        </td>
                    </tr>
                    <tr>
                        <td colspan="5" class="text-center bggray"><h4><strong>二、危险特性</strong></h4></td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否涉及危险化学品：</td>
                        <td id="td_involve_hazardous_chemicals">${info.hazardousChemicals}</td>
                        <td class="firsttd">危险化学品类型：</td>
                        <td colspan="2">
                            ${info.hazardousChemicalsType}
                            <c:if test="${!empty(info.hazardousChemicalsTypeDescribe)}">
                                ，${info.hazardousChemicalsTypeDescribe}
                            </c:if>
                            <c:if test="${!empty(info.hazardousChemicalsTypeOther)}">
                                ,${info.hazardousChemicalsTypeOther}
                            </c:if>
                        </td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否有重大危险源：</td>
                        <td id="td_major_hazard_sources">${info.majorHazardSources}</td>
                        <td class="firsttd">重大危险源种类：</td>
                        <td colspan="2">${info.majorHazardSourcesType}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">重大危险源等级：</td>
                        <td colspan="4">${info.majorHazardSourcesLeval}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否涉及重点监管工艺：</td>
                        <td id="td_supervise">${info.technics}</td>
                        <td class="firsttd"> 涉及重点监管工艺：</td>
                        <td colspan="2">${info.technicsType}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否涉及重点监管危险化学品：</td>
                        <td id="td_hazardous_chemicals">${info.emphasisHazardousChemicals}</td>
                        <td class="firsttd"> 涉及的重点监管危险化学品（名称）：</td>
                        <td colspan="2">${info.emphasisHazardousChemicalsNames}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否使用特种设备：</td>
                        <td>
                            ${info.specialEquipment}
                        </td>
                        <td class="firsttd">特种设备种类：</td>
                        <td colspan="2">${info.specialEquipmentType}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否存在可燃粉尘：</td>
                        <td id="td_combustible_dust">${info.combustibleDust}</td>
                        <td class="firsttd">粉尘类型：</td>
                        <td colspan="2">${info.combustibleDustType}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否使用危险设备：</td>
                        <td id="td_dangerous_equipment">${info.dangerousEquipment}</td>
                        <td class="firsttd">危险设备类型：</td>
                        <td colspan="2">${info.dangerousEquipmentType}</td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否存在有限空间作业：</td>
                        <td id="td_finite_space">${info.finiteSpace}</td>
                        <td class="firsttd">是否存在液氨制冷：</td>
                        <td colspan="2" id="td_ammonia_refrigeration">${info.ammoniaRefrigeration}
                        </td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否有喷涂、烘干室：</td>
                        <td id="td_drying_room">${info.dryingRoom}</td>
                        <td class="firsttd">是否有洁净厂房：</td>
                        <td colspan="2" id="td_clean_workshop">${info.cleanWorkshop}</td>
                    </tr>
                    <tr>
                        <td colspan="5" class="shuoming"><strong>说明：</strong><br/>
                            1、危险化学品名称应按《危险化学品目录》中的名称填写。<br/>
                            2、可燃粉尘可按照《工贸行业重点可燃性粉尘目录（2015版）》进行辨识，详见附件2。
                        </td>
                    </tr>
                    </tbody>
                </table>
            </form>
        </div>
    </div>
    <div class="container text-center" style="margin:40px;">
        <a href="${basePath}/index.jsp" class="btn btn-success">返回</a>
    </div>
</div>

</body>
</html>
