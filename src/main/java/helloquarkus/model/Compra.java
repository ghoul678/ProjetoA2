package helloquarkus.model;

import java.sql.Date;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Compra {
    @JoinColumn
    @Id    
    private Long id;
    @JoinColumn    
    private Date datacompra;
    @JoinColumn    
    private Double totalCompra;
    @ElementCollection  
    @OneToOne
    private ItemCompra itemcompra;
    @JoinColumn   
    @ManyToOne 
    private Usuario usuariocompra;
    @JoinColumn   
    @ManyToOne 
    private Endereco enderecocompra;
    @JoinColumn
    @OneToOne
    private Pagamento pagamentocompra;
    
    public Usuario getUsuariocompra() {
        return usuariocompra;
    }

    public void setUsuariocompra(final Usuario usuariocompra) {
        this.usuariocompra = usuariocompra;
    }
/* 
    public Compra(Usuario usuariocompra,Long id, Date datacompra, Double totalCompra) {
        this.id = id;
        this.datacompra = datacompra;
        this.totalCompra = totalCompra;
        this.itemcompra = itemcompra;
        this.usuariocompra = usuariocompra;

    } */
    
    public ItemCompra getItemcompra() {
        return itemcompra;
    }
    public void setItemcompra(final ItemCompra itemcompra) {
        this.itemcompra = itemcompra;
    }

    public Long getId() {
        return id;
    }
    public void setId(final Long id) {
        this.id = id;
    }
    public Date getDatacompra() {
        return datacompra;
    }
    public void setDatacompra(final Date datacompra) {
        this.datacompra = datacompra;
    }
    public Double getTotalCompra() {
        return totalCompra;
    }
    public void setTotalCompra(final Double totalCompra) {
        this.totalCompra = totalCompra;
    }

}
