package br.edu.infnet.votaluanbruno.clients;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.edu.infnet.votaluanbruno.model.domain.Eleicao;

@FeignClient(url = "localhost:8080/api/eleicao", name = "eleicaoClient")
public interface EleicaoClients {

	@GetMapping(value = "/{idEleicao}/listar")
	public Eleicao obterPorId(@PathVariable Integer idEleicao);

	@GetMapping(value = "/listar")
	public List<Eleicao> obterLista();

	@PostMapping(value = "/incluir")
	public void incluir(@RequestBody Eleicao eleicao);

	@DeleteMapping(value = "/{id}/excluir")
	public void excluir(@PathVariable Integer id);
}
