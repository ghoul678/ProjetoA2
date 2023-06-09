package helloquarkus.repository;

import java.util.List;

import helloquarkus.model.Usuario;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class usuariorepository implements PanacheRepository<Usuario> {

    public Usuario findByEmailAndSenha(String email, String senha){
        if (email == null || senha == null)
            return null;
            
        return find("email = ?1 AND senha = ?2 ", email, senha).firstResult();
    }
    
    @Override
    public long count() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.count();
    }

   

    @Override
    public boolean deleteById(Long id) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.deleteById(id);
    }



    @Override
    public long deleteAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.deleteAll();
    }

    /* @Override
    public PanacheQuery<Usuario> find(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.find(query, params);
    } */

    @Override
    public PanacheQuery<Usuario> findAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.findAll();
    }

    @Override
    public void persist(Usuario entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.persist(entity);
    }

    @Override
    public int update(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.update(query, params);
    }

    public List<Usuario> findbyname(String nome){
        if(nome == null){
            return null;

        }
        else{
            return find("UPPER(nome) LIKE ?1 ", "%"+nome.toUpperCase()+"%").list();
        }
    }

    @Override
    public Usuario findById(Long id) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.findById(id);
    }
    
}
