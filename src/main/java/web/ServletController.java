package web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uy.com.cmgp.datos.ClienteDao;
import uy.com.cmgp.dominio.Cliente;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        ClienteDao cd = new ClienteDao();
        List<Cliente> clientes = cd.listar();
        int totalClientes = clientes.size();
        req.setAttribute("saldoTotal", this.getSaldoTotal(clientes));
        req.setAttribute("totalClientes", totalClientes);
        req.setAttribute("clientes", clientes);
        req.getRequestDispatcher("clientes.jsp").forward(req, res);
    }
    
    private Double getSaldoTotal(List<Cliente> clientes){
        Double saldoTotal=0.0;
        for(Cliente c:clientes){
            saldoTotal += c.getSaldo();
        }
        return saldoTotal;
    }

}
