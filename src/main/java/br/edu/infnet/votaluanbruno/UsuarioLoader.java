package br.edu.infnet.votaluanbruno;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.votaluanbruno.model.domain.Role;
import br.edu.infnet.votaluanbruno.model.domain.Usuario;
import br.edu.infnet.votaluanbruno.model.service.RoleService;
import br.edu.infnet.votaluanbruno.model.service.UsuarioService;

@Component
@Order(1)
public class UsuarioLoader implements ApplicationRunner{

	@Autowired
	private RoleService roleService;

	@Autowired
	private UsuarioService usuarioService;

	@Override
	public void run(ApplicationArguments args) throws Exception {

		if (roleService.obterPornome("ROLE_ADMIN") == null) {
			roleService.incluir(new Role("ROLE_ADMIN"));
		}

		if (roleService.obterPornome("ROLE_USER") == null) {
			roleService.incluir(new Role("ROLE_USER"));
		}
				
		Usuario usuarioA = new Usuario();
		usuarioA.setEmail("admin@infnet.edu.br");
		usuarioA.setNome("luan");
		usuarioA.setRoles(Arrays.asList(new Role(1)));
		usuarioA.setSenha("123");
								
		Usuario usuarioB = new Usuario();
		usuarioB.setEmail("elis@elis.com");
		usuarioB.setNome("Elis");
		usuarioB.setRoles(Arrays.asList(new Role(2)));
		usuarioB.setSenha("123");

		
		if (usuarioService.findByEmail("admin@infnet.edu.br") == null && usuarioService.findByEmail("elis@elis.com") == null) {
			usuarioService.incluir(usuarioA);
			usuarioService.incluir(usuarioB);
		}
		
				
		
	}
	

}
