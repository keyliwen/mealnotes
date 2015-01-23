<@override name="head_include">
</@override>
<@override name="body_include">
	HELLO ${username!}
	<a href="${basePath}/logout">注销</a>
</@override>
<@override name="foot_include">
</@override>
<@extends name="layout/main_layout.ftl"/>