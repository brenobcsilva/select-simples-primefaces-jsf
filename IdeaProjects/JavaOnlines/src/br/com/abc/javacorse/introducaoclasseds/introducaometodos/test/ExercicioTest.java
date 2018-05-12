package br.com.abc.javacore.introducaoclasses.introducaometodos.test;

import br.com.abc.javacore.introducaoclasses.introducaometodos.classes.Exercicio1;

public class ExercicioTest {
    public static void main(String[] args) {

        Exercicio1 exe = new Exercicio1();
        exe.passeiDeAno();
        exe.nome="Breno";
        exe.idade=27;
        exe.notas=new double[]{30,3};
        exe.condicao();

    }

}
