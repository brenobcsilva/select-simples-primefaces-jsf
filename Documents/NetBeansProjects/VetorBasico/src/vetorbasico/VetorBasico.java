package vetorbasico;

import java.text.DecimalFormat;
import java.util.Scanner;

public class VetorBasico {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[3];
		int[] vetorB = new int[3];
		double[] vetorC = new double[vetorA.length];
		double[] vetorD = new double[vetorB.length];
		
		
		for(int i=0; i<vetorA.length; i++){
			System.out.print("Digite um vetor " + i + " :");
			vetorA[i] = ler.nextInt();
			
			vetorC[i] = Math.sqrt(vetorA[i]);
		}

		for(int i=0; i<vetorB.length; i++){
			System.out.print("Digite um vetor " + i + " :");
			vetorB[i] = ler.nextInt();
			
			vetorD[i] = Math.sqrt(vetorB[i]);
		}
		
		System.out.println( );
		System.out.print("Vetor A =");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println( );
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.print("Vetor B = ");
		for (int i = 0; i < vetorA.length; i++) {
			System.out.print(df.format(vetorC[i]) + " ");
		}
		System.out.println( );
		System.out.print("Vetor C = ");
		for (int i = 0; i < vetorB.length; i++) {
			System.out.print(df.format(vetorD[i]) + " ");
		}
		
	}

}
