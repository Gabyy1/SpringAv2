package br.edu.fatec.zl.SpringAv2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class GrupoController {
	
	@RequestMapping(name= "grupo", value= "/grupo", method = RequestMethod.GET)
	public ModelAndView init(ModelMap model) {
		return  null;
		
	}
	
	@RequestMapping(name= "grupo", value= "/grupo", method = RequestMethod.POST)
	public ModelAndView grupo(ModelMap model) {
		return  null;
		
	}

}
