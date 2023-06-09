package helloquarkus.service;

import java.time.Duration;
import java.time.Instant;
import java.util.Set;
import java.util.stream.Collectors;

import helloquarkus.model.Usuario;
import io.smallrye.jwt.build.Jwt;
import jakarta.enterprise.context.ApplicationScoped;
@ApplicationScoped
public class TokenServiceimpl implements TokenService{

    private static final Duration EXPIRATION_TIME = Duration.ofHours(24);
    @Override
    public String generateJwt(Usuario usuario) {
        Instant now = Instant.now();
        Instant expiryDate = now.plus(EXPIRATION_TIME);

        Set<String> roles = usuario.getPerfis()
                .stream().map(p -> p.getLabel())
                .collect(Collectors.toSet());

        return Jwt.issuer("unitins-jwt")
            .subject(usuario.getEmail())
            .groups(roles)
            .expiresAt(expiryDate)
            .sign();

    }
    }
    

