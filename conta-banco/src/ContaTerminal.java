import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        
        try (//criando o objeto scanner
        Scanner scanner = new Scanner(System.in)) {
            {

                System.out.println("Por favor, digite o número da Agência !");
                String agencia = scanner.next();

                System.out.println("Por favor, o numero da Conta");
                int numeroConta= scanner.nextInt();

                System.out.println("Por favor, digite o nome do Cliente:");
                String nomeCliente= scanner.next();

                System.out.println("Saldo disponivel");
                double numeroSaldo = scanner.nextDouble();
               
                //Exibir a mensagem de conta criada.
                String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %s e seu saldo é R$%.2f. Já está disponível para saque!", nomeCliente, agencia, numeroConta, numeroSaldo);
                System.out.println(mensagem);
            }
        }
    }
}