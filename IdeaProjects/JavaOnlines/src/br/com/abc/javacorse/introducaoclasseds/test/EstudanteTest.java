package br.com.abc.javacore.introducaoclasses.test;

import br.com.abc.javacore.introducaoclasses.classes.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {

        Estudante joao = new Estudante();
        joao.nome = "Breno";
        joao.matricula = "1212";
        joao.idade = 27;

        System.out.println(joao.nome + " " + joao.matricula + " " + joao.idade);
    }
}
