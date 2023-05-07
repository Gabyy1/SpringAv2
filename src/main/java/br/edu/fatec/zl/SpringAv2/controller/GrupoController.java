package br.edu.fatec.zl.SpringAv2.controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.edu.fatec.zl.SpringAv2.model.Grupo;
import br.edu.fatec.zl.SpringAv2.persistence.GrupoDao;

@Controller
public class GrupoController {
	
	@Autowired
	GrupoDao iDao;
	
	@RequestMapping(name= "grupo", value= "/grupo", method = RequestMethod.GET)
	public ModelAndView init(ModelMap model) {
		List<Grupo> grupo = new ArrayList<Grupo>();
		String erro = "";
		
		try {
			grupo = iDao.listarGrupos();
		
		} catch (ClassNotFoundException | SQLException e) {
			erro = e.getMessage();
		
		}finally {
			model.addAttribute("grupo", grupo);
			model.addAttribute("erro", erro);
		}
	
		return new ModelAndView("grupo");
		
	}
			
		}


