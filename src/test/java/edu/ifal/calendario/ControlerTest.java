package edu.ifal.calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ControlerTest {

    @Test
    public void verificarProximoDiaDentroDoMesmoMes() {
        Controler controler = new Controler();
        Data proximoDiaRetornado = controler.proximoDia(new Data(1, 1, 2020));
        Data proximoDiaEsperado = new Data(2, 1, 2020);
        assertEquals(proximoDiaEsperado, proximoDiaRetornado);
    }

    @Test
    public void verificarProximoDiaDepoisDoDia31() {
        Controler controler = new Controler();
        Data proximoDiaEMesRetornado = controler.proximoDia(new Data(31, 1, 2020));
        Data proximoDiaEMesEsperado = new Data(1, 2, 2020);
        assertEquals(proximoDiaEMesEsperado, proximoDiaEMesRetornado);
    }

    @Test
    public void verificarProximoDiaDepoisDoDia30() {
        Controler controler = new Controler();
        Data proximoDiaEMesRetornado = controler.proximoDia(new Data(30, 4, 2020));
        Data proximoDiaEMesEsperado = new Data(1, 5, 2020);
        assertEquals(proximoDiaEMesEsperado, proximoDiaEMesRetornado);
    }

    @Test
    public void verificarProximoDiaNaViradaDoAno() {
        Controler controler = new Controler();
        Data proximoDiaEMesRetornado = controler.proximoDia(new Data(31, 12, 2019));
        Data proximoDiaEMesEsperado = new Data(1, 1, 2020);
        assertEquals(proximoDiaEMesEsperado, proximoDiaEMesRetornado);
    }
}