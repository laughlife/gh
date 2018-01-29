<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<!DOCTYPE HTML>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>（捷越镜业）奉贤区生产经营单位安全生产基础信息采集表</title>
    <link href="/other/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="/js/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="/js/collection/collection2.js"></script>
</head>
<body>
<div class="container">
    <form>
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
                    <td colspan="4"><input type="text" class="form-control" name="dwmc" id="dwmc" placeholder="单位名称"></td>
                </tr>
                <tr>
                    <td>所在区域</td>
                    <td colspan="2" id="td_area">

                    </td>
                    <td>邮政编码</td>
                    <td><input type="text" class="form-control" name="yzbm" id="yzbm" placeholder="邮政编码"></td>
                </tr>
                <tr>
                    <td>生产经营地址</td>
                    <td>
                        <input type="text" class="form-control" name="scjydz" id="scjydz" placeholder="生产经营地址">
                    </td>
                    <td>所在地块属性</td>
                    <td colspan="2" id="td_area_property">
                    </td>
                </tr>
                <tr>
                    <td>法定代表人</td>
                    <td>
                        汤菊花
                    </td>
                    <td>联系电话</td>
                    <td colspan="2">13052468886
                    </td>
                </tr>
                <tr>
                    <td>安全负责人</td>
                    <td>
                        汤菊花
                    </td>
                    <td>联系电话</td>
                    <td colspan="2">13052468886
                    </td>
                </tr>
                <tr>
                    <td>企业成立日期</td>
                    <td>
                        2002年9月24日
                    </td>
                    <td>注册资本（万元）</td>
                    <td colspan="2">50
                    </td>
                </tr>
                <tr>
                    <td>经济类型</td>
                    <td id="td_economic_type">
                    </td>
                    <td>营业期限</td>
                    <td colspan="2">2022年9月23日
                    </td>
                </tr>
                <tr>
                    <td>经营范围</td>
                    <td colspan="4">玻璃制品，彩色包装材料，塑料制品等
                    </td>
                </tr>
                <tr>
                    <td>行业性质</td>
                    <td colspan="4" id="td_industry_nature">
                    </td>
                </tr>
                <tr>
                    <td>企业规模</td>
                    <td>
                        □大型 □中型 ■小型 □微型
                    </td>
                    <td>生产经营场所建筑面积（m2）</td>
                    <td colspan="2">3500
                    </td>
                </tr>
                <tr>
                    <td>主要原料</td>
                    <td>

                    </td>
                    <td>主要产品</td>
                    <td colspan="2">
                    </td>
                </tr>
                <tr>
                    <td>员工人数（人）</td>
                    <td>
                        123
                    </td>
                    <td>年营业收入（万元）</td>
                    <td colspan="2">
                        150
                    </td>
                </tr>
                <tr>
                    <td>是否专门组建安全管理部门</td>
                    <td id="td_safety_management">
                    </td>
                    <td>生产设备数量（台/套）</td>
                    <td colspan="2">

                    </td>
                </tr>
                <tr>
                    <td>安全管理人员（持证人数）</td>
                    <td>
                        1
                    </td>
                    <td>特种作业人员（持证人数）</td>
                    <td colspan="2">
                        2
                    </td>
                </tr>
                <tr>
                    <td rowspan="2">安全生产许可证</td>
                    <td rowspan="2" id="td_safe_production_licence">
                    </td>
                    <td>证书编号</td>
                    <td colspan="2">

                    </td>
                </tr>
                <tr>
                    <td>有效期</td>
                    <td colspan="2">

                    </td>
                </tr>
                <tr>
                    <td rowspan="2">安全生产标准化达标</td>
                    <td rowspan="2">
                        □一级 □二级 □三级■ 否
                    </td>
                    <td>证书编号</td>
                    <td colspan="2">

                    </td>
                </tr>
                <tr>
                    <td>发证日期</td>
                    <td colspan="2">

                    </td>
                </tr>
                <tr>
                    <td rowspan="2">应急预案备案</td>
                    <td rowspan="2" id="td_emergency_plan_record">
                    </td>
                    <td>备案编号</td>
                    <td colspan="2">
                        JY005
                    </td>
                </tr>
                <tr>
                    <td>时间</td>
                    <td colspan="2">
                        2017年9月1日
                    </td>
                </tr>
                <tr>
                    <td rowspan="2">职业病危害申报</td>
                    <td rowspan="2" id="td_occupational_diseases">
                    </td>
                    <td>申报备案号</td>
                    <td colspan="2">
                    </td>
                </tr>
                <tr>
                    <td>接触人数</td>
                    <td colspan="2">
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
                    <td colspan="2">□生产</td>
                </tr>
                <tr>
                    <td>□经营</td>
                    <td colspan="2">□加油站 □瓶装气经营 □其它</td>
                </tr>
                <tr>
                    <td colspan="2">□使用</td>
                </tr>
                <tr>
                    <td>□ 储存</td>
                    <td colspan="2">□储罐____m3<br/>
                        □仓库____m2<br/>
                        □堆场____m2<br/>
                        □其他<br/>
                    </td>
                </tr>

                <tr>
                    <td>是否有重大危险源</td>
                    <td id="td_major_hazard_sources">

                    </td>
                    <td>重大危险源种类</td>
                    <td colspan="2">□危险化学品 □锅炉 □压力管道
                        □压力容器 □其他
                    </td>
                </tr>
                <tr>
                    <td>重大危险源等级</td>
                    <td colspan="4">
                        □一级 □二级 □三级 □四级
                    </td>
                </tr>
                <tr>
                    <td>是否涉及重点监管工艺</td>
                    <td id="td_supervise">
                    </td>
                    <td>涉及重点监管工艺</td>
                    <td colspan="2" style="max-width:180px;">
                        □光气及光气化工艺 □电解工艺（氯碱）<br/>
                        □氯化工艺 □硝化工艺 □合成氨工艺 <br/>
                        □裂解（裂化）工艺 □氟化工艺 □加氢工艺 <br/>
                        □重氮化工艺 □氧化工艺□过氧化工艺 <br/>
                        □胺基化工艺 □磺化工艺 □聚合工艺 <br/>
                        □烷基化工艺 □新型煤化工工艺 □电石生产工艺 <br/>
                        □偶氮化工艺
                    </td>
                </tr>
                <tr>
                    <td>是否涉及重点监管危险化学品</td>
                    <td id="td_hazardous_chemicals">
                    </td>
                    <td>特种设备种类</td>
                    <td colspan="2">□锅炉 □压力容器 □压力管道■电梯 □起重机械
                        <br/>□客运索道 □大型游乐设施 □场（厂）内专用机动车辆
                    </td>
                </tr>
                <tr>
                    <td>是否存在可燃粉尘</td>
                    <td id="td_combustible_dust"></td>
                    <td>粉尘类型</td>
                    <td colspan="2">□金属加工 □木制品/纸制品加工 □纺织品加工 □粮食粉尘 <br/>
                        □橡胶和塑料制品加工 □冶金/有色/建材行业煤粉制备 □其他粉尘
                    </td>
                </tr>
                <tr>
                    <td rowspan="5">是否使用危险设备</td>
                    <td rowspan="5" id="td_dangerous_equipment"></td>
                    <td rowspan="5">危险设备类型</td>
                    <td>□冲剪压机械</td>
                    <td>□冲剪压设备□注塑机械 □冲剪压设备</td>
                </tr>
                <tr>
                    <td>□金属切削机械</td>
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
                    <td>□工业炉窑 □砂轮机 <br/>□电焊机 □皮带运输机 <br/>□手持电动工具和移动电器设备 <br/>□其他</td>
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
                <button type="submit" class="btn btn-default">Submit</button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
