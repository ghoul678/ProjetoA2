package helloquarkus.service;

import java.util.List;



import helloquarkus.DTO.UsuarioDTO;
import helloquarkus.model.Usuario;
import helloquarkus.repository.usuariorepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class UsuarioServiceimpl implements UsuarioService {
    @jakarta.inject.Inject
    usuariorepository usuariorepository;

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public UsuarioDTO create(UsuarioDTO productDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public UsuarioDTO findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UsuarioDTO> findByNome(String nome) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<UsuarioDTO> getAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public UsuarioServiceimpl(helloquarkus.repository.usuariorepository usuariorepository) {
        this.usuariorepository = usuariorepository;
    }

    @Override
    public UsuarioDTO update(Long id, UsuarioDTO productDTO) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Usuario findByEmailAndSenha(String email, String senha) {
        return usuariorepository.findByEmailAndSenha(email, senha);
    }

    
}
