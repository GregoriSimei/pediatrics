package com.pediatrics.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pediatrics.app.model.Responsavel;
import com.pediatrics.app.repository.ResponsavelRepository;

@Controller
@RequestMapping("/responsavel")
public class ResponsavelController {
	
	@Autowired
	private ResponsavelRepository responsavelRepository;
	
	@RequestMapping
	public ModelAndView responsavelPage() {
		ModelAndView index = new ModelAndView("/responsavel/index");
		Iterable<Responsavel> responsaveis = responsavelRepository.findAll();
		index.addObject("responsaveis", responsaveis);
		return index;
	}

}
