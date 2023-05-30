package helloquarkus.service;

import java.util.List;

import helloquarkus.DTO.EnderecoDTO;

public interface EnderecoService {
    // recursos basicos
    List<EnderecoDTO> getAll();

    EnderecoDTO findById(Long id);

    EnderecoDTO create(EnderecoDTO productDTO);

    EnderecoDTO update(Long id, EnderecoDTO productDTO);

    void delete(Long id);

    // recursos extras

    List<EnderecoDTO> findByNome(String nome);

    long count();
}
