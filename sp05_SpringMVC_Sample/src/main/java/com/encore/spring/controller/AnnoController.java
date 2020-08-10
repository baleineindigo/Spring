package com.encore.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;
 
@org.springframework.stereotype.Controller
public class AnnoController {
	//annotation 하면 mvcbean.xml에 <bean name="/form.do" class="com.encore.spring.controller.FormController"/>쓸 필요 X
	//따라서 Controller에서 어떤 .do로 이동하는지 @로 지정해줘야 함.
	@RequestMapping("anno.do")
	public ModelAndView anno() {
		
		return new ModelAndView("anno_result","info","Annotation Good~~!!");
	}
}
