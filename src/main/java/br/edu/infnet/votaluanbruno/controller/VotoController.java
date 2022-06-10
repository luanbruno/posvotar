package br.edu.infnet.votaluanbruno.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.votaluanbruno.model.domain.Eleicao;
import br.edu.infnet.votaluanbruno.model.domain.Voto;
import br.edu.infnet.votaluanbruno.model.service.CandidatoService;
import br.edu.infnet.votaluanbruno.model.service.EleicaoService;
import br.edu.infnet.votaluanbruno.model.service.EleitorService;
import br.edu.infnet.votaluanbruno.model.service.VotoService;

@Controller
public class VotoController {
	
	@Autowired
	private VotoService votoService;
	@Autowired
	private EleitorService eleitorService;
	@Autowired
	private EleicaoService eleicaoService;
	@Autowired
	private CandidatoService candidatoService;
	
	@GetMapping(value = "/voto")
	public String cadastro(Model model, @RequestParam Integer idEleicao) {
		
		Eleicao eleicao = eleicaoService.obterPorId(idEleicao);
		model.addAttribute("eleitores", eleitorService.obterLista());
		model.addAttribute("candidatos", candidatoService.obterListaEleicao(eleicao));
		model.addAttribute("eleicao", eleicao);

		return "voto/cadastro";
	}
	
	@GetMapping(value = "/votos")
	public String lista(Model model) {
		
		model.addAttribute("lista",votoService.obterLista());
		model.addAttribute("eleicoes", eleicaoService.obterLista());
		return "voto/lista";
		
	}
	
	
	@PostMapping(value = "/voto/incluir")
	public String incluir(Voto voto) {
		
		votoService.incluir(voto);
		return "redirect:/votos";
		
	}
	@GetMapping(value = "/voto/{id}/excluir")
	public String excluir(@PathVariable Integer id) {
		votoService.excluir(id);
		return "redirect:/votos";
	}
}
