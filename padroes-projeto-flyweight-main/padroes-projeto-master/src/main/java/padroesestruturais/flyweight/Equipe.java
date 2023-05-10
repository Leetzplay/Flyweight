package padroesestruturais.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Equipe {

    private List<Brawler> brawlers = new ArrayList<>();

    public void escalar(String nomeBrawler, String nomePosicao, String funcao) {
        Trio trio = BrawlerFactory.getBrawlers(nomePosicao, funcao);
        Brawler brawler = new Brawler(nomeBrawler, trio);
        brawlers.add(brawler);
    }

    public List<String> obterBrawlers() {
        List<String> saida = new ArrayList<String>();
        for (Brawler brawler : this.brawlers) {
            saida.add(brawler.obterBrawler());
        }
        return saida;
    }


}
