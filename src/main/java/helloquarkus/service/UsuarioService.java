package helloquarkus.service;

import java.util.List;

import helloquarkus.DTO.UsuarioDTO;
import helloquarkus.model.Usuario;
import helloquarkus.repository.usuariorepository;

public interface UsuarioService {
    // recursos basicos
    List<UsuarioDTO> getAll();

    UsuarioDTO findById(Long id);

    UsuarioDTO create(UsuarioDTO productDTO);

    UsuarioDTO update(Long id, UsuarioDTO productDTO);
    
    Usuario findByEmailAndSenha(String email, String senha);
    
    Usuario findByEmail(String email);

    void delete(Long id);

    // recursos extras

    List<UsuarioDTO> findByNome(String nome);

    long count();
}
