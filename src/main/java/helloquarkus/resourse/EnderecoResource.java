package helloquarkus.resourse;
import java.util.List;

import helloquarkus.DTO.EnderecoDTO;
import helloquarkus.service.EnderecoService;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

@Path("/Endereco")
public class EnderecoResource {
    @jakarta.inject.Inject
    EnderecoService endereco;
    @GET
   public List<EnderecoDTO> getAll() {
      return endereco.getAll();
   }
   @GET
   @Path("/{id}")
   public EnderecoDTO findById(@PathParam("/{id}") Long id) {
      return endereco.findById(id);
   }
   @POST
   public EnderecoDTO create(EnderecoDTO productDTO) {
      return endereco.create(productDTO);
   }
   @PUT
   @Path("/{id}")
   public EnderecoDTO update(@PathParam("/{id}")Long id, EnderecoDTO productDTO) {
      return endereco.update(id, productDTO);
   }
   @DELETE
   @Path("/{id}")
   public void delete(Long id) {
      endereco.delete(id);
   }
   @GET
   @Path("/{nome}")
   public List<EnderecoDTO> findByNome(String nome) {
      return endereco.findByNome(nome);
   }
   @GET
   @Path("/count")
   public long count() {
      return endereco.count();
   }
}
