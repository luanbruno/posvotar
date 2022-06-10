package br.edu.infnet.votaluanbruno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaluanbruno.model.domain.Eleitor;
import br.edu.infnet.votaluanbruno.model.service.EleitorService;


@Component
public class EleitorLoader implements ApplicationRunner{
	
	
	@Autowired
	private EleitorService EleitorService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
			
		Eleitor eleitor = new Eleitor();
			eleitor.setCodigo("3232");
			eleitor.setNome("luan");
			eleitor.setEmail("luan@luan.com");
			eleitor.setTelefone("5555-5555");
			eleitor.setToken("1597849");
		try {
			EleitorService.incluir(eleitor);
			System.out.println("(sucesso) Inclusao realizada !1!");
		} catch (Exception e) {
			System.out.println("(erro) "+ e.getMessage());
		}
		
	}
}
