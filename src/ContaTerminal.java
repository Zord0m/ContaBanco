import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Por favor, digite o número da Agência: ");
        int numero = scanner.nextInt();

        System.out.print("Agora, digite o nome do cliente: ");
        scanner.nextLine();
        String nomeCliente = scanner.nextLine();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite a conta (no formato XXXX-X): ");
        String agencia = scanner.next();

        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        
        scanner.close();
    }
}
