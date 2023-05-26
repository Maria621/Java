package exercicios;

import java.util.Scanner;

public class Codigo4 {

	public static void main(String[] args) {
	
		 Scanner leia = new Scanner(System.in);
			
	        float CalcularDiferença;
	        
			float n1,n2, n3, n4;

	        
	        System.out.println("Digite a numero 1:");
	        n1 = leia.nextFloat();
	       
	        System.out.println("Digite a numero 2:");
	        n2 = (float) leia.nextFloat();
	       
	        System.out.println("Digite a numero 3:");
	        n3 = leia.nextFloat();
	       
	        System.out.println("Digite a numero 4:");
	        n4 = leia.nextFloat();
	        
	        CalcularDiferença = n1 * n2 -  n3 * n4;
	        
	        System.out.printf("A diferença é : " +  CalcularDiferença);
	        
	        
	}

}
