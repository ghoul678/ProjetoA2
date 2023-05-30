package helloquarkus.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;

@Entity
public class Municipio {
    @JoinColumn
    @Id
    private Long id;
    @JoinColumn
    private String nome;
    
   /*  public Municipio(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    } */
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
}
