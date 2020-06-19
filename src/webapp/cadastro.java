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
        EmpresaDB empresaDB = new EmpresaDB();

        boolean insert = empresaDB.dbInsert(request.getParameter("nome-empresa"),request.getParameter("data-fund"),
                            request.getParameter("num-func"),request.getParameter("regiao"),request.getParameter("setor"));

        if (insert == true){
            response.sendRedirect(request.getContextPath() + "/index.jsp");
        }else{
            request.setAttribute("insert", "Erro ao realizar insert");
            request.getRequestDispatcher("/cadastro.jsp").forward(request,response);
        }

        empresaDB.dbCloseConnection();




    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

}
