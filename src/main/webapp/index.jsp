<%@ page language="java" import="java.util.*" pageEncoding="utf-8" %>
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
    <title>光厚</title>
    <script type="text/javascript">
        var basePath = "${basePath}";
    </script>
    <link href="${basePath}/other/bootstrap-3.3.7-dist/css/bootstrap.css" rel="stylesheet">
    <script type="text/javascript" src="${basePath}/js/jquery/jquery-3.3.1.min.js"></script>
    <script type="text/javascript" src="${basePath}/js/index.js"></script>
</head>
<body>
<div class="container text-right" style="margin-top:40px;">
    <a href="${basePath}/page/collection/collectionxx.jsp" class="btn btn-success">添加</a>
</div>
<div class="container">
    <div class="bs-example" data-example-id="hoverable-table" id="showAnswer">
    </div>
</div>
</body>
</html>
