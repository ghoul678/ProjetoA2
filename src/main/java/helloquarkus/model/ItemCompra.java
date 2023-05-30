package helloquarkus.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ItemCompra {
    @JoinColumn
    @Id
    private Long id;
    @JoinColumn
    private Integer quantidade;
    @JoinColumn
   private Double preco;
   @JoinColumn
   @ManyToOne
   private Produto CafeBebida;
/* public ItemCompra(Long id, Integer quantidade, Double preco) {
    this.id = id;
    this.quantidade = quantidade;
    this.preco = preco;
} */

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public Integer getQuantidade() {
    return quantidade;
}
public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
}
public Double getPreco() {
    return preco;
}
public void setPreco(Double preco) {
    this.preco = preco;
}

   
 
}
