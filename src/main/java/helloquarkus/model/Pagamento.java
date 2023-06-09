package helloquarkus.model;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
@Entity
public class Pagamento {
    @Id
    @JoinColumn
    Long id;
    @JoinColumn
    Date datacompra;
    @JoinColumn
    Double totalCompra;
    @JoinColumn
    Integer quantParcelas;
    @JoinColumn
    Integer quantParcelasPagas;
    @JoinColumn
    TipoPagamento tipopagamento;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Date getDatacompra() {
        return datacompra;
    }
    public void setDatacompra(Date datacompra) {
        this.datacompra = datacompra;
    }
    public Double getTotalCompra() {
        return totalCompra;
    }
    public void setTotalCompra(Double totalCompra) {
        this.totalCompra = totalCompra;
    }
    public Integer getQuantParcelas() {
        return quantParcelas;
    }
    public void setQuantParcelas(Integer quantParcelas) {
        this.quantParcelas = quantParcelas;
    }
    public Integer getQuantParcelasPagas() {
        return quantParcelasPagas;
    }
    public void setQuantParcelasPagas(Integer quantParcelasPagas) {
        this.quantParcelasPagas = quantParcelasPagas;
    }


}
