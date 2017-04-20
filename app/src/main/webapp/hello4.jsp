<%@page pageEncoding="utf-8" contentType="text/html;charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
      <head>
             <title>博客</title>
             <meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
     	     <meta name="viewport" content="width=device-width,height=device-height,inital-scale=1.0,maximum-scale=1.0,user-scalable=no;">

      </head>
      <body>
       		<div class="container">
        	      <div id="back_way">
            	    <a href ="/app/blog/allArticle">返回主页</a>
                 </div>
        		
        		   <div id="content" class="row-fluid">
            			   <h4>welcome</h4>
						   <form id="registerForm" action="submit.form" method="post">
   							    <div class="form-group">
    					                                   用户名:<input type="text" id="username" name="username" placeholder="">
    				            </div>
  				                <div class="form-group">
                                                                                                  密码:<input type="password" id="password" name="password" placeholder="Password">
                                </div>
  				                <div class="form-group">
                                                                                                  确认密码:<input type="password" id="repassword" name="repassword" placeholder="Password">
                                </div>
                                <!--  
                                <textarea  style="display:none" id="pubkey" rows="15" cols="65">${publicKey}</textarea>
                                -->
                                
                                <button type="submit" id="submitbtn" class="btn btn-default">注册</button>
                           </form>

                   </div>
            </div>
      </body>
</html>