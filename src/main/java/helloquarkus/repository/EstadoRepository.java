package helloquarkus.repository;

import java.util.List;

import helloquarkus.model.Estado;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class EstadoRepository implements PanacheRepository<Estado> {

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.count();
    }

    @Override
    public void delete(Estado entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.delete(entity);
    }
    public List<Estado> findbyname(String nome){
        if(nome == null){
            return null;

        }
        else{
            return find("UPPER(nome) LIKE ?1 ", "%"+nome.toUpperCase()+"%").list();
        }
    }
    @Override
    public long deleteAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.deleteAll();
    }

    @Override
    public PanacheQuery<Estado> find(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.find(query, params);
    }

    @Override
    public boolean isPersistent(Estado entity) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.isPersistent(entity);
    }

    @Override
    public void persist(Estado entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.persist(entity);
    }

    @Override
    public int update(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.update(query, params);
    }
    
}
