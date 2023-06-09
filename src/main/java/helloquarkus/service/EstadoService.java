package helloquarkus.service;

import java.util.List;

import helloquarkus.DTO.EstadoDTO;
import helloquarkus.model.Estado;
import helloquarkus.repository.EstadoRepository;

public interface EstadoService {
      // recursos basicos
      /* List<Estado> getAll(); */

      EstadoDTO findById(Long id);
  
      EstadoDTO create(EstadoDTO productDTO);
  
      EstadoDTO update(Long id, EstadoDTO productDTO);
  
      void delete(Long id);
  
      // recursos extras
  
      List<EstadoDTO> findByNome(String nome);
  
      long count();

}
