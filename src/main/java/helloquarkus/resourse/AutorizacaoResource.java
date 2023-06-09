package helloquarkus.resourse;

import org.eclipse.microprofile.jwt.JsonWebToken;

import jakarta.ws.rs.core.Response.Status;

import helloquarkus.DTO.AuthUsuarioDTO;
import helloquarkus.model.Usuario;
import helloquarkus.service.HashService;
import helloquarkus.service.TokenService;
import helloquarkus.service.UsuarioService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
 @ApplicationScoped 
public class AutorizacaoResource {
    @Inject
    HashService hashService;
    
    
    @Inject
    UsuarioService usuarioService;
    
    
    @Inject
    TokenService tokenService;
    
    @Inject
    JsonWebToken jwt;

    @POST
    @Produces(MediaType.TEXT_PLAIN)
    public Response email(AuthUsuarioDTO authDTO) {
        String hash = hashService.getHashSenha(authDTO.senha());

        Usuario usuario = usuarioService.findByEmailAndSenha(authDTO.email(), hash);

        /* if (usuario == null) {
            return Response.status(Status.NO_CONTENT)
                .entity("Usuario não encontrado").build();
        }  */
        return Response.ok()
            .header("Authorization", tokenService.generateJwt(usuario))
            .build();
        
    }
}
