package br.edu.infnet.votaluanbruno.controller;

import javax.servlet.http.HttpSession;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.votaluanbruno.model.domain.Usuario;

@Controller
public class AppController {
	
	@GetMapping(value = "/")
	public String index() {
		return "index";
		
	}
	@GetMapping(value = "/login")
	public String telaLogin() {
		return "login";
	}
	@GetMapping(value = "/negado")
	public String telaNegado() {
		return "negado";
	}


	@GetMapping(value = "/logout")
	public String telalogout(HttpSession session, SessionStatus status) {

		status.setComplete();

		session.removeAttribute("user");

		return "redirect:/";
	}

	@PostMapping(value = "/login")
	public String login(Model model, @AuthenticationPrincipal Usuario usuario) {
			return "redirect:/";

	}
	
}
