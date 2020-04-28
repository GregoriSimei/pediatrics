package com.pediatrics.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pediatrics.app.model.Consulta;
import com.pediatrics.app.repository.ConsultaRepository;

@Controller
@RequestMapping("/consulta")
public class ConsultaController {

	@Autowired
	private ConsultaRepository consultaRepository;
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initialPage() {
		ModelAndView index = new ModelAndView("/consulta/index");
		Iterable<Consulta> consultas = consultaRepository.findAll();
		index.addObject("consultas", consultas);
		return index;
	}
	
}
