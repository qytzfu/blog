<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String imgPath = basePath + "image/";
%>
<!DOCTYPE html>
<html>
	<head>
		<title>register</title>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">
		<meta name="apple-mobile-web-app-capable" content="yes">
		<meta name="apple-mobile-web-app-status-bar-style" content="black">
		<meta name="format-detection" content="telephone=no">
	
	
		<link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
		<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>
		<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
		<style>.col-center-block { float: none; display: block; margin-left: auto; margin-right: auto; }</style></head>
	<body>
		<div class="container">
			<div class="row myCenter">
				<div class="col-xs-6 col-md-4 col-center-block">
					<form id="formId" class="form-signin" action="register" method="post">
						<h2 class="form-signin-heading">注册</h2>
						
						<label for="username" class="sr-only">用户名</label>
						<input type="text" id="username" name="username" class="form-control" placeholder="用户名" required autofocus>
						
						<label for="inputPassword" class="sr-only">密码</label>
						<input type="password" id="inputPassword" name="password" class="form-control" placeholder="密码" required>
						
						
						<!-- 	
						<label for="inputCaptcha" class="sr-only">验证码</label>
						<input type="text" id="inputCaptcha" name="captcha" class="form-control" placeholder="验证码">
						
						<div id="captchaImg">
																		 src="/app/login/captcha.form" 
							<img id="captchaImage" name="captchaImage" src="/app/login/captcha.form" />
						</div>	
						 -->	
						
						<button id="buttonId" class="btn btn-lg btn-primary btn-block" type="button">注册</button></form>
						<!-- button 属性修改type="button",这样就不会提交了 -->
				</div>
			</div>
		</div>
	</body>

<script type="text/javascript">
$(function(){
	$('#buttonId').click(function(){
		$.ajax({  
		    type: "POST",  
		    url:"register",  
		    data:$('#formId').serialize(),// 序列化表单值 
		    dataType:"json",
		    async: false, 
		    error: function(request) {  
		        alert("Connection error");  
		    },  
		    success: function(data) {
	            ajaxobj=eval(data);
		    	alert(ajaxobj.status);
		    	if(ajaxobj.status =="success")
					location.href = "../blog/show"; 
		    }
		});
	});
})

</script>

</html>
