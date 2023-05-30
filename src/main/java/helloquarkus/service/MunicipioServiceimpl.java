package helloquarkus.service;

import java.util.List;



import helloquarkus.DTO.MunicipioDTO;
import helloquarkus.repository.EstadoRepository;
import helloquarkus.repository.MunicipioRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class MunicipioServiceimpl implements MunicipioService {
    
    @jakarta.inject.Inject
    MunicipioRepository municipioRepository;
    @jakarta.inject.Inject
    EstadoRepository estadoRepository;

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public MunicipioDTO create(MunicipioDTO productDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public MunicipioDTO findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<MunicipioDTO> findByNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    public MunicipioServiceimpl(MunicipioRepository municipioRepository) {
        this.municipioRepository = municipioRepository;
    }

    @Override
    public List<MunicipioDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public MunicipioDTO update(Long id, MunicipioDTO productDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
