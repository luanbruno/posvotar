package br.edu.infnet.votaluanbruno.model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.votaluanbruno.model.domain.Role;
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer>{

	Role findByNome(String nome);

}
