package exerciciosAula6;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String nome;
		Integer  num;
		Queue<String> fila = new LinkedList<String>();
		
		System.out.println("\t Menu: \n\t 1- Adicionar cliente na Lista \n\t 2- Listar todos os clientes \n\t 3- Retirar o cliente da Fila \n\t 0- Sair");
	      System.out.println("digite um numero desejado: ");
          num = leia.nextInt();
	
      while(num != 0 ) {
    	if (num == 1) {
			 System.out.println("Digite o nome: " );
			 nome =leia.next();
		     fila.add(nome);  
		     System.out.println("\nCliente Adicionado!"); }
    	  
    	else if (num == 2) {  System.out.println("nomes na fila: \n" + fila);	} 
		
    	else if(num == 3)  { System.out.println( fila.poll());
    	System.out.println("\n Cliente foi Chamado !!");} 
    	
    	System.out.println("digite um numero desejado: ");
    	num = leia.nextInt();  }
    
        System.out.println("Programa finalizado!!");
      }
	}
