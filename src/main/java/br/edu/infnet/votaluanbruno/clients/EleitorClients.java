package br.edu.infnet.votaluanbruno.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.votaluanbruno.model.domain.Eleitor;

@FeignClient(url = "localhost:8080/api/eleitor", name = "eleitorClient")
public interface EleitorClients {


	@GetMapping(value = "/{idEleitor}/listar")
	public Eleitor obterPorId(@PathVariable Integer idEleitor);

	@GetMapping(value = "/listar")
	public List<Eleitor> obterLista();

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Eleitor eleitor);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
}
