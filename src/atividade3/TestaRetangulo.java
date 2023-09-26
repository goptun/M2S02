package atividade3;

public class TestaRetangulo {
  public static void main(String[] args) {
    Retangulo retangulo = new Retangulo(10, 20);
    System.out.println(retangulo);
    System.out.println("Area: " + retangulo.calcularArea());
    System.out.println("Perimetro: " + retangulo.calcularPerimetro());
  }

}
