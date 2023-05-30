package helloquarkus.DTO;

import helloquarkus.model.GraoCafe;
import helloquarkus.model.TipoBebida;

public class CafeBebidaDTO {
    private Long id;
    private TipoBebida tipoBebida;
    private GraoCafe graoCafe;

    
    public CafeBebidaDTO(Long id, TipoBebida tipoBebida, GraoCafe graoCafe) {
        this.id = id;
        this.tipoBebida = tipoBebida;
        this.graoCafe = graoCafe;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public TipoBebida getTipoBebida() {
        return tipoBebida;
    }
    public void setTipoBebida(TipoBebida tipoBebida) {
        this.tipoBebida = tipoBebida;
    }
    public GraoCafe getGraoCafe() {
        return graoCafe;
    }
    public void setGraoCafe(GraoCafe graoCafe) {
        this.graoCafe = graoCafe;
    }

    
    
}
