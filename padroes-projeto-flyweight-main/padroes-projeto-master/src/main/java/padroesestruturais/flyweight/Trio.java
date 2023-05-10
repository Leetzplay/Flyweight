package padroesestruturais.flyweight;

public class Trio {

    private String nome;
    private String funcao;

    public Trio(String nome, String funcao) {
        this.nome = nome;
        this.funcao = funcao;
    }

    public String getNome() {
        return nome;
    }

    public String getFuncao() {
        return funcao;
    }
}
