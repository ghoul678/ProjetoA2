package helloquarkus.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Telefone {
    @JoinColumn
    @Id
    private Long id;
    @JoinColumn
    private String codigoArea;
    @JoinColumn
    private String numero;
    
  /*   public Telefone(Long id, String codigoArea, String numero) {
        this.id = id;
        this.codigoArea = codigoArea;
        this.numero = numero;
    } */
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCodigoArea() {
        return codigoArea;
    }
    public void setCodigoArea(String codigoArea) {
        this.codigoArea = codigoArea;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    
}
