package com.pediatrics.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pediatrics.app.model.Doutor;
import com.pediatrics.app.repository.DoutorRepository;

@Controller
@RequestMapping("/doutor")
public class DoutorController {
	
	@Autowired
	private DoutorRepository DoutorRepository;
	
	@RequestMapping
	public ModelAndView initialPage() {
		ModelAndView index = new ModelAndView("/doutor/index");
		Iterable<Doutor> doutores = DoutorRepository.findAll();
		index.addObject("doutores",doutores);
		return index;
	}

}
