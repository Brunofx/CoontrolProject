package webapp;

import backend.Empresa;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;


@WebServlet(name = "cadastro")
public class cadastro extends HttpServlet {

    private ArrayList<Empresa> empresa;

    public cadastro() {
        this.empresa = new ArrayList<>();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();

        empresa.add(new Empresa(request.getParameter("nome-empresa"),request.getParameter("data-fund"),
                                request.getParameter("num-func"),request.getParameter("regiao"),request.getParameter("setor")));

        for (int i = 0;i<empresa.size();i++){
            out.println("Nome: " + empresa.get(i).getNome());
            out.println("Data de fundação: " + empresa.get(i).getData());
            out.println("Numero de funcionarios: " + empresa.get(i).getNum_func());
            out.println("Região: " + empresa.get(i).getRegiao());
            out.println("Setor: " + empresa.get(i).getSetor());
            out.println(" ");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
