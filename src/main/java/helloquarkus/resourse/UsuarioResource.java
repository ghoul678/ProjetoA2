package helloquarkus.resourse;
import java.util.List;
import java.io.File;
import java.io.IOException;
import org.eclipse.microprofile.jwt.JsonWebToken;
import org.jboss.resteasy.annotations.providers.multipart.MultipartForm;

import helloquarkus.DTO.UsuarioDTO;
import helloquarkus.application.Result;
import helloquarkus.form.ImageForm;
import helloquarkus.model.Usuario;
import helloquarkus.service.FileService;
import helloquarkus.service.UsuarioService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.PATCH;
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

   @jakarta.inject.Inject
  FileService imagemdoUsuario;
   
   @jakarta.inject.Inject
  JsonWebToken jwt;
   
     @PATCH
    @Path("/novaimagem")
    @RolesAllowed({"Admin","User"})
    @Consumes(MediaType.MULTIPART_FORM_DATA)
    public Response salvarImagem(@MultipartForm ImageForm form){
        String nomeImagem = "";

        try {
            nomeImagem = imagemdoUsuario.salvarImagemUsuario(form.getImagem(), form.getNomeImagem());
        } catch (IOException e) {
            Result result = new Result(e.getMessage());
            return Response.status(Status.CONFLICT).entity(result).build();
        } 

        // obtendo o login a partir do token
        String email = jwt.getSubject();
        Usuario usuarioDTO = usuario.findByEmail(email);

        return Response.ok(usuarioDTO).build();
    }

    @GET
    @Path("/download/{nomeImagem}")
    @RolesAllowed({"Admin","User"})
    @Produces(MediaType.APPLICATION_OCTET_STREAM)
public File download(String nomeArquivo) {
      return imagemdoUsuario.download(nomeArquivo);
   }

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
