package helloquarkus.resourse;

import java.util.List;

import org.jboss.resteasy.annotations.jaxrs.PathParam;

import com.oracle.svm.core.annotate.Delete;

import helloquarkus.DTO.EstadoDTO;
import helloquarkus.service.EstadoService;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;

@Path("/Estado")
public class EstadoResource {

   @jakarta.inject.Inject
   EstadoService estado;

   @GET
   @RolesAllowed({"Admin","User"})
   public List<EstadoDTO> getAll() {
      return estado.getAll();
   }
   @GET
   @PathParam("/{id}")
   @RolesAllowed({"Admin","User"})
   public EstadoDTO findById(@PathParam("/{id}")Long id) {
      return estado.findById(id);
   }
   @POST
   public EstadoDTO create(EstadoDTO productDTO) {
      return estado.create(productDTO);
   }
   @PUT
   @PathParam("/{id}")
   public EstadoDTO update(@PathParam("/{id}")Long id, EstadoDTO productDTO) {
      return estado.update(id, productDTO);
   }
   @Delete 
   @PathParam("/{id}")
   public void delete(Long id) {
      estado.delete(id);
   }
   
   @GET
   @Path("/search/{nome}")
   public List<EstadoDTO> findByNome(String nome) {
      return estado.findByNome(nome);
   }
    @GET
    @Path("/count")
   public long count() {
      return estado.count();
   }
}
