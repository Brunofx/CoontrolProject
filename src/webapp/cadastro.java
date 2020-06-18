package webapp;

import backend.EmpresaDB;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "cadastro")
public class cadastro extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        EmpresaDB empresaDB = new EmpresaDB();

        empresaDB.dbInsert(request.getParameter("nome-empresa"),request.getParameter("data-fund"),
                request.getParameter("num-func"),request.getParameter("regiao"),request.getParameter("setor"));

        request.setAttribute("cadastro", "Empresa cadastrada com sucesso.");
        request.getRequestDispatcher("/index.jsp").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
