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


 <c:if test="${empty allblogs}">
        <div class="alert alert-warning" role="alert">
            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>blog为空，请<a href="/blog/add" type="button" class="btn btn-primary btn-sm">添加</a>
        </div>
    </c:if>

    <!-- 如果用户列表非空 -->
 <c:if test="${!empty blogs}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>id</th>
                <th>title</th>
                <th>content</th>
                <th>summary</th>
                <th>authorId</th>
            </tr>

            <c:forEach items="${blogs}" var="blog">
                <tr>
                    <td>${blog.id}</td>
                    <td>${blog.title}</td>
                    <td>${blog.content}</td>
                    <td>${blog.summary}</td>
                    <td>${blog.authorId }</td>
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

<a href="/app/blog/show/${pageInfo.currentPage+1}" type="button" class="btn btn-sm btn-danger">下一页</a>






</body>
</html>