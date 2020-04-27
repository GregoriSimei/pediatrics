package com.pediatrics.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pediatrics.app.model.Responsavel;
import com.pediatrics.app.repository.ResponsavelRepository;

@Controller
@RequestMapping("/responsavel")
public class ResponsavelController {
	
	@Autowired
	private ResponsavelRepository responsavelRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView responsavelPage() {
		ModelAndView index = new ModelAndView("/responsavel/index");
		Iterable<Responsavel> responsaveis = responsavelRepository.findAll();
		index.addObject("responsaveis", responsaveis);
		return index;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView responsavelPage(@PathVariable("id") Long id) {
		ModelAndView responsavelInfoPage = new ModelAndView("/responsavel/responsavelInfo");
		Responsavel responsavel = responsavelRepository.findById(id);
		responsavelInfoPage.addObject("responsavel", responsavel);
		return responsavelInfoPage;
	}

}
