package exerciciosAula2;
import java.util.Scanner;

	public class Exercicio2 {
		
		public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int numero;

	        System.out.print("Digite um número: ");
	        numero = ler.nextInt();

	        if (numero % 2 == 0 && numero > 0) {
	          
	                System.out.println("O número " + numero + " é par e positivo!");
	            } else if (numero < 0) {
	                System.out.println("O número " + numero + " é par e negativo!");
	            } else {
	                System.out.println("O número é zero.");
	            }
		
	            if (numero > 0) {
	                System.out.println("O número " + numero + " é ímpar e positivo!");
	            } else if (numero < 0) {
	                System.out.println("O número " + numero + " é ímpar e negativo!");
	            } else {
	                System.out.println("O número é zero.");
	            }
	        }
		}

