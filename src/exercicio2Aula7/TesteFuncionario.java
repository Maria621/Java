package exercicio2Aula7;

import java.util.Scanner;
import exercicio2Aula7.Funcionario;

public class TesteFuncionario {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criação do funcionário
        System.out.println("Bem-vindo!");
        System.out.println("Por favor, preencha os dados para criar seu Registro:");

        Funcionario funcionario = criarFuncionario(scanner);

        System.out.println("Registro criada com sucesso!");

        // Login
        System.out.println("\n--- Login ---");

        if (realizarLogin(scanner, funcionario)) {
            System.out.println("Login realizado com sucesso!");

            interagir(scanner, funcionario);
        } else {
            System.out.println("CPF ou senha incorretos. Acesso negado.");
        }

        scanner.close();
    }

    public static Funcionario criarFuncionario(Scanner scanner) {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("CPF: ");
        String CPF = scanner.next();
        scanner.nextLine();

        System.out.print("Senha: ");
        String senha = scanner.nextLine();

        System.out.print("PIS: ");
        String PIS = scanner.next();
        scanner.nextLine();

        System.out.print("Setor: ");
        String setor = scanner.nextLine();

        return new Funcionario(nome, PIS, senha, setor, CPF);
    }

    public static boolean realizarLogin(Scanner scanner, Funcionario funcionario) {
        System.out.print("CPF: ");
        String CPFLogin = scanner.next();
        scanner.nextLine();

        System.out.print("Senha: ");
        String senhaLogin = scanner.nextLine();

        return CPFLogin.equals(funcionario.getCPF()) && senhaLogin.equals(funcionario.getSenha());
    }

    public static void interagir(Scanner scanner, Funcionario funcionario) {
        int opcao;

        do {
            // Menu
            System.out.println("\n--- Menu ---");
            System.out.println("Selecione uma opção:");
            System.out.println("1. Visualizar dados");
            System.out.println("2. Editar dados");
            System.out.println("3. Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    funcionario.visualizar();
                    break;
                case 2:
                    System.out.println("Editar dados: ");
                    editarDados(scanner, funcionario);
                    break;
                case 3:
                    System.out.println("Sessão encerrada.");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while (opcao != 3);
    }

    public static void editarDados(Scanner scanner, Funcionario funcionario) {
        System.out.println("Selecione o campo que deseja editar:");
        System.out.println("1. Nome");
        System.out.println("2. CPF");
        System.out.println("3. Senha");
        System.out.println("4. PIS");
        System.out.println("5. Setor");
        System.out.print("Opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine();

        switch (opcao) {
            case 1:
                System.out.print("Novo nome: ");
                String novoNome = scanner.nextLine();
                funcionario.setNome(novoNome);
                System.out.println("Nome atualizado com sucesso.");
                break;
            case 2:
                System.out.print("Novo CPF: ");
                String novoCPF = scanner.next();
                scanner.nextLine();
                funcionario.setCPF(novoCPF);
                System.out.println("CPF atualizado com sucesso.");
                break;
            case 3:
                System.out.print("Nova senha: ");
                String novaSenha = scanner.nextLine();
                funcionario.setSenha(novaSenha);
                System.out.println("Senha atualizada com sucesso.");
                break;
            case 4:
                System.out.print("Novo PIS: ");
                String novoPIS = scanner.next();
                scanner.nextLine();
                funcionario.setPIS(novoPIS);
                System.out.println("PIS atualizado com sucesso.");
                break;
            case 5:
                System.out.print("Novo setor: ");
                String novosetor = scanner.nextLine();
                funcionario.setSetor(novosetor);
                System.out.println("Setor atualizado com sucesso.");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }
    }
}