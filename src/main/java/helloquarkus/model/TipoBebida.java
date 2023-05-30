package helloquarkus.model;

public enum TipoBebida {
    EXPRESSO("Expresso"),
    RISTRETTO("Ristretto"),
    AMERICANO("Americano"),
    GELADO("Gelado");

    private String descricao;

    
    private TipoBebida(String descricao) {
        this.descricao = descricao;
    }


    public String getDescricao() {
        return descricao;
    }
    
}
