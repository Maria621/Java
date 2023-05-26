package exercicios;

import java.util.Scanner;

public class Codigo3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
        float SalarioBruto,AdicionalNoturno,HorasExtra,Desconto,SalarioLiquido;
        
        System.out.println("Digite o salário Bruto:");
        SalarioBruto = leia.nextFloat();
       
        System.out.println("Digite o adicional noturno:");
        AdicionalNoturno = leia.nextFloat();
        
        System.out.println("Digite a horas extra:");
        HorasExtra = leia.nextFloat();
       
        System.out.println("Digite o desconto:");
        Desconto = leia.nextFloat();
        
        SalarioLiquido = SalarioBruto + AdicionalNoturno + HorasExtra * 5 - Desconto;
        
        System.out.printf("Novo Salário é: " +"%.2f" , SalarioLiquido);
        
	}

}
