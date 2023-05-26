package exercicios;

import java.util.Scanner;

public class Codigo1 {
	
	public static void main(String[] args) {
		
		        Scanner leia = new Scanner(System.in);
				
		        float salario, abono, novoSalario;
				
		        System.out.println("Digite o salário:");
		        salario = leia.nextFloat();
		       
		        System.out.println("Digite o abono:");
		        abono = leia.nextFloat();
		       
		        novoSalario = salario + abono; 
		        
		        System.out.printf("Novo Salário é: " +"%.2f" , novoSalario);
		    }
		}


