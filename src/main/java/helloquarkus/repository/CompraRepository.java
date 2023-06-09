package helloquarkus.repository;

import java.util.List;

import helloquarkus.model.Compra;
import io.quarkus.hibernate.orm.panache.PanacheQuery;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

public class CompraRepository implements PanacheRepository<Compra> {

    @Override
    public void delete(Compra entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.delete(entity);
    }

    @Override
    public PanacheQuery<Compra> find(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.find(query, params);
    }

    @Override
    public PanacheQuery<Compra> findAll() {
        // TODO Auto-generated method stub
        return PanacheRepository.super.findAll();
    }

    @Override
    public List<Compra> list(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.list(query, params);
    }

    @Override
    public void persist(Compra entity) {
        // TODO Auto-generated method stub
        PanacheRepository.super.persist(entity);
    }

    @Override
    public int update(String query, Object... params) {
        // TODO Auto-generated method stub
        return PanacheRepository.super.update(query, params);
    }
    
}
