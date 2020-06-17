package webapp;

/*- Nome da região do brasil que apresenta maior número de funcionários, e o número de funcionários;
  - O nome da empresa mais antiga;
  - A região do brasil que tem maior número de empresas do setor Industrial;
  - O número de empresas de cada setor de atuação em ordem decrescente;
  - O número total de funcionários de todas as empresas;
*/

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import backend.Empresa;

@WebServlet(name = "consulta")
public class consulta extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
