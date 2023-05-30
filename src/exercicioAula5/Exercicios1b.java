package exercicioAula5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios1b {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	ArrayList<Double> num = new ArrayList <Double>();

            // Inicializa o ArrayList com 10 valores inteiros
            num.add(2.0);
            num.add(5.0);
            num.add(1.0);
            num.add(3.0);
            num.add(4.0);
            num.add(9.0);
            num.add(7.0);
            num.add(8.0);
            num.add(10.0);
            num.add(6.0);

            System.out.print("Digite o número que você deseja encontrar: ");
            double numeroBusca = leia.nextDouble();

            int posicao = -1;
            for (int i = 0; i < num.size(); i++) {
                if (num.get(i) == numeroBusca) {
                    posicao = i;
                    break;
                }
            }

            if (posicao != -1) {
                System.out.println("O número " + numeroBusca + " está localizado na posição: " + posicao);
            } else {
                System.out.println("O número " + numeroBusca + " não foi encontrado!");
            }
        }
    }
