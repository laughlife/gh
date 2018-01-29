<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>奉贤区生产经营单位安全生产基础信息采集表</title>
    <link href="/other/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet"/>
    <link href="/css/collection/collection1.css" rel="stylesheet"/>
    <script type="text/javascript" src="/js/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/collection/collection1.js"></script>
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
                        <td colspan="4"><input type="text" class="form-control" name="dwmc" id="dwmc"
                                               placeholder="单位名称"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">所在区域：</td>
                        <td id="td_area"></td>
                        <td class="firsttd"> 邮政编码：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">生产经营地址：</td>
                        <td><input type="text" class="form-control" placeholder="请输入"></td>
                        <td class="firsttd">所在地块属性：</td>
                        <td colspan="2" id="td_area_property"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">法定代表人：</td>
                        <td><input type="text" class="form-control" placeholder="请输入"></td>
                        <td class="firsttd">联系电话：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">安全负责人：</td>
                        <td><input type="text" class="form-control" placeholder="请输入"></td>
                        <td class="firsttd">联系电话：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">企业成立日期：</td>
                        <td><input type="text" class="form-control" placeholder="请输入"></td>
                        <td class="firsttd">注册资本（万元）：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">经济类型：</td>
                        <td id="td_economic_type">

                        </td>
                        <td class="firsttd">营业期限：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">经营范围：</td>
                        <td colspan="4"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">行业性质：</td>
                        <td colspan="4" id="td_industry_nature">
                        </td>
                    </tr>
                    <tr>
                        <td class="firsttd">企业规模：</td>
                        <td>
                            <div class="checkbox"><label><input type="checkbox">大型</label></div>
                            <div class="checkbox"><label><input type="checkbox">中型</label></div>
                            <div class="checkbox"><label><input type="checkbox">小型</label></div>
                            <div class="checkbox"><label><input type="checkbox">微型</label></div>
                        </td>
                        <td class="firsttd">生产经营场所建筑面积（m2）：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">主要原料：</td>
                        <td><input type="text" class="form-control" placeholder="请输入"></td>
                        <td class="firsttd">主要产品：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">员工人数（人）：</td>
                        <td><input type="text" class="form-control" placeholder="请输入"></td>
                        <td class="firsttd"> 年营业收入（万元）：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否专门组建安全管理部门：</td>
                        <td id="td_safety_management"></td>
                        <td class="firsttd">生产设备数量（台/套）：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">安全管理人员（持证人数）：</td>
                        <td><input type="text" class="form-control" placeholder="请输入"></td>
                        <td class="firsttd">特种作业人员（持证人数）：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd" rowspan="2">安全生产许可证：</td>
                        <td rowspan="2" id="td_safe_production_licence"></td>
                        <td class="firsttd">证书编号：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">有效期：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd" rowspan="2">安全生产标准化达标：</td>
                        <td rowspan="2">
                            <div class="checkbox"><label><input type="checkbox">一级</label></div>
                            <div class="checkbox"><label><input type="checkbox">二级</label></div>
                            <div class="checkbox"><label><input type="checkbox">三级</label></div>
                            <div class="checkbox"><label><input type="checkbox">否</label></div>
                        </td>
                        <td class="firsttd">证书编号：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">发证日期：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd" rowspan="2">应急预案备案：</td>
                        <td rowspan="2" id="td_emergency_plan_record"></td>
                        <td class="firsttd">备案编号：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">时间：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd" rowspan="2">职业病危害申报：</td>
                        <td rowspan="2" id="td_occupational_diseases"></td>
                        <td class="firsttd">申报备案号：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">接触人数：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
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
                        <td rowspan="4" class="firsttd">是否涉及危险化学品：</td>
                        <td rowspan="4" id="td_involve_hazardous_chemicals"></td>
                        <td rowspan="4" class="firsttd">危险化学品类型：</td>
                        <td colspan="2">
                            <div class="checkbox"><label><input type="checkbox">生产</label></div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="checkbox"><label><input type="checkbox">经营</label></div>
                        </td>
                        <td>
                            <div class="checkbox"><label><input type="checkbox">加油站</label></div>
                            <div class="checkbox"><label><input type="checkbox">瓶装气经营</label></div>
                            <div class="checkbox"><label><input type="checkbox">其它</label></div>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <div class="checkbox"><label><input type="checkbox">使用</label></div>
                        </td>
                        <td></td>
                    </tr>
                    <tr>

                        <td>
                            <div class="checkbox"><label><input type="checkbox">储存</label></div>
                        </td>
                        <td>
                            <div class="checkbox"><label><input type="checkbox">储罐 m3</label></div>
                            <div class="checkbox"><label><input type="checkbox">仓库m2</label></div>
                            <div class="checkbox"><label><input type="checkbox">堆场m2</label></div>
                            <div class="checkbox"><label><input type="checkbox">其他</label></div>
                        </td>
                    </tr>


                    <tr>
                        <td class="firsttd">是否有重大危险源：</td>
                        <td id="td_major_hazard_sources"></td>
                        <td class="firsttd">重大危险源种类：</td>
                        <td colspan="2">
                            <div class="checkbox"><label><input type="checkbox">危险化学品</label></div>
                            <div class="checkbox"><label><input type="checkbox"> 锅炉</label></div>
                            <div class="checkbox"><label><input type="checkbox"> 压力管道</label></div>
                            <div class="checkbox"><label><input type="checkbox">压力容器</label></div>
                            <div class="checkbox"><label><input type="checkbox"> 其他</label></div>
                        </td>
                    </tr>
                    <tr>
                        <td class="firsttd">重大危险源等级：</td>
                        <td colspan="4">
                            <div class="checkbox"><label><input type="checkbox">一级</label></div>
                            <div class="checkbox"><label><input type="checkbox">二级</label></div>
                            <div class="checkbox"><label><input type="checkbox">三级</label></div>
                            <div class="checkbox"><label><input type="checkbox">四级</label></div>
                        </td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否涉及重点监管工艺：</td>
                        <td id="td_supervise"></td>
                        <td class="firsttd"> 涉及重点监管工艺：</td>
                        <td colspan="2">□光气及光气化工艺 □电解工艺（氯碱） □氯化工艺 □硝化工艺 □合成氨工艺 □裂解（裂化）工艺 □氟化工艺 □加氢工艺 □重氮化工艺 □氧化工艺□过氧化工艺
                            □胺基化工艺 □磺化工艺 □聚合工艺 □烷基化工艺 □新型煤化工工艺 □电石生产工艺 □偶氮化工艺
                        </td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否涉及重点监管危险化学品：</td>
                        <td id="td_hazardous_chemicals"></td>
                        <td class="firsttd"> 涉及的重点监管危险化学品（名称）：</td>
                        <td colspan="2"><input type="text" class="form-control" placeholder="请输入"></td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否使用特种设备：</td>
                        <td>
                            <div class="checkbox">
                                <label><input type="checkbox">是</label>
                            </div>
                            <div class="checkbox">
                                <label><input type="checkbox">否</label>
                            </div>
                        </td>
                        <td class="firsttd">特种设备种类：</td>
                        <td colspan="2"> √锅炉 □压力容器 □压力管道√电梯 □起重机械 □客运索道 □大型游乐设施 □场（厂）内专用机动车辆</td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否存在可燃粉尘：</td>
                        <td id="td_combustible_dust"></td>
                        <td class="firsttd">粉尘类型：</td>
                        <td colspan="2">□金属加工 □木制品/纸制品加工 □纺织品加工 □粮食粉尘 □橡胶和塑料制品加工 □冶金/有色/建材行业煤粉制备 □其他粉尘</td>
                    </tr>
                    <tr>
                        <td rowspan="5" class="firsttd">是否使用危险设备：</td>
                        <td rowspan="5" id="td_dangerous_equipment"></td>
                        <td class="firsttd" rowspan="5">危险设备类型：</td>
                        <td>□冲剪压机械</td>
                        <td>□冲剪压设备□注塑机械 □冲剪压设备</td>
                    </tr>
                    <tr>
                        <td> □金属切削机械</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>□木工机械</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>□建筑施工机械</td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>□其他</td>
                        <td>□工业炉窑 □砂轮机 □电焊机 □皮带运输机 □手持电动工具和移动电器设备 □其他</td>
                    </tr>


                    <tr>
                        <td class="firsttd">是否存在有限空间作业：</td>
                        <td id="td_finite_space"></td>
                        <td class="firsttd">是否存在液氨制冷：</td>
                        <td colspan="2" id="td_ammonia_refrigeration">
                        </td>
                    </tr>
                    <tr>
                        <td class="firsttd">是否有喷涂、烘干室：</td>
                        <td id="td_drying_room"></td>
                        <td class="firsttd">是否有洁净厂房：</td>
                        <td colspan="2" id="td_clean_workshop"></td>
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
</div>
</body>
</html>
