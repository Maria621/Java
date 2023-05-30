package exercicioAula5;

import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;
public class Exercicios2a {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		Set <Integer> num = new HashSet<Integer>();
		

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o número " + (i + 1) + ": ");
            Integer numero = leia.nextInt();
            num.add(numero);
        }

        System.out.println("\nListar dados do Set:");
        Iterator<Integer> iterator = num.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            System.out.println(numero);
        }
        System.out.println("\n\nListar dados do Set (valores únicos em ordem crescente):");
        Set<Integer> numerosOrdenados = new TreeSet<>(num);
        iterator = numerosOrdenados.iterator();
        while (iterator.hasNext()) {
            Integer numero = iterator.next();
            System.out.println(numero);
        }
       
    }
}
