package helloquarkus.model;
import java.util.Set;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.PrimaryKeyJoinColumn;

@Entity
public class Usuario {
    @JoinColumn
    @Id
    private Long id;
    @JoinColumn
    private String nome;
    @JoinColumn
    private String email;//;entenda como logind do usuario
    private String senha;
    @JoinColumn
    private String cpf;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Telefone whatsusuario;
    @PrimaryKeyJoinColumn
    @OneToOne
    private Telefone telefoneusuario;
    @JoinColumn
    @ManyToOne
    private Endereco endereco;
    @ElementCollection
    @CollectionTable(name = "perfis", joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "id"))
    @Column(name = "perfil", length = 30)
    private Set<Perfil> perfil;

   public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Set<Perfil> getPerfil() {
        return perfil;
    }

    public void setPerfil(Set<Perfil> perfil) {
        this.perfil = perfil;
    }


   /*  public Usuario(Long id, String nome, String email, String senha, String cpf, Telefone whatsusuario,
            Telefone telefoneusuario, Endereco endereco, Set<Perfil> perfis) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.cpf = cpf;
        this.whatsusuario = whatsusuario;
        this.telefoneusuario = telefoneusuario;
        this.endereco = endereco;
        this.perfis = perfis;
    } */

    public Telefone getWhatsusuario() {
        return whatsusuario;
    }

    public void setWhatsusuario(Telefone whatsusuario) {
        this.whatsusuario = whatsusuario;
    }

    public Telefone getTelefoneusuario() {
        return telefoneusuario;
    }

    public void setTelefoneusuario(Telefone telefoneusuario) {
        this.telefoneusuario = telefoneusuario;
    }

    
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
}
