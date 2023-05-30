package helloquarkus.DTO;

public class EnderecoDTO {
    private Long id;
    private String cep;

    
    public EnderecoDTO(Long id, String cep) {
        this.id = id;
        this.cep = cep;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    
}
