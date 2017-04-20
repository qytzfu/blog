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
<meta charset="utf-8">
<title></title>

 <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">
<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>



</head>
<body>


	private int id;
	private String content;
	private int senderId;
	private int receiverId;
	private boolean isRead;
	private Date date;

	private int blogId;


 <c:if test="${!empty messages}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>id</th>
                <th>content</th>
                <th>senderId</th>
                <th>receiverId</th>
                <th>date</th>
                <th>isRead</th>
            </tr>

            <c:forEach items="${messages}" var="message">
                <tr>
                    <td>${message.id}</td>
                    <td>${message.content}</td>
                    <td>${message.senderId}</td>
                    <td>${message.receiverId}</td>
                    <td>${message.date}</td>
                    <td>${message.isRead}</td>
                    <td>
                    	<!-- 这里不知道为什么路径会这样 -->
                        <a href="/app/blog/article/${blog.id}" type="button" class="btn btn-sm btn-success">详情</a>
                        <a href="/app/blog/update/${blog.id}" type="button" class="btn btn-sm btn-warning">修改</a>
                        <a href="/app/blog/delete/${blog.id}" type="button" class="btn btn-sm btn-danger">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </c:if>
</div>




</body>
</html>