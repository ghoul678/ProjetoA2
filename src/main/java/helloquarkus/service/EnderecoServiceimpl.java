package helloquarkus.service;

import java.util.List;



import helloquarkus.DTO.EnderecoDTO;
import helloquarkus.repository.EnderecoRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class EnderecoServiceimpl implements EnderecoService{
    @jakarta.inject.Inject
    EnderecoRepository enderecoRepository;
    
    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public EnderecoDTO create(EnderecoDTO productDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public EnderecoDTO findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<EnderecoDTO> findByNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<EnderecoDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public EnderecoServiceimpl(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }

    @Override
    public EnderecoDTO update(Long id, EnderecoDTO productDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    
}
