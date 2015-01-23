<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<title>餐记</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <link href="${basePath}/css/bootstrap.css" media="all" rel="stylesheet" type="text/css" />
    <link href="${basePath}/css/font-awesome.css" media="all" rel="stylesheet" type="text/css" />
    <link href="${basePath}/css/bootstrap-theme.css" media="all" rel="stylesheet" type="text/css" />
</head>
<body>
	<div class="container-fluid">
		<div class="row">
			<div class="col-md-6">
				<form role="form" action="${basePath}/j_spring_security_check" method="post">
					<div class="form-group">
						<label for="j_username">用户名</label>
					    <input type="text" class="form-control" id="j_username" name="j_username" placeholder="">
					</div>
					<div class="form-group">
						<label for="j_password">密码</label>
					    <input type="password" class="form-control" id="j_password" name="j_password" placeholder="">
					</div>
					<button type="submit" class="btn btn-default">登录</button>
				</form>
			</div>
		</div>
	</div><!-- 引入 js -->
	<script src="${basePath}/js/jquery-1.11.2.min.js" type="text/javascript"></script>
	<script src="${basePath}/js/bootstrap.js" type="text/javascript"></script>
</body>
<html>