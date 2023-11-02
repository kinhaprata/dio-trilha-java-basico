import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
    
        try //Conhecer e importar a classe Scanner.
         (Scanner scanner = new Scanner(System.in)) {

            //Obter pela scanner os valores digitados no terminal.
             System.out.println("Por favor, digite o número da Agência !");
             String agencia = scanner.next();

             System.out.println("Por favor, o número da Conta");
             int numeroConta= scanner.nextInt();

             System.out.println("Por favor, digite o nome do Cliente:");
             String nomeCliente= scanner.next();

            System.out.println("Saldo disponível");
            double numeroSaldo = scanner.nextDouble();
                   
            //Exibir a mensagem de conta criada.
             String mensagem = "Olá " + nomeCliente + ",obrigado por criar uma conta em nosso banco,sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + numeroSaldo + " já está disponível para saque.";         
             System.out.println(mensagem);
        }
            }
        
    }
