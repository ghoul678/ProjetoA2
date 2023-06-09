package helloquarkus.service;

import helloquarkus.model.Usuario;

public interface TokenService {
    public String generateJwt(Usuario usuario);
}
