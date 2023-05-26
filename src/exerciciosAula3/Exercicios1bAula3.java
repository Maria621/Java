package exerciciosAula3;

import java.util.Scanner;

public class Exercicios1bAula3 {
	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int i,contadorpar = 0;
        int contadorimpar = 0;

        for( i = 1; i <= 10; i++); {
        System.out.print("Digite o "+ i +"° número: ");
        int numero = ler.nextInt();
        

        if ( numero % 2 == 0  ) {  	contadorpar++;	
        	}   else { contadorimpar++; 	
        }    i++;
        
        }
        System.out.println("Total de números pares: " + contadorpar);
        System.out.println("Total de números ímpares: " + contadorimpar);
        
     }
}