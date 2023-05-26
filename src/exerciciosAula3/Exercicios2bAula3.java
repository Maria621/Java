package exerciciosAula3;

import java.util.Scanner;

public class Exercicios2bAula3 {

	    public static void main(String[] args) {
	        Scanner ler = new Scanner(System.in);
	        int idade, sexo ,categoria;
	        int contadorBackend = 0;
	        int contadorFrontendMulheres = 0;
	        int contadorMobileHomens40Mais = 0;
	        int contadorFullStackMulheres30Menos = 0;
	        char continuar = 'S';

	        while (continuar == 'S') {
	            System.out.print("Digite a Idade: ");
	            idade = ler.nextInt();

	            System.out.print("Digite o Sexo (1 - Masculino, 2 - Feminino, 3 - Outros): ");
	            sexo = ler.nextInt();

	            System.out.print("Digite a Categoria (1 - Backend, 2 - Frontend, 3 - Mobile, 4 - FullStack): ");
	            categoria = ler.nextInt();

	            if (categoria == 1) {
	                contadorBackend++;
	            }

	            if (categoria == 2 && sexo == 2) {
	                contadorFrontendMulheres++;
	            }

	            if (categoria == 3 && sexo == 1 && idade > 40) {
	                contadorMobileHomens40Mais++;
	            }

	            if (categoria == 4 && sexo == 2 && idade < 30) {
	                contadorFullStackMulheres30Menos++;
	            }

	            System.out.print("Deseja continuar (S/N)? ");
	            continuar = ler.next().charAt(0);
	            continuar = Character.toUpperCase(continuar);
	        }

	        System.out.println("Total de pessoas desenvolvedoras Backend: " + contadorBackend);
	        System.out.println("Total de mulheres desenvolvedoras Frontend: " + contadorFrontendMulheres);
	        System.out.println("Total de homens desenvolvedores Mobile maiores de 40 anos: " + contadorMobileHomens40Mais);
	        System.out.println("Total de mulheres desenvolvedoras FullStack menores de 30 anos: " + contadorFullStackMulheres30Menos);
	    }
	}


