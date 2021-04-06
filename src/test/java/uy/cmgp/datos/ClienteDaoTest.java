package uy.cmgp.datos;

import java.util.List;
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import uy.com.cmgp.datos.ClienteDao;
import uy.com.cmgp.dominio.Cliente;

public class ClienteDaoTest {
      
    @Test
    public void listartTest(){
        ClienteDao cd = new ClienteDao();
        List<Cliente> clientes = cd.listar();
        clientes.forEach(c->{
            System.out.println(c.toString());
        });
    }
    
    @Test
    public void encontrarTest(){
        int id = 5;
        ClienteDao cd = new ClienteDao();
        Cliente cliente = cd.encontrar(id);
        System.out.println(cliente.getNombre());
        assertEquals("Carlos Maria", cliente.getNombre());
        
    }
    
    @Test
    public void insertarTest(){
        ClienteDao cd = new ClienteDao();
        cd.insertar(new Cliente("Ronaldo","Viva","cmgpgue@gmail","3435135",34.7));
    }
}
