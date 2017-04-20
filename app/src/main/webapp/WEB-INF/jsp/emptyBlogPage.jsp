<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" /> 
  <title>summernote</title>
  <!-- include jquery -->
  <script src="//code.jquery.com/jquery-1.11.3.min.js"></script> 

  <!-- include libraries BS3 -->
  <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.1/css/bootstrap.min.css" />
  <script type="text/javascript" src="//netdna.bootstrapcdn.com/bootstrap/3.0.1/js/bootstrap.min.js"></script>

  <!-- include summernote -->
  <link href="http://cdn.bootcss.com/font-awesome/4.2.0/css/font-awesome.min.css" rel="stylesheet">  
  
  <link rel="stylesheet" href="http://cdn.bootcss.com/summernote/0.5.1/summernote.css" />  
  <script src="http://cdn.bootcss.com/summernote/0.5.1/summernote.min.js"></script></span> 


  <script type="text/javascript">
    $(function() {
      $('.summernote').summernote({
        height: 200
      });
      $('form').on('submit', function (e) {
    	  
        //e.preventDefault();
        //alert($('.summernote').summernote('code'));
        alert($('.summernote').val());
		//这里ajax 提交出错了
      });
    });
  </script>
</head>
<body>
<form action="saveBlog" novalidate>
  <div class="form-group">
    <label for="input">Text</label>
    <input type="text" class="form-input" id="input" value="Title" name="title">
  </div>
  <div class="form-group">
    <label for="contents">Contents</label>
    <textarea name="content" class="summernote" id="contents" title="Contents"></textarea>
  </div>
  <button type="submit" class="btn btn-default">submit</button>
</form>
</body>
</html>
