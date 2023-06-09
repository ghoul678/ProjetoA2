package helloquarkus.resourse;
import java.util.List;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.Base64;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

import jakarta.enterprise.context.ApplicationScoped;


import helloquarkus.DTO.UsuarioDTO;
import helloquarkus.model.Usuario;
import helloquarkus.service.UsuarioService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.ResponseBuilder;
import jakarta.ws.rs.core.Response.Status;
@Path("/usuarios")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@RolesAllowed({"Admin","User"})
public class UsuarioResource {

   @jakarta.inject.Inject
  UsuarioService usuario;
   

@GET
@RolesAllowed({"Admin","User"})
public List<UsuarioDTO> getAll() {
   return usuario.getAll();
}
@GET
@Path("/{id}")
@RolesAllowed({"Admin","User"})
public UsuarioDTO findById(@PathParam("id") Long id) {
   return usuario.findById(id);
}
@POST
public UsuarioDTO create(UsuarioDTO productDTO) {
   return usuario.create(productDTO);
}
@PUT
@Path("/{id}")
public UsuarioDTO update(@PathParam("id") Long id,UsuarioDTO productDTO) {
   return usuario.update(id, productDTO);
}
@DELETE
@Path("/{id}")
public ResponseBuilder delete(@PathParam("id") Long id) {
   usuario.delete(id);
   return Response.status(Status.NO_CONTENT);
}
@GET
@Path("/search/{nome}")
public List<UsuarioDTO> findByNome(@PathParam("nome") String nome) {
   return usuario.findByNome(nome);
}
@GET
@Path("/count")
public long count() {
   return usuario.count();
}
public Usuario findByEmailAndSenha(String email, String senha) {
   return usuario.findByEmailAndSenha(email, senha);
}



 

}
