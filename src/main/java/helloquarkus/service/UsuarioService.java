package helloquarkus.service;

import java.util.List;

import helloquarkus.DTO.UsuarioDTO;

public interface UsuarioService {
    // recursos basicos
    List<UsuarioDTO> getAll();

    UsuarioDTO findById(Long id);

    UsuarioDTO create(UsuarioDTO productDTO);

    UsuarioDTO update(Long id, UsuarioDTO productDTO);

    void delete(Long id);

    // recursos extras

    List<UsuarioDTO> findByNome(String nome);

    long count();
}
