<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String imgPath = basePath + "image/";



String realPath = request.getRealPath("/WEB-INF/upload/");

System.out.println(path);
System.out.println(basePath);
System.out.println(imgPath);
System.out.println(realPath);

%>
<!DOCTYPE html>
<html>  
<head>  
<meta charset="utf-8">  
<title>上传图片</title>  
</head>  
<body>  

<img alt="no" src="<%=realPath%>/t.jpg">
<!-- 是不是因为没有在左边文件夹中显示，没有部署？
<img alt="yes" src="../upload/t.jpg">
-->

<!-- 
一般不提倡使用路径直接显示图片，那样的话可维护性不高。
最好的方法就是在写一个专门针对显示图片的action方法。将数据流写出去，jsp中img标签写对应的显示图片的action方法的链接

 -->
 
 
</body>  
</html>  