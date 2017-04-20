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
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
 <title>all articles</title>

    <!-- 新 Bootstrap 核心 CSS 文件 -->
 <link rel="stylesheet" href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="//cdn.bootcss.com/html5shiv/3.7.2/html5shiv.min.js"></script>
    <script src="//cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>






















<div class="container">
    <h1>所有博客</h1>
    <hr/>
	<!-- 这里还要加个项目名称 app -->
    <h3>所有博客 <a href="/app/blog/add" type="button" class="btn btn-primary btn-sm">添加</a></h3>

    <!-- 如果用户列表为空 -->
 <c:if test="${empty allblogs}">
        <div class="alert alert-warning" role="alert">
            <span class="glyphicon glyphicon-info-sign" aria-hidden="true"></span>blog为空，请<a href="/blog/add" type="button" class="btn btn-primary btn-sm">添加</a>
        </div>
    </c:if>

    <!-- 如果用户列表非空 -->
 <c:if test="${!empty allblogs}">
        <table class="table table-bordered table-striped">
            <tr>
                <th>id</th>
                <th>title</th>
                <th>releasedate</th>
                <th>commentTimes</th>
                <th>operation</th>
            </tr>

            <c:forEach items="${allblogs}" var="blog">
                <tr>
                    <td>${blog.id}</td>
                    <td>${blog.title}</td>
                    <td>${blog.releasedate}</td>
                    <td>${blog.commentTimes}</td>
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




<br/> 



<!-- 
<div id="blog_list">
	<c:forEach var="blog" items="${hashMap}">
	
	map键名：${item.key.title} 　　map键值： ${item.value} <br>
	</c:forEach> 
</div>
-->


<!-- 水平线问题 
<hr/> 
-->
<div id="blog_list">
    <c:forEach items="${hashMap}" var="item">
        <div id="blog_block">
            <p class="blog_content">
                <span class="title">
                    <a href="<%=basePath %>blog/article/${item.key.id}">${item.key.title}</a>
                </span>
                <br>
                ${item.value}
                <br>
                <div id="author_date">by ${item.key.id}</div>
            </p>
        </div>
    </c:forEach>
</div>















<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>



<%  
//session.setAttribute("a",  b);  //把b放到session里，命名为a，  
//从session里把a拿出来，并赋值给M  
%> 
</body>
</html>