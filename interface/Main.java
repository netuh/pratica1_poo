import java.util.Scanner;

import logica.Banco;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Banco b = new Banco("Banco de Belo Jardim");
    int acaoEscolhida = 0;
    System.out.printf("Olá, Bem-vindo ao %s\n", b.getNome());
    while (acaoEscolhida >= 0) {
      acaoEscolhida = menuAcoes(scanner);
      if (acaoEscolhida == 0) {
        int idConta = b.criarConta();
        System.out.println("Id da conta criada: " + idConta);
      } else if (acaoEscolhida == 1) {
        int contaEscolhida = lerNumeroConta(scanner);
        System.out.print("Quanto vocè quer depositar: ");
        float deposito = scanner.nextFloat();
        b.creditaConta(contaEscolhida, deposito);
      } else if (acaoEscolhida == 2) {
        int contaEscolhida = lerNumeroConta(scanner);
        System.out.print("Digite o valor do saque: ");
        float saque = scanner.nextFloat();
        b.debitaConta(contaEscolhida, saque);
      } else if (acaoEscolhida == 3) {
        int contaEscolhida = lerNumeroConta(scanner);
        System.out.println("saldo é " + b.getSaldo(contaEscolhida));
      }
    }
    scanner.close();
  }

  private static int lerNumeroConta(Scanner scanner) {
    int acaoEscolhida;
    System.out.print("Digite número da conta:");
    acaoEscolhida = scanner.nextInt();
    return acaoEscolhida;
  }

  private static int menuAcoes(Scanner scanner) {
    int acaoEscolhida;
    System.out.println("Digite o numero da conta [0 a 4] ou um valor menor que 0 para sair");
    System.out.println("0 - Criar Conta");
    System.out.println("1 - Deposito");
    System.out.println("2 - Sacar");
    System.out.println("3- Mostrar saldo");
    System.out.print("Digite opção:");
    acaoEscolhida = scanner.nextInt();
    return acaoEscolhida;
  }
}