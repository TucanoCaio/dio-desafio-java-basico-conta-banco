import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Olá, para iniciarmos a criação de conta, por favor, insira o primeiro nome do cliente : ");
        String nomeCliente = entrada.next();

        System.out.println("Agora, insira o ultimo nome do cliente : ");
        String sobrenomeCliente = entrada.next();

        System.out.println("Insira o numero da agencia com hifen (-): ");
        String agencia = entrada.next();

        System.out.println("Insira o numero da conta: ");
        int numeroConta = entrada.nextInt();

        System.out.println("Insira o valor do saldo inicial: ");
        double saldo = entrada.nextDouble();

        System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta +" e seu saldo " + String.format("R$ %.2f", saldo) + " já está disponível para saque.");

    }
}
