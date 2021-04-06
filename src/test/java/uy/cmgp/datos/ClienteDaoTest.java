package uy.cmgp.datos;

import java.util.List;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import uy.com.cmgp.datos.ClienteDao;
import uy.com.cmgp.dominio.Cliente;

public class ClienteDaoTest {
    
    private ClienteDao cd = null;
    
    @Before
    public void crearDao(){
        this.cd = new ClienteDao();
    }
    
    @Test
    public void listartTest(){
        
        List<Cliente> clientes = cd.listar();
        clientes.forEach(c->{
            System.out.println(c.toString());
        });
    }
    
    @Test
    public void encontrarTest(){
        int id = 5;
        cd = new ClienteDao();
        Cliente cliente = cd.encontrar(id);
        System.out.println(cliente);
        assertEquals("Carlos Maria", cliente.getNombre());
        
    }
    
    @Test
    public void insertarTest(){
        //ClienteDao cd = new ClienteDao();
        //cd.insertar(new Cliente("Ronaldo","Viva","cmgpgue@gmail","3435135",34.7));
    }
    
    @Test
    public void actualizarTest(){
    
    }
    
    @Test
    public void eliminarTest(){
    
    }
    
    @After
    public void close(){
        this.cd = null;
    }
}
