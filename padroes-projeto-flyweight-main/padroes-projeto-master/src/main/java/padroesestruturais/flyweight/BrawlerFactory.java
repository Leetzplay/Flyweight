package padroesestruturais.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BrawlerFactory {
    private static Map<String, Trio> brawlers = new HashMap<>();

    public static Trio getBrawlers(String nome, String funcao) {
        Trio trio = brawlers.get(nome);
        if (trio == null) {
            trio = new Trio(nome, funcao);
            brawlers.put(nome, trio);
        }
        return trio;
    }

    public static int getTotalPosicoes() {
        return brawlers.size();
    }

}




