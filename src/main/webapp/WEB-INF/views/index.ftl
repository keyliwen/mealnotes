<@override name="head_include">
</@override>
<@override name="body_include">
	HELLO ${username!}
	<a href="${basePath}/logout">注销</a>
	<@security.authorize ifAnyGranted="ROLE_USER">
		我是管理员
	</@security.authorize>
</@override>
<@override name="foot_include">
</@override>
<@extends name="layout/main_layout.ftl"/>