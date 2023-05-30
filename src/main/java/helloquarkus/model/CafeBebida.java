package helloquarkus.model;

import jakarta.enterprise.inject.Default;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CafeBebida extends Produto{
    @JoinColumn
    private Integer estoque;
    
    @JoinColumn
    @ManyToOne
    private GraoCafe graoCafe;
    
    @JoinColumn
    private TipoBebida tipoBebida;

 /*    public CafeBebida(Long id, String nome, String descricao, Double preco, Integer estoque, GraoCafe graoCafe,
            TipoBebida tipoBebida) {
        super(id, nome, descricao, preco);
        this.estoque = estoque;
        this.graoCafe = graoCafe;
        this.tipoBebida = tipoBebida;
    }  */
    public GraoCafe getGraoCafe() {
        return graoCafe;
    }

    public void setGraoCafe(GraoCafe graoCafe) {
        this.graoCafe = graoCafe;
    }

   


    public Integer getEstoque() {
        return estoque;
    }

    public void setEstoque(Integer estoque) {
        this.estoque = estoque;
    }

    @Override
    public String getDescricao() {
        // TODO Auto-generated method stub
        return super.getDescricao();
    }

    @Override
    public Long getId() {
        // TODO Auto-generated method stub
        return super.getId();
    }

    @Override
    public String getNome() {
        // TODO Auto-generated method stub
        return super.getNome();
    }

    @Override
    public Double getPreco() {
        // TODO Auto-generated method stub
        return super.getPreco();
    }

    @Override
    public void setDescricao(String descricao) {
        // TODO Auto-generated method stub
        super.setDescricao(descricao);
    }

    @Override
    public void setId(Long id) {
        // TODO Auto-generated method stub
        super.setId(id);
    }

    @Override
    public void setNome(String nome) {
        // TODO Auto-generated method stub
        super.setNome(nome);
    }

    @Override
    public void setPreco(Double preco) {
        // TODO Auto-generated method stub
        super.setPreco(preco);
    }
    
}
