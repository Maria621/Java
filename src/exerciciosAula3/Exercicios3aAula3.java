package exerciciosAula3;

import java.util.Scanner;

public class Exercicios3aAula3 {
  public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int num,soma = 0;
	
	do {
		System.out.println("Digite um numero: ");
		num = ler.nextInt();
		
		if( num > 0 ) {
            soma = soma + num;
		}
	} while (num != 0);
	System.out.println("\nA soma dos numeros é " + soma);
}
}