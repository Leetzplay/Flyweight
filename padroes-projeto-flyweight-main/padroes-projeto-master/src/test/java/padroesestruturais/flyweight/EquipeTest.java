package padroesestruturais.flyweight;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EquipeTest {

    @Test
    void deveRetornarBrawlers() {
        Equipe equipe = new Equipe();
        equipe.escalar("Shelly", "Shotgunner", "Shotgun");
        equipe.escalar("Colt", "Atirador", "Atirar");
        equipe.escalar("Nita", "ranged", "Meia Distancia");

        List<String> saida;
    }

    @Test
    void deveRetornarTotalPosicoes() {
        Equipe equipe = new Equipe();
        equipe.escalar("Shelly", "Shotgunner", "Shotgun");
        equipe.escalar("Buster", "Shotgunner", "Shotgun");
        equipe.escalar("Colt", "Atirador", "Atirar");

        assertEquals(3, BrawlerFactory.getTotalPosicoes());
    }

}