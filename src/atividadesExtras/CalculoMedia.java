package atividadesExtras;

import java.util.Scanner;

public class CalculoMedia {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = user.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = user.nextDouble();

    System.out.print("Digite a terceira nota: ");
    double nota3 = user.nextDouble();

    double media = (nota1 + nota2 + nota3) / 3.0;

    System.out.printf("Media %.1f%n ", media);

    if (media > 7.0) {
      System.out.println("Aprovado!");
    } else {
      System.out.println("Reprovado.");
    }
    user.close();
  }
}
