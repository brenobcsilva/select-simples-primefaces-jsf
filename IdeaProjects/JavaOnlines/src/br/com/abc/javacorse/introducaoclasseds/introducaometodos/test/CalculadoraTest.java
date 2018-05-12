package br.com.abc.javacore.introducaoclasses.introducaometodos.test;

import br.com.abc.javacore.introducaoclasses.introducaometodos.classes.Calculadora;

public class CalculadoraTest {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        calc.subtraiDoisNumeros();
        calc.multiplicaDoisNumeros(5,5);
        calc.divideDoisNumeros(10,0);
        calc.imprimeDoisNumerosDivididos(10,0);

        int[] numeros = new int[]{1,2,3,4,5};
        calc.somaArray(numeros);
        calc.somaVarArgs(1,2,3,4,5);


      /*int[] n = {10,20,30,40,50};
      calc.somarValoresArray(n);*/

    }

}
