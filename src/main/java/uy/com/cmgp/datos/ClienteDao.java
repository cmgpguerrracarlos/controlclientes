package uy.com.cmgp.datos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import uy.com.cmgp.dominio.Cliente;

public class ClienteDao {

    private static final String SQL_SELECT = "SELECT * FROM cliente";
    private static final String SQL_SELECT_BY_ID = "SELECT * FROM cliente WHERE id_cliente=?";
    private static final String SQL_INSERT ="INSERT INTO cliente (nombre,apellido,email,telefono,saldo) VALUES (?,?,?,?,?)";
    private static final String SQL_UPDATE = "UPDATE cliente SET nombre=?, apellido=?, email=?, telefono=?,saldo=? where id_cliente=?";
    private static final String SQL_DELETE = "DELETE FROM cliente WHERE id_cliente=?";

    public List<Cliente> listar(){
        Connection conn = null;
        PreparedStatement ps =null;
        ResultSet rs = null;
        List<Cliente> clientes = new ArrayList<>();
        try {
            conn = Conexion.getConnection();
            ps = conn.prepareStatement(SQL_INSERT);
            rs= ps.executeQuery();
            while(rs.next()){
                Cliente cliente = new Cliente();
                cliente.setIdCliente(rs.getInt("id_cliente"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setEmail(rs.getString("email"));
                cliente.setTelefono(rs.getString("telefono"));
                cliente.setSaldo(rs.getDouble("saldo"));
                clientes.add(cliente);
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }finally{
            Conexion.close(rs);
            Conexion.close(ps);
            Conexion.close(conn);
        }
        return clientes;
    }

}
