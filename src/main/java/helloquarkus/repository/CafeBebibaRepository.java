package helloquarkus.repository;

import java.util.List;

import helloquarkus.model.CafeBebida;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class CafeBebibaRepository implements PanacheRepository<CafeBebida>{

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.count();
    }
    public List<CafeBebida> findbyname(String nome){
        if(nome == null){
            return null;

        }
        else{
            return find("UPPER(nome) LIKE ?1 ", "%"+nome.toUpperCase()+"%").list();
        }
    }
    @Override
    public void delete(CafeBebida entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.delete(entity);
    }

    @Override
    public long deleteAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.deleteAll();
    }

    @Override
    public PanacheQuery<CafeBebida> find(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.find(query, params);
    }

    @Override
    public PanacheQuery<CafeBebida> findAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.findAll();
    }

    @Override
    public boolean isPersistent(CafeBebida entity) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.isPersistent(entity);
    }

    @Override
    public void persist(CafeBebida entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.persist(entity);
    }

    @Override
    public int update(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.update(query, params);
    }
    
}
