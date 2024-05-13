import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita e obtém os dados da conta bancária do cliente
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numero = scanner.nextInt();
        scanner.nextLine(); // Consumir a quebra de linha

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = scanner.nextDouble();

        // Ira exibir a mensagem com os dados da conta bancária do usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        
        scanner.close();
    }
}
