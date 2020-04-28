package com.pediatrics.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DefaultController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initialPage() {
		ModelAndView index = new ModelAndView("/index");
		return index;
	}
	
}
