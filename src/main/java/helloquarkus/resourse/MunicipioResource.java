package helloquarkus.resourse;

import java.util.List;

import org.jboss.logging.annotations.Pos;

import com.oracle.svm.core.annotate.Delete;

import helloquarkus.DTO.MunicipioDTO;
import helloquarkus.service.MunicipioService;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
@Path("/Muncipio")
public class MunicipioResource {
   @jakarta.inject.Inject
    MunicipioService municipio;
   @GET
   public List<MunicipioDTO> getAll() {
      return municipio.getAll();
   }
   @GET
   @PathParam("/{id}")
   public MunicipioDTO findById(@PathParam("/{id}")Long id) {
      return municipio.findById(id);
   }
   @POST
   public MunicipioDTO create(MunicipioDTO productDTO) {
      return municipio.create(productDTO);
   }
   @PUT
   @PathParam("/{id}")
   public MunicipioDTO update(@PathParam("/{id}")Long id, MunicipioDTO productDTO) {
      return municipio.update(id, productDTO);
   }
   @Delete
   @PathParam("/{id}")
   public void delete(Long id) {
      municipio.delete(id);
   }
   @GET
   @PathParam("/search/{nome}")
   public List<MunicipioDTO> findByNome(String nome) {
      return municipio.findByNome(nome);
   }
@GET
@PathParam("/count")
   public long count() {
      return municipio.count();
   }

   
}
