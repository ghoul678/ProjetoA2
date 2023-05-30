package helloquarkus.service;

import java.util.List;

import helloquarkus.DTO.MunicipioDTO;

public interface MunicipioService {
    // recursos basicos
    List<MunicipioDTO> getAll();

    MunicipioDTO findById(Long id);

    MunicipioDTO create(MunicipioDTO productDTO);

    MunicipioDTO update(Long id, MunicipioDTO productDTO);

    void delete(Long id);

    // recursos extras

    List<MunicipioDTO> findByNome(String nome);

    long count();
}
