import java.util.Scanner;

public class SistemaConveniencia {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

  }
}

        
        do {
            System.out.println("Selecione a tela que deseja acessar:");
            System.out.println("1 - Tela de cadastro");
            System.out.println("2 - Tela de consulta");
            System.out.println("3 - Tela de atualização");
            System.out.println("4 - Tela de exclusão");
            System.out.println("0 - Sair do sistema");
            
    while (!scanner.hasNextInt()) {
      System.out.println("O valor inserido não é um número inteiro. Tente novamente.");
      scanner.next();
    }
    num = scanner.nextInt();
    System.out.println("O número inserido foi: " + num);

            switch (opcao) {
                case 1:
                    System.out.println("Você acessou a tela de cadastro.");
                    break;
                case 2:
                    System.out.println("Você acessou a tela de consulta.");
                    break;
                case 3:
                    System.out.println("Você acessou a tela de atualização.");
                    break;
                case 4:
                    System.out.println("Você acessou a tela de exclusão.");
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
            
            System.out.println(); // Adiciona uma linha em branco para melhorar a legibilidade do output
            
        } while (opcao != 0);
        
        input.close();
    }
}
