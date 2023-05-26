package exerciciosAula2;

import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner  ler = new Scanner(System.in);
		String nome;
		boolean primeira = false;
		int idade;
		
		 System.out.print("Digite o nome do doador? ");
	     nome = ler.next();
	     
	     System.out.print("Digite o idade do doador? ");
	     idade = ler.nextInt();
	     
	     System.out.print("É sua primeira vez doando? ");
	     primeira = ler.nextBoolean();
	 
		   
	    if (idade >= 18 && idade <= 69 && idade >= 60 && primeira == false)
	  {
		System.out.print(nome +" voce esta apto a doar.");
	}
	
	else {
		System.out.print(nome +" voce não esta apto a doar.");
	}
	   }
	}
	

	   
