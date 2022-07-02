package br.edu.infnet.votaluanbruno.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votaluanbruno.clients.EleitorClients;
import br.edu.infnet.votaluanbruno.model.domain.Eleitor;

@Service
public class EleitorService {
	
	@Autowired
	private EleitorClients eleitorclients;
	
	public void incluir(Eleitor eleitor) {
		eleitorclients.incluir(eleitor);

	}
	public List<Eleitor> obterLista(){
		return eleitorclients.obterLista();
	}
	
	public Eleitor obterPorId(Integer id) {
		return eleitorclients.obterPorId(id);
	}
	
	public void excluir(Integer id) {
		eleitorclients.excluir(id);

	}
}
