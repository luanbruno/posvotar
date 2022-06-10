package br.edu.infnet.votaluanbruno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaluanbruno.model.domain.Eleicao;
import br.edu.infnet.votaluanbruno.model.service.EleicaoService;


@Component
public class EleicaoLoader implements ApplicationRunner{
	
	
	@Autowired
	private EleicaoService eleicaoService;
	
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
			
		Eleicao eleicao = new Eleicao();
		eleicao.setDescricao("primeira");

		try {
			eleicaoService.incluir(eleicao);
			System.out.println("(sucesso) Inclusao realizada !1!");
		} catch (Exception e) {
			System.out.println("(erro) "+ e.getMessage());
		}
		
	}
}
