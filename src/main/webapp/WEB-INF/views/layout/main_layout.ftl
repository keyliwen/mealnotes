<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<title>餐记</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link href="${basePath}/css/bootstrap.css" media="all" rel="stylesheet" type="text/css" />
    <link href="${basePath}/css/font-awesome.css" media="all" rel="stylesheet" type="text/css" />
    <link href="${basePath}/css/bootstrap-theme.css" media="all" rel="stylesheet" type="text/css" />
    <@block name="head_include"></@block>
</head>
<body>
	<div class="container-fluid">
		
	<@block name="body_include"></@block>
	</div><!-- 引入 js -->
	<script src="${basePath}/js/jquery-1.11.2.min.js" type="text/javascript"></script>
	<script src="${basePath}/js/bootstrap.js" type="text/javascript"></script>
	<@block name="foot_include"></@block>
</body>
<html>