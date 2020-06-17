package backend;

public class Empresa {

    private String nome;
    private String data;
    private String num_func;
    private String regiao;
    private String setor;

    public Empresa(String nome, String data, String num_func, String regiao, String setor) {
        this.nome = nome;
        this.data = data;
        this.num_func = num_func;
        this.regiao = regiao;
        this.setor = setor;
    }

    public String getNome() {
        return nome;
    }

    public String getData() {
        return data;
    }

    public String getNum_func() {
        return num_func;
    }

    public String getRegiao() {
        return regiao;
    }

    public String getSetor() {
        return setor;
    }
}
