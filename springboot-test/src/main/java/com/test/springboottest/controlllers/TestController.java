package com.test.springboottest.controlllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TestController {

	@RequestMapping (method = RequestMethod.GET, value ="welcome")
	public ModelAndView firstPage() {
		return new ModelAndView("welcome");
	}
	
}
