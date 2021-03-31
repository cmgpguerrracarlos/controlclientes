package uy.com.cmgp.datos;

import java.util.List;
import uy.com.cmgp.dominio.Cliente;

public class test {
    public static void main(String[] args) {
        ClienteDao cd = new ClienteDao();
        List<Cliente> clientes = cd.listar();
        System.out.println("88888888888888888888888888888888888888");
        clientes.forEach(c->{
            System.out.println(c.toString());
        });
        System.out.println("88888888888888888888888888888888888888");
        System.out.println("88888888888888888888888888888888888888");
        System.out.println("88888888888888888888888888888888888888");
        
    }
}
