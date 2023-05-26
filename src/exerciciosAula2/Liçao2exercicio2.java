package exerciciosAula2;
import java.util.Scanner;

public class Liçao2exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String colaborador = "";
        int codigo = 0;
        float salario, reajuste;
        String cargo = "";
        float percentualReajuste = 0.0f;

        
        System.out.print("Nome do colaborador: ");
        colaborador = ler.nextLine();

        System.out.print("Código do cargo: ");
        codigo = ler.nextInt();

        System.out.print("Salário: R$ ");
        salario = ler.nextFloat();

        // Atribuir cargo e percentual de reajuste com base no código
        switch (codigo) {
            case 1:
                cargo = "Gerente";
                percentualReajuste = 0.1f;
                break;
            case 2:
                cargo = "Vendedor";
                percentualReajuste = 0.07f;
                break;
            case 3:
                cargo = "Supervisor";
                percentualReajuste = 0.09f;
                break;
            case 4:
                cargo = "Motorista";
                percentualReajuste = 0.06f;
                break;
            case 5:
                cargo = "Estoquista";
                percentualReajuste = 0.05f;
                break;
            case 6:
                cargo = "Técnico de TI";
                percentualReajuste = 0.08f;
                break;
            default:
                System.out.println("Código de cargo inválido.");
                return;
        }

        // Cálculo do novo salário
        reajuste = percentualReajuste * salario;
        float novoSalario = salario + reajuste;

        // Impressão dos resultados
        System.out.println("\nNome do colaborador: " + colaborador);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: R$ " + novoSalario);
    }
}
