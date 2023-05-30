package helloquarkus.service;

import java.util.List;



import helloquarkus.DTO.EstadoDTO;
import helloquarkus.repository.EstadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class EstadoServiceimpl implements EstadoService {

    @jakarta.inject.Inject
    EstadoRepository estadoRepository;
 
    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public EstadoDTO create(EstadoDTO productDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public EstadoDTO findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<EstadoDTO> findByNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<EstadoDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public EstadoDTO update(Long id, EstadoDTO productDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
