package helloquarkus.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
    
    public Usuario getUsuariocompra() {
        return usuariocompra;
    }

    public void setUsuariocompra(Usuario usuariocompra) {
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
    public void setItemcompra(ItemCompra itemcompra) {
        this.itemcompra = itemcompra;
    }

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

}
