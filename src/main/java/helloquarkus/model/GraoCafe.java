package helloquarkus.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
@Entity
public class GraoCafe {
    @JoinColumn
    @Id
    private Long id;
    @JoinColumn
    private String descricao;
    @JoinColumn
    private Date datavalidade;

    
    /* public GraoCafe(Long id, String descricao, Date datavalidade) {
        this.id = id;
        this.descricao = descricao;
        this.datavalidade = datavalidade;
    } */
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public Date getDatavalidade() {
        return datavalidade;
    }
    public void setDatavalidade(Date datavalidade) {
        this.datavalidade = datavalidade;
    }

    
}
