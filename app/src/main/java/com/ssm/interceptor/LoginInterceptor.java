package com.ssm.interceptor;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ssm.pojo.Author;
import com.ssm.service.impl.AuthorService;

public class LoginInterceptor implements HandlerInterceptor {
//	@Autowired
//	private AuthorService authorService;
	
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		
		//现在是全部拦截，以后修改成 url-pattern 然后 还有登录页面的不拦截
//		HttpSession session = request.getSession();
//		String username = (String)session.getAttribute("username");
//		if(username != null)
//			return true;
//		else
//		{
//            request.getRequestDispatcher("/login.jsp").forward(request,response);  
//			return false;
//		}
        
 
//        String loginCookieUserName = "";  
//        String loginCookiePassword = "";  
//          
//        Cookie[] cookies = request.getCookies();  
//        if(null!=cookies){    
//            for(Cookie cookie : cookies){    
//                //if("/".equals(cookie.getPath())){ //getPath为null  
//                    if("loginUserName".equals(cookie.getName())){  
//                        loginCookieUserName = cookie.getValue();  
//                    }else if("loginPassword".equals(cookie.getName())){  
//                        loginCookiePassword = cookie.getValue();  
//                    }  
//                //}  
//            }    
//            if(!"".equals(loginCookieUserName) && !"".equals(loginCookiePassword)){  
//                Author author = authorService.findByName(loginCookieUserName);
//                if(loginCookiePassword.equals(author.getPassword())){  
//                	return true;
//                }  
//            }  
//        }   
        return true;
 
	}
//	
//    public boolean preHandle(HttpServletRequest request,  
//            HttpServletResponse response, Object handler) throws Exception {            
//        if ("GET".equalsIgnoreCase(request.getMethod())) {
//                RequestUtil.saveRequest();
//        }
//        log.info("==============执行顺序: 1、preHandle================");  
//        String requestUri = request.getRequestURI();
//        String contextPath = request.getContextPath();
//        String url = requestUri.substring(contextPath.length());         
//        if ("/userController/login".equals(url)) {                  
//                return true;
//        }else {               
//                String username =  (String)request.getSession().getAttribute("user"); 
//                if(username == null){
//                        log.info("Interceptor：跳转到login页面！");
//                        request.getRequestDispatcher("/page/index.jsp").forward(request, response);
//                        return false;
//                }else
//                        return true;   
//       }
//        
//    }     
	
	
	
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// TODO Auto-generated method stub
		
	}
}
