package br.com.abc.javacore.introducaoclasses.introducaometodos.test;

import br.com.abc.javacore.introducaoclasses.introducaometodos.classes.Professor;

public class ProfessorTest {
    public static void main(String[] args) {

        Professor prof = new Professor();
        prof.cpf = "122.222.222-20";
        prof.matricula = "1425365";
        prof.nome = "Breno";
        prof.rg = "6455-6";

        Professor prof2 = new Professor();
        prof2.cpf = "122.222.222-20";
        prof2.matricula = "1425365";
        prof2.nome = "Breno";
        prof2.rg = "6455-6";

        prof.imprime();

    }
}
