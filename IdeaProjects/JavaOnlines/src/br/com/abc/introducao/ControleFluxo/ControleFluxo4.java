package br.com.abc.introducao;

public class ControleFluxo4 {
    public static void main(String[] args) {

        int contador = 0;

/*        while(true){
            System.out.println(++contador);
        }

        for(int i=0; i<10; i++)
            System.out.println("O valor de i é: " + i);
*/
        for(int sobe=1, desce=10; sobe<=10 && desce>=1; sobe++, desce--){

            System.out.println("Valor de sobe: " + sobe);
            System.out.println("Valor de desce: " + desce);
        }

    }

}
