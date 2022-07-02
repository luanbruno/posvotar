package br.edu.infnet.votaluanbruno.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votaluanbruno.clients.EleicaoClients;
import br.edu.infnet.votaluanbruno.model.domain.Eleicao;


@Service
public class EleicaoService {

	@Autowired
	private EleicaoClients eleicaoClients;
	
	public void incluir(Eleicao eleicao) {
		eleicaoClients.incluir(eleicao);

	}
	public List<Eleicao> obterLista(){
		return eleicaoClients.obterLista();
	}
	
	public Eleicao obterPorId(Integer id) {
		return eleicaoClients.obterPorId(id);
	}
	public void excluir(Integer id) {
		eleicaoClients.excluir(id);

	}
}
