package br.edu.infnet.votaluanbruno.model.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votaluanbruno.clients.CandidatoClients;
import br.edu.infnet.votaluanbruno.model.domain.Candidato;
import br.edu.infnet.votaluanbruno.model.domain.Eleicao;

@Service
public class CandidatoService {

	@Autowired
	private CandidatoClients candidatoClients;
	
	public void incluir(Candidato candidato) {
		candidatoClients.incluir(candidato);
	}
	
	public List<Candidato> obterLista(){
		return candidatoClients.obterLista();
	}
	public Candidato obterPorId(Integer id){
		return candidatoClients.obterPorId(id);
	}
	public void excluir(Integer id) {
		candidatoClients.excluir(id);

	}
	public List<Candidato> obterListaEleicao(Eleicao eleicao) {
		return candidatoClients.obterPorEleicao(eleicao.getId());
	}
}
