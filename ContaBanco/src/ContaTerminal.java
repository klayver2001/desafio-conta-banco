import java.util.Scanner;


public class ContaTerminal {
    /**
     * 
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita o numero da Agencia como String

        System.out.println("Digite o número da Agência:");
        String agencia = scanner.nextLine();

        // Solicita o numero da Conta como Int
        System.out.println("Digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine();

        // Solicita o nome do cliente em String
        System.out.println("Por favor, digite o seu nome:");
        String nomeCliente = scanner.nextLine();

        // Solicita o saldo como Double
        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Exibe a mensagem com os dados da conta bancária
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + numero + " e seu saldo é R$" + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
