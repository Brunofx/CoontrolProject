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
        <form action="/CoontrolTeste/cadastro" method="post">
            Nome Empresa: <input type="text" name="nome-empresa"> <br>
            <br>
            Data Fundação: <input type="date" name="data-fund"> <br>
            <br>
            Número Funcionarios: <input type="number" name="num-func"> <br>
            <br>
            Região: <br>
                <input type="radio" id="norte" name="regiao" value="Norte"> <label>Norte</label> <br>
                <input type="radio" id="nordeste" name="regiao" value="Nordeste"> <label>Nordeste</label> <br>
                <input type="radio" id="centro-oeste" name="regiao" value="Centro-Oeste"> <label>Centro-Oeste</label> <br>
                <input type="radio" id="sudeste" name="regiao" value="Sudeste"> <label>Sudeste</label> <br>
                <input type="radio" id="sul" name="regiao" value="Sul"> <label>Sul</label>
            <br>
            Setor de Atuação: <br>
                <input type="radio" id="industrial" name="setor" value="Industrial"> <label>Industrial</label> <br>
                <input type="radio" id="varejo" name="setor" value="Varejo"> <label>Varejo</label> <br>
                <input type="radio" id="servicos" name="setor" value="Serviços"> <label>Serviços</label> <br>
                <input type="radio" id="agricola" name="setor" value="Agrícola"> <label>Agrícola</label> <br>
            <input type="submit" value="Confirmar">

        </form>
    </body>
</html>
