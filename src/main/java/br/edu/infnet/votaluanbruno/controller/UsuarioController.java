package br.edu.infnet.votaluanbruno.controller;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.votaluanbruno.model.domain.Role;
import br.edu.infnet.votaluanbruno.model.domain.Usuario;
import br.edu.infnet.votaluanbruno.model.service.RoleService;
import br.edu.infnet.votaluanbruno.model.service.UsuarioService;

@Controller
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;
	@Autowired
	private RoleService roleService;
	

	@GetMapping(value = "/usuario")
	public String telaCadastro(Model model) {

		model.addAttribute("roles", roleService.obterLista());

		return "usuario/cadastro";
	}

	@PostMapping(value = "/usuario/incluir")
	public String incluir(Model model, Usuario usuario,@RequestParam Integer acesso) {

		
		usuario.setRoles(Arrays.asList(new Role(acesso)));
		
		usuarioService.incluir(usuario);

		model.addAttribute("mensagem", "O usuário " + usuario.getNome() + " foi cadastrado com sucesso!!!");

		return "redirect:/";
	}

}
