package padroesestruturais.flyweight;

public class Brawler {

    private String nome;
    private Trio trio;

    public Brawler(String nome, Trio trio) {
        this.nome = nome;
        this.trio = trio;
    }

    public String obterBrawler() {
        return "Brawler{" +
                "nome='" + this.nome + '\'' +
                ", nomePosicao='" + trio.getNome() + '\'' +
                ", funcao='" + trio.getFuncao() + '\'' +
                '}';
    }
}
