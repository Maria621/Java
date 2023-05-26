package exerciciosAula3;

import java.util.Scanner;

public class Exercicios2aAula3 {


	public static void main(String[] arg){    
		     Scanner ler = new Scanner(System.in);
		        int idade = 0; int contadormaior = 0; int contadormenor = 0;
		    
		       
		        while (idade >=0) {
		            System.out.print("Digite uma idade: ");
		            idade = ler.nextInt();

		            if (idade <21){     contadormenor++;    } 
		            else if (idade > 50) {  contadormaior++;  }  
		         
		               
		            }
		        System.out.println("Total de pessoas maiores de 50 anos: " + contadormaior);
		        System.out.println("Total de pessoas menores de 21 anos: " + contadormenor);
	}
}
