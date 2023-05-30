package helloquarkus.service;

import helloquarkus.model.Usuario;

public interface TokenjwtService {
    public String generatejwt(Usuario usuario);
}

