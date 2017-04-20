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

<script>
  
    function test(obj){
    	//alert(obj.id)
        var value=document.getElementById("name1").value;
        document.getElementById("receiverId").value=value;
    }
    
</script>

</head>
<body>


${comment.content }
<input type="text" id="name1" value="aaa"/>
<input type="text" id="name2" value="bbb"/>

 
<form action="/app/comment/writeComment" novalidate>
  <div class="form-group">
    <label for="contents">Contents</label>
    <textarea name="content" class="summernote" id="contents" title="Contents">${blog.content}</textarea>
  </div>
  <input type="text" name="blogId" value="${blog.id}" style="display:none">
  <input type="text" name="authorId" value="${blog.authorId}" style="display:none">
  <!--  receiverId 要看js了 -->
  <input type="text" name="receiverId" value="" id="receiverId" style="display:none">  
  <button type="submit" class="btn btn-default">submit</button>
</form>



<input id='btn' type='button' onclick='test(this)' value='点击获取当前按钮的id' />


</body>
</html>