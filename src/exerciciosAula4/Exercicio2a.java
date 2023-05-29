package exerciciosAula4;

import java.util.Scanner;

public class Exercicio2a {
public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int matrizinteira[][] = new int [3][3];
	int soma = 0 , soma2 = 0;
	
	//leitura da matriz e entrada dos dados
	
        System.out.println("Digite os numeros da Matriz: ");
        for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
        System.out.println("Elemento [" + (i + 1) + "][" + (j + 1) + "]: ");
            matrizinteira[i][j] = leia.nextInt(); }  }
        
    //impressão e leitura da diagonal principal
        
        System.out.println("Elementos da Diagonal Principal:");
	    for (int i = 0; i < matrizinteira.length; i++) {
	    System.out.print(matrizinteira[i][i] + " "); }
	    
	//impressão e leitura da diagonal segundaria
	    
	    System.out.println("\n\nElementos da Diagonal Secundária:");
	    for (int i = 0; i < matrizinteira.length; i++) {
	    System.out.print(matrizinteira[i][matrizinteira.length - i - 1] + " "); }
	    
	// soma das diagonais
	    
	    for (int i = 0; i < matrizinteira.length; i++) {
	
     	soma += matrizinteira[i][i];
        soma2 += matrizinteira[i][matrizinteira.length - i - 1]; }
	    
	// impressão dela
	    
       System.out.println("\nSoma dos Elementos da Diagonal Principal: " + soma);
       System.out.println("\nSoma dos Elementos da Diagonal Secundária: " + soma2);
 }
}
