package exerciciosAula3;

import java.util.Scanner;

public class Exercicios3bAula3 {
public static void main(String[] args) {	
	
		Scanner ler = new Scanner(System.in);
		int contador=0,num,soma = 0;
		
		do {
			System.out.println("Digite um numero: ");
			num = ler.nextInt();
			
			if( num % 3 == 0 ) {
				 soma += num;
	              contador++;
			}
		} while (num != 0);
		 if (contador > 0) {
		float media = (float) soma / 3;
		System.out.printf("\nA media dos numeros é %.1f" , media);
	}
}
}

