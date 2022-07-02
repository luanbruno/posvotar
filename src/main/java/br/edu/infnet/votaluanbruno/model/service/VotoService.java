package br.edu.infnet.votaluanbruno.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votaluanbruno.clients.VotoClients;
import br.edu.infnet.votaluanbruno.model.domain.Voto;


@Service
public class VotoService {
	@Autowired
	private VotoClients votoClients;
	
	public void incluir(Voto voto) {
		votoClients.incluir(voto);

	}
	public List<Voto> obterLista(){
		return (List<Voto>) votoClients.obterLista();
	}
	public void excluir(Integer id) {
		votoClients.excluir(id);

	}
}
