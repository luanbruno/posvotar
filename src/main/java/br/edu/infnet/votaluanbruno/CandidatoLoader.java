package br.edu.infnet.votaluanbruno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaluanbruno.model.domain.Candidato;
import br.edu.infnet.votaluanbruno.model.service.CandidatoService;


@Component
public class CandidatoLoader implements ApplicationRunner{
	
	
	//@Autowired
	//private CandidatoRepository candidatoRepository;
	@Autowired
	private CandidatoService candidatoService;
	
	@Override
	public void run(ApplicationArguments args) throws Exception {
			
		Candidato candidato = new Candidato();
		candidato.setNome("Luan bruno");
		candidato.setNumero(444);
		try {
			candidatoService.incluir(candidato);
			//candidatoRepository.save(candidato);
			System.out.println("(sucesso) Inclusao realizada !1!");
		} catch (Exception e) {
			System.out.println("(erro) "+ e.getMessage());
		}
		
	}
}
