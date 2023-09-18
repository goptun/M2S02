import java.util.Scanner;

public class MaiorValor {
  public static void main(String[] args) {
    
    Scanner user = new Scanner(System.in);

    System.out.print("Digite o primeiro valor: ");
    double valor1 = user.nextDouble();

    System.out.print("Digite o segundo valor: ");
    double valor2 = user.nextDouble();

    System.out.print("Digite o terceiro valor: ");
    double valor3 = user.nextDouble();

    double maiorValor = valor1;

    if (valor2 > maiorValor){
      maiorValor = valor2;
    }

    if (valor3 > maiorValor){
      maiorValor = valor3;
    }

    System.out.println("O maior valor é: " + maiorValor);


    user.close();
  }
}
