package exerciciosAula6;

import java.util.Stack;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner leia =new Scanner(System.in);
		Stack<String> pilha = new Stack<String>(); 
		Integer num; String livro;
		System.out.println("\t Menu: \n\t 1- Adicionar Livro na Pilha  \n\t 2- Listar todos os Livros \n\t 3- Retirar o Livro da Pilha \n\t 0- Sair");
	      System.out.println("digite o numero desejado: ");
          num = leia.nextInt();
          leia.nextLine(); // Consumir a quebra de linha

	
          while (num != 0) {
              if (num == 1) {
                  System.out.println("Digite o Livro: ");
                  livro = leia.nextLine();
                  pilha.add(livro);
                  System.out.println("\nO Livro foi Adicionado!");
              } else if (num == 2) {
                  System.out.println("nomes na pilha: \n" + pilha);
              } else if (num == 3) {
                  System.out.println(pilha.pop());
                  System.out.println("\n O Livro foi retirado !!\n");
              }

              System.out.println("digite um numero desejado: ");
              num = leia.nextInt();
              leia.nextLine(); // Consumir a quebra de linha
          }

          System.out.println("Programa finalizado!!");
      }
  }