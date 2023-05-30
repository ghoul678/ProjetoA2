package helloquarkus.repository;

import java.util.List;

import helloquarkus.model.Municipio;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class MunicipioRepository implements PanacheRepository<Municipio> {

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.count();
    }

    @Override
    public void delete(Municipio entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.delete(entity);
    }

    @Override
    public long deleteAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.deleteAll();
    }

    @Override
    public PanacheQuery<Municipio> find(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.find(query, params);
    }

    @Override
    public PanacheQuery<Municipio> findAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.findAll();
    }

    @Override
    public boolean isPersistent(Municipio entity) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.isPersistent(entity);
    }
    public List<Municipio> findbyname(String nome){
        if(nome == null){
            return null;

        }
        else{
            return find("UPPER(nome) LIKE ?1 ", "%"+nome.toUpperCase()+"%").list();
        }
    }
    @Override
    public void persist(Municipio entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.persist(entity);
    }

    @Override
    public int update(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.update(query, params);
    }
    
}
