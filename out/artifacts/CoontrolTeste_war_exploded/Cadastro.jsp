<%--
  Created by IntelliJ IDEA.
  User: Bruno
  Date: 16/06/2020
  Time: 15:12
  To change this template use File | Settings | File Templates.

    Nome da empresa;
    Data de fundação;
    Número de funcionários;
    Região do brasil (Norte, Nordeste, Centro-oeste, Sudeste, Sul);
    Setor de atuação (Industrial, Varejo, Serviços, Agrícola);
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cadastro</title>
</head>
<body>
    <form action="/cadastro" method="post">
        Nome Empresa: <input type="text" name="nome-empresa"> <br>
        <br>
        Data Fundação: <input type="date" name="data-fund"> <br>
        <br>
        Número Funcionarios: <input type="number" name="num-func"> <br>
        <br>
        <input type="submit" value="Confirmar"> <br>

    </form>
</body>
</html>
