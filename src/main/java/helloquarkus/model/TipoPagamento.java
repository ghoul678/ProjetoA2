package helloquarkus.model;

import com.fasterxml.jackson.annotation.JsonFormat;


@JsonFormat(shape = JsonFormat.Shape.OBJECT)
public enum TipoPagamento {

PIX(4),
CREDITO(3),
DEBITO(2),
BOLETO(1);

private Integer id;

private TipoPagamento(Integer id) {
    this.id = id;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}



}
