package exerciciosAula2;
import java.util.Scanner;
public class Liçao2exercicio1 {

	public static void main(String[] args) {
		
		        
		        Scanner ler = new Scanner(System.in);
		        String produto = "";
		        int precoUnitario = 0;
		        
		        System.out.print("Código do Produto: ");
		        int codigo = ler.nextInt();
		       
		        System.out.print("Quantidade: ");
		        int quantidade = ler.nextInt();
		        ler.close();

		        // Atribuir nome do produto e preço unitário com base no código
		        switch (codigo) {
		            case 1:
		                produto = "Cachorro Quente";
		                precoUnitario = 10;
		                break;
		            case 2:
		                produto = "X-Salada";
		                precoUnitario = 15;
		                break;
		            case 3:
		                produto = "X-Bacon";
		                precoUnitario = 18;
		                break;
		            case 4:
		                produto = "Bauru";
		                precoUnitario = 12;
		                break;
		            case 5:
		                produto = "Refrigerante";
		                precoUnitario = 8;
		                break;
		            case 6:
		                produto = "Suco de laranja";
		                precoUnitario = 13;
		                break;
		            default:
		                System.out.println("Código do produto inválido.");
		                return;
		        }

		        // Cálculo do valor total da conta
		        int valorTotal = quantidade * precoUnitario;

		        // Impressão dos resultados
		        System.out.println("\nProduto: " + produto);
		        System.out.println("Valor total: R$ " + valorTotal);
	}}

	

