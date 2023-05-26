package exerciciosAula3;

import java.util.Scanner;

public class Exercicios1aAula3 {
	
	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	       int num1,num2,contador;
	       System.out.print("Digite o primeiro número do intervalo: ");
	        num1 = ler.nextInt();
	        System.out.print("Digite o último número do intervalo: ");
	        num2 = ler.nextInt();
	       if (num1 < num2) {
	            for (contador = num1; contador < num2; contador++) {
	                if (contador % 3 == 0 && contador % 5 == 0) {
	                    System.out.println(contador + " é divisível por 3 e 5.");
	                }
	   }
	}

	       else {
	    	   System.out.println("Número inválido.");
	       }
	    	   }
}