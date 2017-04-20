<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
 <title>add blog</title>

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
    <h1>添加blog</h1>
    <hr/>
    <!-- 
    	1.首先如何得到 路径中的id，因为我们有两个add，一个带id的
    	2.后来删除了id，blog注入不进去，不知道是不是因为id是自增的
     -->
    <form:form action="/app/blog/add3" method="post" commandName="blog" role="form">
        <div class="form-group">
            <label for="title">title:</label>
            <input type="text" class="form-control" id="title" name="title" placeholder="Enter title:"/>
        </div>
        <div class="form-group">
            <label for="releasedate">releasedate:</label>
            <input type="text" class="form-control" id="releasedate" name="releasedate" placeholder="Enter releasedate:"/>
        </div>
        <div class="form-group">
            <label for="commentTimes">commentTimes:</label>
            <input type="text" class="form-control" id="commentTimes" name="commentTimes" placeholder="Enter commentTimes:"/>
        </div>
        <div class="form-group">
            <label for="content">content:</label>
            <input type="text" class="form-control" id="content" name="content" placeholder="Enter content:"/>
        </div>
        <div class="form-group">
            <button type="submit" class="btn btn-sm btn-success">提交</button>
        </div>
    </form:form>
</div>

<!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
<script src="//cdn.bootcss.com/jquery/1.11.3/jquery.min.js"></script>

<!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
</body>
</html>