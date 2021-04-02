package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import uy.com.cmgp.datos.ClienteDao;
import uy.com.cmgp.dominio.Cliente;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        if(accion != null) {
            switch (accion) {
                case "editar":
                    this.editarCliente(req, res);
                    break;
                case "eliminar":
                    this.eliminarCliente(req, res);
                    break;
                default:
                    this.accionDefault(req, res);

            }
        } else {
            this.accionDefault(req, res);
        }
    }
    
    private void eliminarCliente(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idCliente"));
        ClienteDao cd = new ClienteDao();
        int rows = cd.eliminar(id);
        System.out.println(rows);
        this.accionDefault(req, res);
        
    }

    private void accionDefault(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ClienteDao cd = new ClienteDao();
        List<Cliente> clientes = cd.listar();
        int totalClientes = clientes.size();
        HttpSession session = req.getSession();
        session.setAttribute("saldoTotal", this.getSaldoTotal(clientes));
        session.setAttribute("totalClientes", totalClientes);
        session.setAttribute("clientes", clientes);
        res.sendRedirect("clientes.jsp");
    }

    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String accion = req.getParameter("accion");
        if (!accion.equals("") && accion != null) {
            switch (accion) {
                case "insertar":
                    this.insertarCliente(req, res);
                    break;
                case "editar":
                    this.editarClienteGuardar(req, res);
                    break;
                default:
                    this.accionDefault(req, res);

            }
        } else {
            this.accionDefault(req, res);
        }

    }

    private void insertarCliente(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String email = req.getParameter("email");
        String telefono = req.getParameter("telefono");
        String saldoString = req.getParameter("saldo");
        Double saldo = 0.0;
        if (!saldoString.equals("") && saldoString != null) {
            saldo = Double.parseDouble(saldoString);
        }

        ClienteDao cd = new ClienteDao();
        int rows = cd.insertar(new Cliente(nombre, apellido, email, telefono, saldo));
        System.out.println(rows);
        this.accionDefault(req, res);
        
    }
    
    private void editarClienteGuardar(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idCliente"));
        String nombre = req.getParameter("nombre");
        String apellido = req.getParameter("apellido");
        String email = req.getParameter("email");
        String telefono = req.getParameter("telefono");
        String saldoString = req.getParameter("saldo");
        Double saldo = 0.0;
        if (!saldoString.equals("") && saldoString != null) {
            saldo = Double.parseDouble(saldoString);
        }

        ClienteDao cd = new ClienteDao();
        int rows = cd.actualizar(new Cliente(id,nombre, apellido, email, telefono, saldo));
        System.out.println(rows);
        this.accionDefault(req, res);
        
    }
    
    
    
    private void editarCliente(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        int idCliente = Integer.parseInt(req.getParameter("idCliente"));
        Cliente cliente = new ClienteDao().encontrar(idCliente);
        req.setAttribute("cliente", cliente);
        req.getRequestDispatcher("/WEB-INF/pages/cliente/editarCliente.jsp").forward(req, res);
    }

    private Double getSaldoTotal(List<Cliente> clientes) {
        Double saldoTotal = 0.0;
        for (Cliente c : clientes) {
            saldoTotal += c.getSaldo();
        }
        return saldoTotal;
    }

}
