package helloquarkus.service;

import java.util.List;

import helloquarkus.DTO.CompraDTO;
import helloquarkus.model.ItemCompra;

public interface CompraService {
    
    CompraDTO  getValorTotalCompra();

    CompraDTO getItemsCompra();

    CompraDTO setItemsCompra(List<ItemCompra> itemsCompra);
}
