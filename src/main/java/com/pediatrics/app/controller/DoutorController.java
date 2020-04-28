package com.pediatrics.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pediatrics.app.model.Doutor;
import com.pediatrics.app.repository.DoutorRepository;

@Controller
@RequestMapping("/doutor")
public class DoutorController {
	
	@Autowired
	private DoutorRepository doutorRepository;
	
	@RequestMapping
	public ModelAndView initialPage() {
		ModelAndView index = new ModelAndView("/doutor/index");
		Iterable<Doutor> doutores = doutorRepository.findAll();
		index.addObject("doutores",doutores);
		return index;
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView doutorPage(@PathVariable("id") Long id) {
		ModelAndView doutorInfoPage = new ModelAndView("/doutor/doutorInfo");
		Doutor doutor = doutorRepository.findById(id);
		doutorInfoPage.addObject("doutor", doutor);
		return doutorInfoPage;
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public ModelAndView formPage(){
		ModelAndView cadastro = new ModelAndView("/doutor/cadastrar");
		return cadastro;
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String formPage(Doutor doutor){
		doutorRepository.save(doutor);
		return "redirect:/doutor/cadastrar";
	}

}
