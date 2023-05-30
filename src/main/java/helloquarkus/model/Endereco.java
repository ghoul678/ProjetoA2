package helloquarkus.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Endereco {
    @JoinColumn
    @Id
    private Long id;
    @JoinColumn
    private Boolean principal;
    @JoinColumn
    private String logradouro;
    @JoinColumn
    private String bairro;
    @JoinColumn
    private String numero;
    @JoinColumn
    private String complemento;
    @JoinColumn
 private String cep;
    @JoinColumn
    @ManyToOne
 private Municipio municipioendereco;
/* public Endereco(Long id, Boolean principal, String logradouro, String bairro, String numero, String complemento,
 String cep) {

    this.id = id;
    this.principal = principal;
    this.logradouro = logradouro;
    this.bairro = bairro;
    this.numero = numero;
    this.complemento = complemento;
    this.cep = cep;
} */

public Long getId() {
    return id;
}
public void setId(Long id) {
    this.id = id;
}
public Boolean getPrincipal() {
    return principal;
}
public void setPrincipal(Boolean principal) {
    this.principal = principal;
}
public String getLogradouro() {
    return logradouro;
}
public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
}
public String getBairro() {
    return bairro;
}
public void setBairro(String bairro) {
    this.bairro = bairro;
}
public String getNumero() {
    return numero;
}
public void setNumero(String numero) {
    this.numero = numero;
}
public String getComplemento() {
    return complemento;
}
public void setComplemento(String complemento) {
    this.complemento = complemento;
}
public String getCep() {
    return cep;
}
public void setCep(String cep) {
    this.cep = cep;
}

 
}
