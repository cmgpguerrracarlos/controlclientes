package web;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import uy.com.cmgp.datos.ClienteDao;
import uy.com.cmgp.dominio.Cliente;

@WebServlet("/ServletController")
public class ServletController extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
       List<Cliente> clientes = new ArrayList<>();
        Cliente c1 = new Cliente("Martin","Rodriguez","cmgmmm@com","343443424",3423.0);
       clientes.add(c1);
        req.setAttribute("clientes", clientes);
        req.getRequestDispatcher("clientes.jsp").forward(req, res);
    }
    
}
