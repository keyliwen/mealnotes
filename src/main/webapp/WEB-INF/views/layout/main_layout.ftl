<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<title>餐记</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link href="${rc.contextPath}/assets/css/bootstrap.css" media="all" rel="stylesheet" type="text/css" />
    <link href="${rc.contextPath}/assets/css/font-awesome.css" media="all" rel="stylesheet" type="text/css" />
    <link href="${rc.contextPath}/assets/css/bootstrap-theme.css" media="all" rel="stylesheet" type="text/css" />
    <@block name="head_include"></@block>
</head>
<body>
	<div class="container-fluid">
		
	<@block name="body_include"></@block>
	</div><!-- 引入 js -->
	<script src="${rc.contextPath}/assets/js/jquery-1.11.2.min.js" type="text/javascript"></script>
	<script src="${rc.contextPath}/assets/js/bootstrap.js" type="text/javascript"></script>
	<@block name="foot_include"></@block>
</body>
<html>