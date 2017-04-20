<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String imgPath = basePath + "image/";
System.out.println(path);
System.out.println(basePath);
System.out.println(imgPath);
%>
<!DOCTYPE html>
<html>  
<head>  
<meta charset="utf-8">  
<title>上传图片</title>  
</head>  
<body>  
<form action="<%=path %>/blog/springUpload2" method="post" enctype="multipart/form-data">  
<input type="file" name="file" /> 
<input type="submit" value="Submit" /></form>  

</body>  

</html>  