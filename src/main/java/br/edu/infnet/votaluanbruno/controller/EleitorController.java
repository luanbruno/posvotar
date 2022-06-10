package br.edu.infnet.votaluanbruno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.votaluanbruno.model.domain.Eleitor;
import br.edu.infnet.votaluanbruno.model.service.EleitorService;

@Controller
public class EleitorController {
	
	@Autowired
	private EleitorService eleitorService;
	
	@GetMapping(value = "/eleitor")
	public String cadastro() {
		return "eleitor/cadastro";
		
	}
	@GetMapping(value = "/eleitores")
	public String lista(Model model) {
		
		model.addAttribute("lista",eleitorService.obterLista());
		
		return "eleitor/lista";
		
	}
	
	@PostMapping(value = "/eleitor/incluir")
	
	public String incluir(Eleitor eleitor) {
		eleitorService.incluir(eleitor);
		return "redirect:/eleitores";
		
	}
	@GetMapping(value = "/eleitor/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		eleitorService.excluir(id);
		return "redirect:/eleitores";
	}
}
