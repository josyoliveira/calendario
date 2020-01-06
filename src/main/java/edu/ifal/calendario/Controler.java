package edu.ifal.calendario;

public class Controler {

    public Data proximoDia(Data dataAtual) {
        Data diaSeguinte = new Data(0, 0, 0);

        if (dataAtual.getMes() % 2 != 0 && dataAtual.getDia() == 31) {
            diaSeguinte.setMes(1);
            diaSeguinte.setMes(dataAtual.getMes() + 1);
        } else {
            diaSeguinte.setDia(dataAtual.getDia() + 1);
            diaSeguinte.setMes(dataAtual.getMes());
        }
        diaSeguinte.setAno(dataAtual.getAno());

        return diaSeguinte;
    }

    // public Data proximoDiaEMes(Data dataAtual) {
    // Data diaEMesSeguinte = new Data(0, 0, 0);
    // diaEMesSeguinte.setDia(dataAtual.getDia() + 1);
    // if (diaEMesSeguinte.getMes() > 31) {
    // diaEMesSeguinte.setMes(0);
    // }
    // diaEMesSeguinte.setMes(dataAtual.getMes() + 1);
    // diaEMesSeguinte.setAno(dataAtual.getAno());
    // return diaEMesSeguinte;
    // }
}