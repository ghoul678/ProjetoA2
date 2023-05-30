package helloquarkus.repository;

import java.util.List;

import helloquarkus.model.Endereco;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class EnderecoRepository implements PanacheRepository<Endereco>  {

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.count();
    }
    public List<Endereco> findbyname(String nome){
        if(nome == null){
            return null;

        }
        else{
            return find("UPPER(nome) LIKE ?1 ", "%"+nome.toUpperCase()+"%").list();
        }
    }
    @Override
    public void delete(Endereco entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.delete(entity);
    }

    @Override
    public long deleteAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.deleteAll();
    }

    @Override
    public PanacheQuery<Endereco> find(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.find(query, params);
    }

    @Override
    public PanacheQuery<Endereco> findAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.findAll();
    }

    @Override
    public boolean isPersistent(Endereco entity) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.isPersistent(entity);
    }

    @Override
    public void persist(Endereco entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.persist(entity);
    }

    @Override
    public int update(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.update(query, params);
    }
    
}
