package exerciciosAula2;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int B,C,A;
	
	
	System.out.println("digite um numero A: ");
	A = ler.nextInt();
	
	System.out.println("digite um numero B: ");
	B = ler.nextInt();
	
	System.out.println("digite um numero C: ");
	C = ler.nextInt();
 
	if (A + B > C){
	System.out.println( A + "+" + B + ">" + C + "\nA soma do Numero A + B é maior que C" );
	}
	else if ( A + B < C ) {
		System.out.println( A + "+" + B + "<" + C + "\nA soma do Numero A + B nao é maior que C" );
		} 
	else if ( A + B == C ) {
		System.out.println( A + "+" + B + "=" + C + "\nA soma do Numero A + B é igual a C" );
		
}
}
}
