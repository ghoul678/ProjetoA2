package helloquarkus.DTO;

import java.sql.Date;

import helloquarkus.model.Compra;
import helloquarkus.model.ItemCompra;

public class CompraDTO {
    
    private Date dataCompra;
    private ItemCompra itemsCompra;
    private Compra valorTotalCompra;
   
    public Date getDataCompra() {
        return dataCompra;
    }
    public void setDataCompra(Date dataCompra) {
        this.dataCompra = dataCompra;
    }
    public ItemCompra getItemsCompra() {
        return itemsCompra;
    }
    public void setItemsCompra(ItemCompra itemsCompra) {
        this.itemsCompra = itemsCompra;
    }
    public Compra getValorTotalCompra() {
        return valorTotalCompra;
    }
    public void setValorTotalCompra(Compra valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
    

}
