package helloquarkus.DTO;

import java.sql.Date;

import helloquarkus.model.ItemCompra;

public class CompraDTO {
    private Double valorTotalCompra;
    private Date dataCompra;
    private ItemCompra itemsCompra;
    
    public Double getValorTotalCompra() {
        return valorTotalCompra;
    }
    public void setValorTotalCompra(Double valorTotalCompra) {
        this.valorTotalCompra = valorTotalCompra;
    }
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
    

}
