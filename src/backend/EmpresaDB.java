package backend;

import java.sql.*;

public class EmpresaDB {

    private String dbURL = "jdbc:sqlite:C:\\Users\\Bruno\\IdeaProjects\\CoontrolTeste\\CoontrolProject\\DB\\coontrol.db";
    private Connection con;

    public EmpresaDB() {
        try {
            this.con = DriverManager.getConnection(dbURL);
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }

    public boolean dbInsert(String nomeEmpresa, String dataEmpresa, String numFunc, String rgEmpresa, String stEmpresa){
        try {
            Statement statement = con.createStatement();

            statement.execute("INSERT INTO empresas(nm_empresa, dt_empresa, num_func_empresa, rg_empresa, st_empresa)" +
                                        "VALUES ('" + nomeEmpresa + "','" + dataEmpresa + "','" + numFunc + "','" + rgEmpresa + "','" + stEmpresa + "')");
            statement.close();

            return true;

        } catch (SQLException e){
            System.out.println("Erro: " + e.getMessage());
            return false;
        }
    }

    public String[] dbConsultaRegiaoMaisFunc(){
        try {
            //Connection con = DriverManager.getConnection(dbURL);

            Statement statement = con.createStatement();

            ResultSet regiaoMaisFunc = statement.executeQuery("SELECT empresas.rg_empresa, SUM(empresas.num_func_empresa) as num_func_empresa FROM empresas group by 1 order by 2 DESC LIMIT 1");
            String[] regiaoMaisFuncArray = {regiaoMaisFunc.getString("rg_empresa"), regiaoMaisFunc.getString("num_func_empresa")};

            regiaoMaisFunc.close();

            return regiaoMaisFuncArray;
        }catch (SQLException e){
            System.out.println("Erro: " + e.getMessage());
            String[] erro = {e.getMessage()};
            return erro;
        }
    }


    public String[] dbConsultaEmpresaMaisAntiga(){
        try {
           // Connection con = DriverManager.getConnection(dbURL);

            Statement statement = con.createStatement();

            ResultSet empresaMaisAntiga = statement.executeQuery("SELECT empresas.nm_empresa, empresas.dt_empresa FROM empresas order by empresas.dt_empresa LIMIT 1");

            String[] empresaMaisAntigaArray = {empresaMaisAntiga.getString("nm_empresa"), empresaMaisAntiga.getString("dt_empresa")};

            empresaMaisAntiga.close();

            return empresaMaisAntigaArray;
        } catch (SQLException e){
            System.out.println("Erro: " + e.getMessage());
            String[] erro = {e.getMessage()};
            return erro;
        }
    }

    public String[] dbConsultaRegiaoMaisEmpresaIndustrial(){
        try{
            Connection con = DriverManager.getConnection(dbURL);

            Statement statement = con.createStatement();

            ResultSet regiaoEmpresaIndustrial = statement.executeQuery("SELECT empresas.rg_empresa, count (empresas.st_empresa) as st_empresa FROM empresas where empresas.st_empresa like \"Industrial\" GROUP BY 1 ORDER BY 2 desc LIMIT 1");
            String[] regiaoEmpresaIndustrialArray = {regiaoEmpresaIndustrial.getString("rg_empresa"), regiaoEmpresaIndustrial.getString("st_empresa")};

            regiaoEmpresaIndustrial.close();

            return regiaoEmpresaIndustrialArray;
        }catch (SQLException e){
            System.out.println("Erro: " + e.getMessage());
            String[] erro = {e.getMessage()};
            return erro;
        }
    }

    public String[] dbConsultaNrEmpresasSetor(){
        try{
            Connection con = DriverManager.getConnection(dbURL);

            Statement statement = con.createStatement();

            ResultSet nrEmpresasSetor = statement.executeQuery("SELECT empresas.st_empresa, COUNT(empresas.st_empresa) as count_st_empresa FROM empresas GROUP BY 1 ORDER BY 2 DESC");

            String[] stNrEmpresa = new String[10];

            int i = 0;

            while (nrEmpresasSetor.next()){
                stNrEmpresa[i] = nrEmpresasSetor.getString("st_empresa");
                stNrEmpresa[i+1] = nrEmpresasSetor.getString("count_st_empresa");
                i = i + 2;
            }

            for(int f = 0;i < stNrEmpresa.length;i++){
                System.out.println(stNrEmpresa[i]);
            }

            nrEmpresasSetor.close();

            return stNrEmpresa;
        }catch (SQLException e){
            String[] erro = {e.getMessage()};
            System.out.println("Erro: " + e.getMessage());
            return erro;
        }
    }

    public String dbConsultaTotalFunc(){
        try {
            Connection con = DriverManager.getConnection(dbURL);

            Statement statement = con.createStatement();

            ResultSet consultaTotalFunc = statement.executeQuery("SELECT SUM(empresas.num_func_empresa) as num_func_empresa FROM empresas");
            String consultaTotalFuncStr = consultaTotalFunc.getString("num_func_empresa");

            consultaTotalFunc.close();

            return consultaTotalFuncStr;
        }catch (SQLException e){
            System.out.println("Erro: " + e.getMessage());
            return e.getMessage();
        }
    }

    public void dbCloseConnection(){
        try{
            con.close();
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }

    }



}

