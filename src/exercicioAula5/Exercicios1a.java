package exercicioAula5;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicios1a {
public static void main(String[] args) {
	ArrayList<String> cores = new ArrayList <String>();
	Scanner leia = new Scanner(System.in);

	System.out.println("Digite as cores (digite 'sair' para encerrar):" );
	
    for (String cor = leia.next(); !cor.equalsIgnoreCase("sair"); cor = leia.next()) {
    	System.out.println("Digite as cores (digite 'sair' para encerrar):" );
        cores.add(cor);
    }

    System.out.println("\nCores digitadas: \n");
    for (String corDigitada : cores) {
        System.out.println(corDigitada);
    }

    Collections.sort(cores);
    
    System.out.println("\nCores digitadas em ordem alfabética: \n");
     for (String cor : cores) {
        System.out.println(cor);
    
}
}
}
