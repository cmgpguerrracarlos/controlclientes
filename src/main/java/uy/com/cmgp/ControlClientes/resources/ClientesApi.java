package uy.com.cmgp.ControlClientes.resources;

import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import uy.com.cmgp.datos.ClienteDao;
import uy.com.cmgp.dominio.Cliente;

/**
 *
 * @author 
 */
@Path("clientes")
public class ClientesApi {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response ping(){
        List<Cliente> clientes = new ClienteDao().listar();
        
        return Response
                .ok(clientes)
                .build();
    }
}
