package com.pediatrics.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.pediatrics.app.model.Crianca;
import com.pediatrics.app.repository.CriancaRepository;

@Controller
@RequestMapping("/crianca")
public class CriancaController {
	
	@Autowired
	private CriancaRepository criancaRepository;

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView initialPage() {
		ModelAndView index = new ModelAndView("/crianca/index");
		Iterable<Crianca> criancas = criancaRepository.findAll();
		index.addObject("criancas", criancas);
		return index;
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.GET)
	public ModelAndView formPage(){
		ModelAndView cadastro = new ModelAndView("/crianca/cadastrar");
		return cadastro;
	}
	
	@RequestMapping(value = "/cadastrar", method = RequestMethod.POST)
	public String formPage(Crianca crianca){
		System.out.println(crianca.getNascimento());
		criancaRepository.save(crianca);
		return "redirect:/crianca/cadastrar";
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ModelAndView criancaPage(@PathVariable("id") Long id) {
		ModelAndView infoCrianca = new ModelAndView("/crianca/criancaInfo");
		Crianca crianca = criancaRepository.findById(id);
		infoCrianca.addObject("crianca", crianca);
		return infoCrianca;
	}
	
}
