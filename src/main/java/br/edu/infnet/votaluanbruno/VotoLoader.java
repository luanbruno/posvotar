package br.edu.infnet.votaluanbruno;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;


@Component
public class VotoLoader implements ApplicationRunner{
	
		
	@Override
	public void run(ApplicationArguments args) throws Exception {

		try {

			System.out.println("(sucesso) Inclusao realizada !1!");
		} catch (Exception e) {
			System.out.println("(erro) "+ e.getMessage());
		}
		
	}
}
