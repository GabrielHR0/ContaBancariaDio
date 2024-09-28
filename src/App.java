import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        // Criação do objeto Scanner para receber os dados do terminal
        Scanner scanner = new Scanner(System.in);

        // Solicitação e leitura dos dados do usuário
        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta: ");
        int numero = scanner.nextInt();

        scanner.nextLine(); // Consumir a quebra de linha após o nextInt

        System.out.println("Por favor, digite o nome do Cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial: ");
        double saldo = scanner.nextDouble();

        // Criação de uma instância de Conta
        Conta conta = new Conta(numero, agencia, nomeCliente, saldo);

        // Exibição da mensagem formatada
        System.out.println(conta.exibirMensagem());

        // Fechar o scanner
        scanner.close();
    }
}
