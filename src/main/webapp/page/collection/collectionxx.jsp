<%@ page language="java" pageEncoding="utf-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    request.getSession().setAttribute("basePath",basePath);
%>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>奉贤区生产经营单位安全生产基础信息采集表</title>
    <script type="text/javascript">
        var basePath = "${basePath}";
    </script>
    <link href="${basePath}/other/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="${basePath}/js/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${basePath}/js/collection/collectionxx.js"></script>
    <script language="javascript" type="text/javascript" src="${basePath}/other/My97DatePicker/WdatePicker.js"></script>
    <style>

        .save_type {
            border-color: #878787;
            border-style: solid;
            border-top-width: 0px;
            border-right-width: 0px;
            border-bottom-width: 1px;
            border-left-width: 0px;
            outline: none;
            width: 63px;
        }

        .form-date {
            /*display: block;*/
            width: 161px;
            height: 34px;
            padding: 6px 12px;
            font-size: 14px;
            line-height: 1.42857143;
            color: #555;
            background-color: #fff;
            background-image: none;
            border: 1px solid #ccc;
            border-radius: 4px;
            -webkit-box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
            box-shadow: inset 0 1px 1px rgba(0, 0, 0, .075);
            -webkit-transition: border-color ease-in-out .15s, -webkit-box-shadow ease-in-out .15s;
            -o-transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
            transition: border-color ease-in-out .15s, box-shadow ease-in-out .15s;
        }
    </style>
</head>
<body>
<div class="container">
    <form action="${basePath}/collection/saveBasicInformation.action" method="post" id="basicForm">
        <div class="row">
            <div class="col-md-12 text-center"><h3>奉贤区安全生产信息系统</h3></div>
        </div>
        <div class="row">
            <div class="col-md-12 text-center"><h3>生产经营单位基础信息采集表</h3></div>
        </div>
        <div class="row">
            <table class="table table-bordered">
                <tbody>
                <tr>
                    <td colspan="5">
                        <h4 class="text-center">一、基本信息</h4>
                    </td>
                </tr>
                <tr>
                    <td>单位名称</td>
                    <td colspan="4"><input type="text" class="form-control" name="enterpriseName" id="dwmc"
                                           placeholder="单位名称"></td>
                </tr>
                <tr>
                    <td>所在区域</td>
                    <td colspan="2" id="td_area">

                    </td>
                    <td>邮政编码</td>
                    <td><input type="text" class="form-control" name="postCode" id="yzbm" placeholder="邮政编码"></td>
                </tr>
                <tr>
                    <td>生产经营地址</td>
                    <td>
                        <input type="text" class="form-control" name="productionAddress" id="scjydz"
                               placeholder="生产经营地址">
                    </td>
                    <td>所在地块属性</td>
                    <td colspan="2" id="td_area_property">
                    </td>
                </tr>
                <tr>
                    <td>法定代表人</td>
                    <td>
                        <input type="text" class="form-control" name="legalRepresentative" id="fddbr"
                               placeholder="法定代表人">
                    </td>
                    <td>联系电话</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="legalRepresentativePhone" id="dbr_lxdh"
                               placeholder="联系电话">
                    </td>
                </tr>
                <tr>
                    <td>安全负责人</td>
                    <td>
                        <input type="text" class="form-control" name="securityOfficer" id="aqfzr" placeholder="安全负责人">
                    </td>
                    <td>联系电话</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="securityOfficerPhone" id="fzr_lxdh"
                               placeholder="联系电话">
                    </td>
                    </td>
                </tr>
                <tr>
                    <td>企业成立日期</td>
                    <td>
                        <input type="text" class="form-date" name="establishDate" id="clrq" placeholder="企业成立日期" onClick="WdatePicker()" readonly>
                    </td>
                    <td>注册资本（万元）</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="registeredCapital" id="zczb"
                               placeholder="注册资本（万元）">
                    </td>
                </tr>
                <tr>
                    <td>经济类型</td>
                    <td id="td_economic_type">
                    </td>
                    <td>营业期限</td>
                    <td colspan="2">
                        <input type="text" class="form-date" name="operationPeriodBegin" id="yyqx_begin"
                               placeholder="开始日期"  onClick="WdatePicker()" readonly/>
                        —
                        <input type="text" class="form-date" name="operationPeriodEnd" id="yyqx_end" placeholder="截止日期"
                               onClick="WdatePicker()" readonly/>
                    </td>
                </tr>
                <tr>
                    <td>经营范围</td>
                    <td colspan="4">
                        <input type="text" class="form-control" name="scopeOfOperation" id="jyfw" placeholder="经营范围"/>
                    </td>
                </tr>
                <tr>
                    <td>行业性质</td>
                    <td colspan="4" id="td_industry_nature">
                    </td>
                </tr>
                <tr>
                    <td>企业规模</td>
                    <td colspan="1" id="td_qygm">

                    </td>
                    <td>生产经营场所建筑面积（m2）</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="coveringArea" id="scjyc_jzmj"
                               placeholder="生产经营场所建筑面积（m2）">
                    </td>
                </tr>
                <tr>
                    <td>主要原料</td>
                    <td>
                        <input type="text" class="form-control" name="mainMaterial" id="zyyl" placeholder="主要原料">
                    </td>
                    <td>主要产品</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="mainProduct" id="zycp" placeholder="主要产品">
                    </td>
                </tr>
                <tr>
                    <td>员工人数（人）</td>
                    <td>
                        <input type="text" class="form-control" name="numberOfStaff" id="ygrs" placeholder="员工人数（人）">
                    </td>
                    <td>年营业收入（万元）</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="annualRevenue" id="nyysr" placeholder="年营业收入（万元）">
                    </td>
                </tr>
                <tr>
                    <td>是否专门组建安全管理部门</td>
                    <td id="td_safety_management">
                    </td>
                    <td>生产设备数量（台/套）</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="productionEquipmentNo" id="scsbsl"
                               placeholder="生产设备数量（台/套）">
                    </td>
                </tr>
                <tr>
                    <td>安全管理人员（持证人数）</td>
                    <td>
                        <input type="text" class="form-control" name="securityManagerNo" id="aqglry"
                               placeholder="安全管理人员（持证人数）">
                    </td>
                    <td>特种作业人员（持证人数）</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="specialOperatorNo" id="tzzyry"
                               placeholder="特种作业人员（持证人数）">
                    </td>
                </tr>
                <tr>
                    <td rowspan="2">安全生产许可证</td>
                    <td rowspan="2" id="td_safe_production_licence">
                    </td>
                    <td>证书编号</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="safetyProductionPermitNo" id="xkz_zsbh"
                               placeholder="证书编号">
                    </td>
                </tr>
                <tr>
                    <td>有效期</td>
                    <td colspan="2">
                        <input type="text" class="form-date" name="safetyProductionPermitBegin" id="yxq_begin"
                               placeholder="开始时间"  onClick="WdatePicker()" readonly />
                        —
                        <input type="text" class="form-date" name="safetyProductionPermitEnd" id="yxq_end"
                               placeholder="结束时间"  onClick="WdatePicker()" readonly />
                    </td>
                </tr>
                <tr>
                    <td rowspan="2">安全生产标准化达标</td>
                    <td rowspan="2" id="td_safe_bzh_db">
                    </td>
                    <td>证书编号</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="standardizationCardNo" id="db_zsbh"
                               placeholder="证书编号">
                    </td>
                </tr>
                <tr>
                    <td>发证日期</td>
                    <td colspan="2">
                        <input type="text" class="form-date" name="standardizationCardDate" id="fzrq"
                               placeholder="发证日期"  onClick="WdatePicker()" readonly>
                    </td>
                </tr>
                <tr>
                    <td rowspan="2">应急预案备案</td>
                    <td rowspan="2" id="td_emergency_plan_record">
                    </td>
                    <td>备案编号</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="recordNo" id="babh" placeholder="备案编号">
                    </td>
                </tr>
                <tr>
                    <td>时间</td>
                    <td colspan="2">
                        <input type="text" class="form-date" name="recordDate" id="time" placeholder="时间"
                               onClick="WdatePicker()" readonly/>
                    </td>
                </tr>
                <tr>
                    <td rowspan="2">职业病危害申报</td>
                    <td rowspan="2" id="td_occupational_diseases">
                    </td>
                    <td>申报备案号</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="declareNo" id="basbh" placeholder="申报备案号">
                    </td>
                </tr>
                <tr>
                    <td>接触人数</td>
                    <td colspan="2">
                        <input type="text" class="form-control" name="declareNumber" id="jcrs" placeholder="接触人数"/>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="row">
            <div class="col-md-12 text-left"><strong>说明：</strong><br/>
                1.有关工商注册信息:按《企业法人营业执照》中信息对照填写。<br/>
                2.企业规模:按国家统计局《关于印发统计上大中小微型企业划分办法的通知》（国统字〔2011〕75号）执行。详细见附件1
            </div>
        </div>
        <div class="row">
            <table class="table table-bordered">
                <tbody>
                <tr>
                    <td colspan="5">
                        <h4 class="text-center">一、危险特性</h4>
                    </td>
                </tr>
                <tr>
                    <td rowspan="4">是否涉及危险化学品</td>
                    <td rowspan="4" style="min-width: 150px;" id="td_involve_hazardous_chemicals">
                    </td>
                    <td rowspan="4">危险化学品类型</td>
                    <td colspan="2">
                        <label><input type="radio" name="hazardousChemicalsTypeDm" value="1"/>生产</label>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label><input type="radio" name="hazardousChemicalsTypeDm" value="2"/>经营</label>
                    </td>
                    <td colspan="2" id="td_jy_type">
                        <label><input type="radio" name="hazardousChemicalsTypeDescribeDm" value="1"/>加油站</label>
                        <label><input type="radio" name="hazardousChemicalsTypeDescribeDm" value="2"/>瓶装气经营</label>
                        <label><input type="radio" name="hazardousChemicalsTypeDescribeDm" value="3"/>其它</label>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <label><input type="radio" name="hazardousChemicalsTypeDm" value="3"/>使用</label>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label><input type="radio" name="hazardousChemicalsTypeDm" value="4"/>储存</label>
                    </td>
                    <td colspan="2">
                        <label><input type="radio" name="hazardousChemicalsTypeDescribeDm" value="1"/>
                            储罐<input type="text" class="save_type" name="hazardousChemicalsTypeOther" /> m3
                        </label><br/>
                        <label><input type="radio" name="hazardousChemicalsTypeDescribeDm" value="2"/>
                            仓库<input type="text" class="save_type" name="hazardousChemicalsTypeOther" />m2
                        </label><br/>
                        <label><input type="radio" name="hazardousChemicalsTypeDescribeDm" value="3"/>
                            堆场<input type="text" class="save_type" name="hazardousChemicalsTypeOther" />m2
                        </label><br/>
                        <label><input type="radio" name="hazardousChemicalsTypeDescribeDm" value="4"/>其他</label><br/>
                    </td>
                </tr>

                <tr>
                    <td>是否有重大危险源</td>
                    <td id="td_major_hazard_sources">

                    </td>
                    <td>重大危险源种类</td>
                    <td colspan="2" id="td_wxy_type">
                    </td>
                </tr>
                <tr>
                    <td>重大危险源等级</td>
                    <td colspan="4" id="td_wx_level">

                    </td>
                </tr>
                <tr>
                    <td>是否涉及重点监管工艺</td>
                    <td id="td_supervise">
                    </td>
                    <td>涉及重点监管工艺</td>
                    <td colspan="2" style="max-width:180px;" id="td_zdjggy">

                    </td>
                </tr>
                <tr>
                    <td>是否涉及重点监管危险化学品</td>
                    <td id="td_hazardous_chemicals">
                    </td>
                    <td>危险化学品名称</td>
                    <td colspan="2" id="td_hxp_name">
                        <input type="text" class="form-control" name="emphasisHazardousChemicalsNames" id="wxhxp_name" placeholder="危险化学品名称">
                    </td>
                </tr>
                <tr>
                    <td>是否使用特种设备种类</td>
                    <td id="td_special_equipment" colspan="2">
                    </td>
                    <td colspan="2" id="td_tzsb">

                    </td>
                </tr>
                <tr>
                    <td>是否存在可燃粉尘</td>
                    <td id="td_combustible_dust"></td>
                    <td>粉尘类型</td>
                    <td colspan="2" id="td_fcsb">
                    </td>
                </tr>
                <tr>
                    <td rowspan="5">是否使用危险设备</td>
                    <td rowspan="5" id="td_dangerous_equipment"></td>
                    <td rowspan="5">危险设备类型</td>
                    <td>
                        <label><input type="radio" name="dangerousEquipmentTypeDm" value="1"/>冲剪压机械</label>
                    </td>
                    <td id="td_cjyjx">

                    </td>
                </tr>
                <tr>
                    <td>
                        <label><input type="radio" name="dangerousEquipmentTypeDm" value="2"/>金属切削机械</label>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <label><input type="radio" name="dangerousEquipmentTypeDm" value="3"/>木工机械</label>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <label><input type="radio" name="dangerousEquipmentTypeDm" value="4"/>建筑施工机械</label>
                    </td>
                    <td></td>
                </tr>
                <tr>
                    <td>
                        <label><input type="radio" name="dangerousEquipmentTypeDm" value="4"/>其他</label>
                    </td>
                    <td id="td_qtsb_type">

                    </td>
                </tr>
                <tr>
                    <td>是否存在有限空间作业</td>
                    <td id="td_finite_space">
                    </td>
                    <td>是否存在液氨制冷</td>
                    <td colspan="2" id="td_ammonia_refrigeration">
                    </td>
                </tr>
                <tr>
                    <td>是否有喷涂、烘干室</td>
                    <td id="td_drying_room"></td>
                    <td>是否有洁净厂房</td>
                    <td colspan="2" id="td_clean_workshop">
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
        <div class="row">
            <div class="col-md-12 text-left"><strong>说明：</strong><br/>
                1.危险化学品名称应按《危险化学品目录》中的名称填写。<br/>
                2.可燃粉尘可按照《工贸行业重点可燃性粉尘目录（2015版）》进行辨识，详见附件2。
            </div>
        </div>
        <div class="row">
            <div class="col-md-12 text-center">
               <%-- <button type="button" class="btn btn-default" id="_submit" onclick="sunmitNBasicInfoForm()">Submit</button>--%>
                <input type="button" class="btn btn-success" id="_submit" value="提交" />
            </div>
        </div>
    </form>
</div>
</body>
</html>

