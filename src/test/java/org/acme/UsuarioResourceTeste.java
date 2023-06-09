package org.acme;

    
import java.util.List;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;
import com.oracle.svm.core.annotate.Inject;

import helloquarkus.DTO.UsuarioDTO;
import helloquarkus.service.UsuarioService;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class UsuarioResourceTeste {
    @Inject
    UsuarioService usuarioteste;
    
    @Test
    public void getAll() {
        given()
          .when().get("/usuarios")
          .then()
             .statusCode(200)
             .body(is("Teste Funcionando"));
    }

    
}
