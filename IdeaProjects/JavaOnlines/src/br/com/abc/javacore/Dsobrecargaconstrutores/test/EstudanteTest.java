package br.com.abc.javacore.sobrecargaconstrutores.test;

import br.com.abc.javacore.sobrecargaconstrutores.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante est = new Estudante("654680","Breno",new double[]{5,7,9}, "20/11/1990");
        est.imprime();

    }
}
