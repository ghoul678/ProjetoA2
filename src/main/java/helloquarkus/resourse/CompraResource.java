package helloquarkus.resourse;

import java.util.List;



import helloquarkus.DTO.CompraDTO;
import helloquarkus.model.ItemCompra;
import helloquarkus.service.CompraService;
//import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;

@Path("/Compra")
public class CompraResource {

    @jakarta.inject.Inject
    CompraService compra;

    @GET
    public CompraDTO getValorTotalCompra() {
        return compra.getValorTotalCompra();
    }
    @GET
    public CompraDTO getItemsCompra() {
        return compra.getItemsCompra();
    }
    @POST
    public CompraDTO setItemsCompra(List<ItemCompra> itemsCompra) {
        return compra.setItemsCompra(itemsCompra);
    }
    
    @POST
    public CompraDTO getTotalCompra() {
        return compra.getTotalCompra();
    }

    
}
