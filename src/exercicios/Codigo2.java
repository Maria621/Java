package exercicios;

import java.util.Scanner;

public class Codigo2 {

    public static void main(String[] args) {
     
        Scanner leia = new Scanner(System.in);
		
        float n1, n2, n3, n4, media;
		
        System.out.println("Digite a nota 1:");
        n1 = leia.nextFloat();
       
        System.out.println("Digite a nota 2:");
        n2 = leia.nextFloat();
       
        System.out.println("Digite a nota 3:");
        n3 = leia.nextFloat();
       
        System.out.println("Digite a nota 4:");
        n4 = leia.nextFloat();
       
        media = (n1 + n2 + n3 + n4) / 4; 
        
        System.out.printf("Sua média foi de " + "%.1f" , media);
        
    }
}