package br.edu.infnet.votaluanbruno.model.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.votaluanbruno.model.domain.Usuario;

@Repository
public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

	Usuario findByEmail(String email);

}
