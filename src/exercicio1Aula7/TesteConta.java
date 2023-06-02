package exercicio1Aula7;

import java.util.Scanner;
import exercicio1Aula7.Cliente;
import exercicio1Aula7.Conta;

public class TesteConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do cliente
        System.out.println("Bem-vindo ao Internet Banking!");
        System.out.println("Por favor, preencha os dados para criar sua conta:");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("Telefone: ");
        String telefone = scanner.nextLine();

        System.out.print("Número do cartão: ");
        String cartao = scanner.nextLine();

        Cliente cliente = new Cliente(nome, email, senha, telefone, cartao);

        System.out.println("Conta criada com sucesso!");

        // Login
        System.out.println("\n--- Login ---");

        System.out.print("Email: ");
        String emailLogin = scanner.nextLine();

        System.out.print("Senha: ");
        String senhaLogin = scanner.nextLine();

        if (emailLogin.equals(cliente.getEmail()) && senhaLogin.equals(cliente.getSenha())) {
            System.out.println("Login realizado com sucesso!");

            Conta conta = new Conta();

            int opcao;
            do {
                // Menu
                System.out.println("\n--- Menu ---");
                System.out.println("Selecione uma opção:");
                System.out.println("1. PIX");
                System.out.println("2. Saldo");
                System.out.println("3. Saque");
                System.out.println("4. Pagar Conta");
                System.out.println("5. Sair");
                System.out.println("6. Depositar");
                System.out.print("Opção: ");
                opcao = scanner.nextInt();
                scanner.nextLine(); // Limpa o buffer do teclado

                switch (opcao) {
                    case 1:
                        System.out.print("Digite o destino do PIX: ");
                        String destinoPix = scanner.nextLine();
                        System.out.print("Digite o valor do PIX: ");
                        double valorPix = scanner.nextDouble();
                        scanner.nextLine(); // Limpa o buffer do teclado
                        conta.realizarPix(destinoPix, valorPix);
                        break;
                    case 2:
                        conta.visualizar();
                        break;
                    case 3:
                        System.out.print("Digite o valor do saque: ");
                        double valorSaque = scanner.nextDouble();
                        conta.sacar(valorSaque);
                        break;
                    case 4:
                        System.out.print("Digite o beneficiário: ");
                        scanner.nextLine(); // Limpa o buffer do teclado
                        String beneficiario = scanner.nextLine();
                        System.out.print("Digite o valor da conta: ");
                        double valorConta = scanner.nextDouble();
                        conta.pagarConta(beneficiario, valorConta);
                        break;
                    case 5:
                        System.out.println("Sessão encerrada.");
                        break;
                    case 6:
                        System.out.print("Digite o valor do depósito: ");
                        double valorDeposito = scanner.nextDouble();
                        conta.depositar(valorDeposito);
                        break;
                    default:
                        System.out.println("Opção inválida.");
                        break;
                }
            } while (opcao != 5);
        } else {
            System.out.println("Email ou senha incorretos. Acesso negado.");
        }
    }
}
