package com.ssm.listener;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MySessionListener implements HttpSessionListener {  
	  
    @Override  
    public void sessionCreated(HttpSessionEvent se) {  
        //我们把创建的session封装在一个map中  
        Map<String, HttpSession> map =(Map<String, HttpSession>) se.getSession().getServletContext().getAttribute("onLines");  
        if(map==null){//说明这是第一次访问是，需要自己new 一个对象  
            map=Collections.synchronizedMap(new HashMap<String, HttpSession>());//采用集合上锁，采用java 自带的上锁函数  
            se.getSession().getServletContext().setAttribute("onLines", map);  
        }  
//      System.out.println("listener添加一个了");  
        map.put(se.getSession().getId(), se.getSession());//以session 的id为key,session对象为value存在map中  
    }  
  
    @Override  
    public void sessionDestroyed(HttpSessionEvent se) {  
    }
    
}  