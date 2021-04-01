package uy.com.cmgp.datos;

import java.util.List;
import uy.com.cmgp.dominio.Cliente;

public class test {
    public static void main(String[] args) {
        ClienteDao cd = new ClienteDao();
        Cliente c1,c2,c3; 
        c1 = new Cliente("Martin","Rodriguez","cmgmmm@com","343443424",3423.0);
        c2 = new Cliente("Martin","Rodriguez","cmgmmm@com","343443424",3423.0);
        c3 = new Cliente("Martin","Rodriguez","cmgmmm@com","343443424",3423.0);
//        cd.insertar(c1);
//        cd.insertar(c2);
//        cd.insertar(c3)

//        cd.eliminar(2);
//        c1.setIdCliente(1);
//        cd.actualizar(c1);
        
        Cliente c4 = cd.encontrar(2);
        
        System.out.println(c4);
        List<Cliente> clientes = cd.listar();
        System.out.println("88888888888888888888888888888888888888");
        clientes.forEach(c->{
            System.out.println(c.toString());
        });
        System.out.println("88888888888888888888888888888888888888");
    }
}
