package exerciciosAula4;

import java.util.Scanner;

public class Exercicios2b {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
	    double[][] notas = new double[10][4];
		double[] medias = new double[10];

		  // Leitura das notas
		
	            for (int i = 0; i < 10; i++) {
                System.out.println("Digite as notas do participante " + (i + 1) + ":");
		        for (int j = 0; j < 4; j++) {
		        System.out.print("Nota " + (j + 1) + ": ");
		        notas[i][j] = leia.nextDouble(); } }

	      // Cálculo das médias
	  
		        for (int i = 0; i < 10; i++) 
		        {   double soma = 0;
		        for (int j = 0; j < 4; j++) 
		        { soma += notas[i][j];   }
		          medias[i] = soma / 4;  }

         // Exibição das médias
		        
		        System.out.println("\nMédias dos participantes:");
		        for (int i = 0; i < 10; i++) {
		        System.out.printf("Participante %d: %.1f\n", (i + 1), medias[i]);
	}
  }
}


