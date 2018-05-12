package br.com.abc.javacore.sobrecargametodos.test;

import br.com.abc.javacore.sobrecargametodos.classes.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario("Breno","654654",6546,88);
//        funcionario.init("Breno","2593681485",4500, 5464658);
//        funcionario.init("Breno", "68468", 4800, 56);
        funcionario.imprime();

    }
}
