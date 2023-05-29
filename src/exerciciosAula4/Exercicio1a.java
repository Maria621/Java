package exerciciosAula4;

import java.util.Scanner;

public class Exercicio1a {
    public static void main(String[] args) {
        int vetorinteiros[] = new int[10];
        Scanner leia = new Scanner(System.in);

     // leitura dos numeros do vetor
          for (int indice = 0; indice < 10; indice++) {
          System.out.println("Digite o " + (indice + 1) + "º Número: ");
          vetorinteiros[indice] = leia.nextInt(); }

    // pesquisa do numero desejado
        
          System.out.print("Digite o número que você deseja encontrar: ");
          int numeroDesejado = leia.nextInt();

          int posicao = pesquisarNumero(vetorinteiros, numeroDesejado);

          if (posicao != -1) {
          System.out.println("O número " + numeroDesejado + " está localizado na posição: " + posicao);
        } else {
          System.out.println("O número " + numeroDesejado + " não foi encontrado!");   } }

    // funçao para pesquisar o numero no vetor
    
          public static int pesquisarNumero(int[] vetor, int numero) {
          for (int i = 0; i < vetor.length; i++) {
          if (vetor[i] == numero) { return i; }  }
          return -1;
    }
}
