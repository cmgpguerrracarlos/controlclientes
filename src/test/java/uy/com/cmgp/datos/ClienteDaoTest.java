/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uy.com.cmgp.datos;

import java.util.List;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import uy.com.cmgp.dominio.Cliente;

/**
 *
 * @author cmgp
 */
public class ClienteDaoTest {
    
    public ClienteDaoTest() {
    }

     /**
     * Test of listar method, of class ClienteDao.
     */
    @org.junit.jupiter.api.Test
    public void testListar() {
        System.out.println("listar");
        ClienteDao instance = new ClienteDao();
        List<Cliente> expResult = null;
        List<Cliente> result = instance.listar();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of encontrar method, of class ClienteDao.
     */
    @org.junit.jupiter.api.Test
    public void testEncontrar() {
        System.out.println("encontrar");
        int id = 0;
        ClienteDao instance = new ClienteDao();
        Cliente expResult = null;
        Cliente result = instance.encontrar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of insertar method, of class ClienteDao.
     */
    @org.junit.jupiter.api.Test
    public void testInsertar() {
        System.out.println("insertar");
        Cliente cliente = null;
        ClienteDao instance = new ClienteDao();
        int expResult = 0;
        int result = instance.insertar(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizar method, of class ClienteDao.
     */
    @org.junit.jupiter.api.Test
    public void testActualizar() {
        System.out.println("actualizar");
        Cliente cliente = null;
        ClienteDao instance = new ClienteDao();
        int expResult = 0;
        int result = instance.actualizar(cliente);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminar method, of class ClienteDao.
     */
    @org.junit.jupiter.api.Test
    public void testEliminar() {
        System.out.println("eliminar");
        int id = 0;
        ClienteDao instance = new ClienteDao();
        int expResult = 0;
        int result = instance.eliminar(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
