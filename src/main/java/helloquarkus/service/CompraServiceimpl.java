package helloquarkus.service;

import java.util.List;

import helloquarkus.DTO.CompraDTO;
import helloquarkus.model.ItemCompra;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class CompraServiceimpl implements CompraService{

    @Override
    public CompraDTO getValorTotalCompra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getValorTotalCompra'");
    }

    @Override
    public CompraDTO getItemsCompra() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getItemsCompra'");
    }

    @Override
    public CompraDTO setItemsCompra(List<ItemCompra> itemsCompra) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setItemsCompra'");
    }
    
}
