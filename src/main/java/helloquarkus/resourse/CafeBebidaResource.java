package helloquarkus.resourse;

import java.util.List;

import helloquarkus.DTO.MunicipioDTO;
import helloquarkus.service.CafeBebidaService;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;

public class CafeBebidaResource {
    @jakarta.inject.Inject
    CafeBebidaService cafebebida;

    @GET
    public List<MunicipioDTO> getAll() {
        return cafebebida.getAll();
    }
    @GET
    @Path("/{id}")
    public MunicipioDTO findById(@PathParam("id") Long id) {
        return cafebebida.findById(id);
    }
    @POST
    public MunicipioDTO create(MunicipioDTO productDTO) {
        return cafebebida.create(productDTO);
    }
    @PUT
    @Path("/{id}")
    public MunicipioDTO update(@PathParam("/{id}")Long id, MunicipioDTO productDTO) {
        return cafebebida.update(id, productDTO);
    }
    @DELETE
    @Path("/{id}")
    public void delete(Long id) {
        cafebebida.delete(id);
    }
    @GET
    @Path("/(nome)")
    public List<MunicipioDTO> findByNome(String nome) {
        return cafebebida.findByNome(nome);
    }
    @GET
    @Path("/count")
    public long count() {
        return cafebebida.count();
    }
}
