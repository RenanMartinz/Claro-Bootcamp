import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner Read = new Scanner(System.in);

        int numero = 1001;
        double saldo = 0;

        System.out.println("Seja bem vindo!");
        
        System.out.println("Por favor, digite o número da agência: ");
        String agencia = Read.nextLine();

        System.out.println("Agora, digite seu nome: ");
        String nomeCliente = Read.nextLine();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque." );


    }
}
