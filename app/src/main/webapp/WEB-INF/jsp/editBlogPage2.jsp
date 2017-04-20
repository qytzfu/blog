<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<!--  
html5的定义,如果不这么定义编辑器格式会有问题  
-->
<html>  
<head>  
  <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>  
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">  
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>  
  
  <link href="http://cdn.bootcss.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">  
  <link rel="stylesheet" href="http://cdn.bootcss.com/summernote/0.5.1/summernote.css" />  
  <script src="http://cdn.bootcss.com/summernote/0.5.1/summernote.min.js"></script></span> 
   
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Insert title here</title>  
</head>  
<body>  
    <div class="container">  
        <div id="summernote">Hello summernote</div>
        <button id="buttonId" class="btn btn-lg btn-primary btn-block" type="button">登录</button></form> 
    </div>
    
<script> 
$(document).ready(function() {  
  $('#summernote').summernote({  
      height:300,  
      focus:true,  
      maxHeight:null,  
      minHeight:null,  
  });  
}); 

var content = $('#summernote').summernote('code');
alert(content);

$(function(){
	$('#buttonId').click(function(){
		$.ajax({  
		    type: "POST",  
		    url:"getBlog",  
		    data:{"content":content},
		    dataType:"json",
		    async: false, 
		    error: function(request) {  
		        alert("Connection error");  
		    },  
		    success: function(data) {
	            ajaxobj=eval(data);
		    	alert(ajaxobj.status);
		    	//javascript 不是用equals的
		    	//if(ajaxobj.status == "success")
		    	//	location.href = "../blog/show"; 
		    }
		});
	});
})





</script>  
</body>  
</html>  