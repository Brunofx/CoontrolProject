<%@ page import="backend.EmpresaDB" %>
<%@ page import="java.util.Date" %>

<%--
  Created by IntelliJ IDEA.
  User: Bruno
  Date: 17/06/2020
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    EmpresaDB empresaDB = new EmpresaDB();

    pageContext.setAttribute("regiaoMaisFunc",empresaDB.dbConsultaRegiaoMaisFunc()[0]);
    pageContext.setAttribute("nrFuncRegiaoMaisFunc", empresaDB.dbConsultaRegiaoMaisFunc()[1]);
    //
    pageContext.setAttribute("nomeEmpresaMaisAntiga", empresaDB.dbConsultaEmpresaMaisAntiga()[0]);
    pageContext.setAttribute("dataFundacaoEmpresaMaisAntiga", empresaDB.dbConsultaEmpresaMaisAntiga()[1]);
    //
    pageContext.setAttribute("rgEmpresaSetor", empresaDB.dbConsultaRegiaoMaisEmpresaIndustrial()[0]);
    pageContext.setAttribute("countEmpresaSetor", empresaDB.dbConsultaRegiaoMaisEmpresaIndustrial()[1]);
    //
    pageContext.setAttribute("setor1", empresaDB.dbConsultaNrEmpresasSetor()[0]);
    pageContext.setAttribute("valor1", empresaDB.dbConsultaNrEmpresasSetor()[1]);

    pageContext.setAttribute("setor2", empresaDB.dbConsultaNrEmpresasSetor()[2]);
    pageContext.setAttribute("valor2", empresaDB.dbConsultaNrEmpresasSetor()[3]);

    pageContext.setAttribute("setor3", empresaDB.dbConsultaNrEmpresasSetor()[4]);
    pageContext.setAttribute("valor3", empresaDB.dbConsultaNrEmpresasSetor()[5]);

    pageContext.setAttribute("setor4", empresaDB.dbConsultaNrEmpresasSetor()[6]);
    pageContext.setAttribute("valor4", empresaDB.dbConsultaNrEmpresasSetor()[7]);
    //
    pageContext.setAttribute("totalFunc", empresaDB.dbConsultaTotalFunc());

    empresaDB.dbCloseConnection();
%>

<html>
    <body>

        <table border="1">
            <tr>
                <td colspan="2"><h4>Região com maior numero de funcionarios</h4></td>
            </tr>
            <tr>
                <td>Região</td>
                <td>Nr func.</td>
            </tr>
            <tr>
                <td>${regiaoMaisFunc}</td>
                <td>${nrFuncRegiaoMaisFunc}</td>
            </tr>
        </table>

        <br>

        <table border="1">
            <tr>
                <td colspan="2"><h4>Empresa mais antiga</h4></td>
            </tr>
            <tr>
                <td>Nome Empresa</td>
                <td>Data Fundação</td>
            </tr>
            <tr>
                <td>${nomeEmpresaMaisAntiga}</td>
                <td>${dataFundacaoEmpresaMaisAntiga}</td>
            </tr>
        </table>

        <br>

        <table border="1">
            <tr>
                <td colspan="2"><h4>Região com maior numero de industrias</h4></td>
            </tr>
            <tr>
                <td>Região</td>
                <td>Nr empresas</td>
            </tr>
            <tr>
                <td>${rgEmpresaSetor}</td>
                <td>${countEmpresaSetor}</td>
            </tr>
        </table>

        <br>

        <table border="1">
            <tr>
                <td colspan="2"><h4>Nr empresas em cada setor</h4></td>
            </tr>
            <tr>
                <td>Setor</td>
                <td>Nr empresas</td>
            </tr>
            <tr>
                <td>${setor1}</td>
                <td>${valor1}</td>
            </tr>
            <tr>
                <td>${setor2}</td>
                <td>${valor2}</td>
            </tr>
            <tr>
                <td>${setor3}</td>
                <td>${valor3}</td>
            </tr>
            <tr>
                <td>${setor4}</td>
                <td>${valor4}</td>
            </tr>
        </table>

        <br>

        <table border="1">
            <tr>
                <td><h4>Total Funcionarios</h4></td>
            </tr>
            <tr>
                <td>Total funcionarios</td>
            </tr>
            <tr>
                <td>${totalFunc}</td>
            </tr>
        </table>

    </body>
</html>
