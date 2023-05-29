package exerciciosAula4;

import java.util.Scanner;

public class Exercicio1b {
public static void main(String[] args) {
	Scanner leia = new Scanner (System.in);
	int vetor[] = new int[10];
	
	// leitura do vetor
	
	     for (int i = 0; i < vetor.length; i++) {
         System.out.println("Digite o " + (i + 1) + "º Número: ");
         vetor[i] = leia.nextInt();}
        
	//separação e impressao dos impares 
	      
	     System.out.println("\nElementos nos indices impares : ");
         for (int i = 1; i < vetor.length; i++ ) { System.out.println(vetor[i] + ""); }
       
    //separação e impressao dos pares
         
         System.out.println("\nElementos pares :");
         for (int i = 0; i < vetor.length; i++) {
         if (vetor[i] % 2 == 0) { System.out.println(vetor[i] + "");} }
   
   // soma e media        
           
         int soma = 0;
         for (int i = 0; i < vetor.length; i++) { soma += vetor[i]; }

         double media = (double) soma / vetor.length;
    
   // impressao da media e da soma
          
         System.out.println("\n\nSoma: " + soma);
         System.out.println("Média: %.1f/n" + media);
}

}