package br.edu.infnet.votaluanbruno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class VotaluanbrunoApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotaluanbrunoApplication.class, args);
	}

}
