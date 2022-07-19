package br.edu.infnet.votaluanbruno.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.votaluanbruno.model.Repository.RoleRepository;
import br.edu.infnet.votaluanbruno.model.domain.Role;
@Service
public class RoleService {
	
	@Autowired
	private RoleRepository roleRepository; 

	public List<Role> obterLista(){
		return (List<Role>) roleRepository.findAll();
	}
	
	public void incluir(Role role) {
		roleRepository.save(role);
	}
		
	public Role obterPornome(String nome) {
		return roleRepository.findByNome(nome);
		
	}

}
