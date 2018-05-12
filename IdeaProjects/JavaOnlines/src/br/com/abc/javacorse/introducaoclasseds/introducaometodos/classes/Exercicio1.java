package br.com.abc.javacore.introducaoclasses.introducaometodos.classes;

import java.util.Scanner;

public class Exercicio1 {

    Scanner ler = new Scanner(System.in);

    public double idade, notas[];
    public String nome;

    public void passeiDeAno() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Notas: " + this.notas);
    }

    public void condicao(){
        double media=0;
        for(double var: notas){
            media += var/notas.length;
        }
        System.out.println(media);
        if(media>=6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
    }



}
