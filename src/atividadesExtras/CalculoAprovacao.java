package atividadesExtras;

import java.util.Scanner;

public class CalculoAprovacao {
  public static void main(String[] args) {
    Scanner user = new Scanner(System.in);

    System.out.print("Digite a primeira nota: ");
    double nota1 = user.nextDouble();

    System.out.print("Digite a segunda nota: ");
    double nota2 = user.nextDouble();

    System.out.print("Digite a terceira nota: ");
    double nota3 = user.nextDouble();

    System.out.print("Digite o número de faltas: ");
    int faltas = user.nextInt();

    double media = (nota1 + nota2 + nota3) / 3.0;

    double frequencia = ((double) (100 - faltas) / 100) * 100;

    if (media > 7.0 && frequencia > 75.0) {
      System.out.println("Aluno aprovado!");
    } else {
      System.out.println("Aluno reprovado");
    }

    System.out.printf("Média: %.1f%n", media);
    System.out.printf("Frequência: %.1f%%\n", frequencia);

    user.close();
  }
}
