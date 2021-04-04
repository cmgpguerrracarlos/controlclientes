package uy.com.cmgp.ControlClientes.resources;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
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
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ClientesApi {

    @GET
    public Response getAllClients() {
        List<Cliente> clientes = new ClienteDao().listar();
        return Response.ok(clientes).build();
    }

    @GET
    @Path("/{id}")
    public Response getClientById(@PathParam("id") int id) {
        ClienteDao cd = new ClienteDao();
        return Response.ok(cd.encontrar(id)).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addClient(Cliente cliente) {
        ClienteDao cd = new ClienteDao();
        cd.insertar(cliente);
        return Response.ok("Cliente agregado").build();
    }

    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public Response updateClient(Cliente cliente) {
        ClienteDao cd = new ClienteDao();
        cd.actualizar(cliente);
        return Response.ok("Cliente actualizado").build();
    }

    @DELETE
    @Path("/{id}")
    public Response deleteClient(@PathParam("id") int id) {
        ClienteDao cd = new ClienteDao();
        cd.eliminar(id);
        return Response.ok("Cliente eliminado").build();
    }

}
