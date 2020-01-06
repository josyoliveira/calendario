package edu.ifal.calendario;

public class Principal {

    public static void main(String[] args) {
        Data data1 = new Data();
        data1.setDia(25);
        data1.setMes(3);
        data1.setAno(2015);

        Controler controler = new Controler();
        Data diaSeguinte = controler.proximoDia(data1);

        System.out.println(diaSeguinte);
    }
}