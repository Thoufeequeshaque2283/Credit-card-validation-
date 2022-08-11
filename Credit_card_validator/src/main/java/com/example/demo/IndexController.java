package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller 
public class IndexController {
 
     @RequestMapping("home") 
     public ModelAndView index(Mainpojo user) 
     	{
    	 ModelAndView mav = new ModelAndView();
     		mav.setViewName("index.jsp");
     		return mav; 
     	} 
     @RequestMapping("input") 
     public ModelAndView input(Mainpojo user) 
     	{
    	 System.out.println(user.getId());
     		ModelAndView mav = new ModelAndView();
     		mav.addObject("userInfo", user); 
     		mav.setViewName("index2.jsp");
     		return mav; 
     	} 
}
