package com.lab8;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(HttpServletRequest request,HttpServletResponse response) {
		
		int a=Integer.parseInt(request.getParameter("Age"));
		String name=request.getParameter("stdName").toString();
		String dept=request.getParameter("dept").toString();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("name",name);
		mv.addObject("age",a);
		mv.addObject("dept",dept);
		return mv;
	}

}
