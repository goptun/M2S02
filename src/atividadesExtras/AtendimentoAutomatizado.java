package atividadesExtras;

import java.util.Scanner;

public class AtendimentoAutomatizado {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);

    int opcao;

    System.out.println("Bem-vindo ao sistema de atendimento automatizado!");
    System.out.println("Escolha um departamento:");
    System.out.println("1. Depto Comercial");
    System.out.println("2. Depto Financeiro");
    System.out.println("3. Depto RH");

    System.out.print("Digite o número do deparmento desejado:");
    opcao = user.nextInt();

    switch (opcao) {
      case 1:
        System.out.println("Você selecionou o Depto Comercial");
        break;
      case 2:
        System.out.println("Você selecionou o Depto Financeiro");
        break;
      case 3:
        System.out.println("Você selecionou o Depto RH");
        break;
      default:
        System.out.println("Por favor, escolha uma opção válida!");
        break;
    }
    user.close();
  }
}
