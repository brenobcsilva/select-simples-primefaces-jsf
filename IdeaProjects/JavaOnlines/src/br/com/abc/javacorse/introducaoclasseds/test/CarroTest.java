package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.placa="QWJ1029";
        carro.modelo="Fusca";
        carro.velocidadeMaxima=120f;
        System.out.println(carro.velocidadeMaxima);
        System.out.println(carro.placa);
        System.out.println(carro.modelo);

    }
}
