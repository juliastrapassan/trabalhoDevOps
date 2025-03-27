import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine().trim();

        if (nome.isEmpty()) {
            System.out.println("Nome inválido! Reinicie o programa e digite um nome válido.");
            return;
        }

        System.out.println("Olá, " + nome + "! Bem-vindo ao programa.");

        int opcao;
        do {
            opcao = exibirMenu(scanner); 

            switch (opcao) {
                case 1:
                    somarNumeros(scanner);
                    break;
                case 2:
                    contarCaracteresNome(nome);
                    break;
                case 3:
                    System.out.println("Saindo do programa. Até logo, " + nome + "!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }

    // Função para exibir um menu e capturar a escolha do usuário
    public static int exibirMenu(Scanner scanner) {
        System.out.println("\nEscolha uma opção:");
        System.out.println("1 - Somar dois números");
        System.out.println("2 - Contar caracteres do seu nome");
        System.out.println("3 - Sair");
        System.out.print("Opção: ");
        return scanner.nextInt();
    }

    // Função para somar dois números inseridos pelo usuário
    public static void somarNumeros(Scanner scanner) {
        System.out.print("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("A soma de " + num1 + " + " + num2 + " = " + resultado);
    }

    // Função para contar quantos caracteres tem o nome do usuário
    public static void contarCaracteresNome(String nome) {
        System.out.println("Seu nome tem " + nome.length() + " caracteres.");
    }
}