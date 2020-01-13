package edu.ifal.calendario;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ControlerTest {

    @Test
    public void verificarProximoDiaDentroDoMes31DiasDepoisDoDia30() {
        Controler controler = new Controler();
        Data proximoDiaRetornado = controler.proximoDia(new Data(30, 3, 2020));
        Data proximoDiaEsperado = new Data(31, 3, 2020);
        assertEquals(proximoDiaEsperado, proximoDiaRetornado);
    }

    @Test
    public void verificarProximoDentroDoMes31DiasDepoisDoDia31() {
        Controler controler = new Controler();
        Data proximoDiaEMesRetornado = controler.proximoDia(new Data(31, 1, 2020));
        Data proximoDiaEMesEsperado = new Data(1, 2, 2020);
        assertEquals(proximoDiaEMesEsperado, proximoDiaEMesRetornado);
    }

    @Test
    public void verificarProximoDiaDentroDoMes30DiasDepoisDoDia29() {
        Controler controler = new Controler();
        Data proximoDiaRetornado = controler.proximoDia(new Data(29, 4, 2020));
        Data proximoDiaEsperado = new Data(30, 4, 2020);
        assertEquals(proximoDiaEsperado, proximoDiaRetornado);
    }

    @Test
    public void verificarProximoDiaDentroDoMes30DiasDepoisDoDia30() {
        Controler controler = new Controler();
        Data proximoDiaEMesRetornado = controler.proximoDia(new Data(30, 4, 2020));
        Data proximoDiaEMesEsperado = new Data(1, 5, 2020);
        assertEquals(proximoDiaEMesEsperado, proximoDiaEMesRetornado);
    }

    @Test
    public void verificarProximoDiaNaViradaDoAno() {
        Controler controler = new Controler();
        Data proximoDiaNaViradaDoAnoRetornado = controler.proximoDia(new Data(31, 12, 2019));
        Data proximoDiaNaViradaDoAnoEsperado = new Data(1, 1, 2020);
        assertEquals(proximoDiaNaViradaDoAnoEsperado, proximoDiaNaViradaDoAnoRetornado);
    }

    @Test
    public void verificarProximoDiaDoAnoNaoBissextoDoMesDeFevereiroDepoisDoDia28() {
        Controler controler = new Controler();
        Data proximoDiaEMesRetornado = controler.proximoDia(new Data(28, 2, 2019));
        Data proximoDiaEMesEsperado = new Data(1, 3, 2019);
        assertEquals(proximoDiaEMesEsperado, proximoDiaEMesRetornado);
    }

    @Test
    public void verificarProximoDiaDoAnoBissextoDoMesDeFevereiroDepoisDoDia28() {
        Controler controler = new Controler();
        Data proximoDiaRetornado = controler.proximoDia(new Data(28, 2, 2020));
        Data proximoDiaEsperado = new Data(29, 2, 2020);
        assertEquals(proximoDiaEsperado, proximoDiaRetornado);
    }

    @Test
    public void verificarProximoDiaDoAnoBissextoDoMesDeFevereiroDepoisDoDia29() {
        Controler controler = new Controler();
        Data proximoDiaRetornado = controler.proximoDia(new Data(29, 2, 2020));
        Data proximoDiaEsperado = new Data(1, 3, 2020);
        assertEquals(proximoDiaEsperado, proximoDiaRetornado);
    }
}