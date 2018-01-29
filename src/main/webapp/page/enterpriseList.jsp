<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://"
            + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
    request.getSession().setAttribute("basePath",basePath);
%>
<table class="table table-hover">
    <thead>
    <tr>
        <th></th>
        <th>名称</th>
        <th>区域</th>
        <th>地址</th>
    </tr>
    </thead>
    <tbody id="tbody">
    <c:forEach items="${pageInfo.list}" var="bo" varStatus="k">
        <tr>
            <td scope="row"><a href="${basePath}/collection/queryEnterprise.action?id=${bo.id}">${k.index+1}</a></td>
            <td><a href="${basePath}/collection/queryEnterprise.action?id=${bo.id}">${bo.enterpriseName}</a></td>
            <td><a href="${basePath}/collection/queryEnterprise.action?id=${bo.id}">${bo.area}</a></td>
            <td><a href="${basePath}/collection/queryEnterprise.action?id=${bo.id}">${bo.productionAddress}</a></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<%@include file="page.jsp"%>