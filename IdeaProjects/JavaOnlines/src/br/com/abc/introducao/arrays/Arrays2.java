package br.com.abc.introducao;

public class Arrays2 {
    public static void main(String[] args) {

        /*int[] idade = new int[3];
        System.out.println("Idade 1: " + idade[0]);
        System.out.println("Idade 2: " + idade[1]);
        System.out.println("Idade 3: " + idade[3]);*/

        String sobreNome="";

        String[] nomes = new String[3];
        nomes[0] = "Naruto";
        nomes[1] = "Goku";
        nomes[2] = "Luffy";

        for(int i=0; i<nomes.length; i++){
            System.out.println(nomes[i]);
        }

        nomes = new String[1];
        nomes[0] = "Breno";

        for(int i=0; i<nomes.length;i++){
            System.out.println("2" + nomes[i]);
        }

    }

}
