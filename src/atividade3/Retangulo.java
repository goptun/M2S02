package atividade3;

public class Retangulo {
  private double comprimento;
  private double altura;

  public Retangulo(double comprimento, double altura) {
    this.setComprimento(comprimento);
    this.setAltura(altura);
  }

  public double getComprimento() {
    return this.comprimento;
  }

  public void setComprimento(double comprimento) {
    if (comprimento > 0) {
      this.comprimento = comprimento;
    }
  }

  public double getAltura() {
    return this.altura;
  }

  public void setAltura(double altura) {
    if (altura > 0) {
      this.altura = altura;
    }
  }

  public double calcularArea() {
    return this.getComprimento() * this.getAltura();
  }

  public double calcularPerimetro() {
    return 2 * (this.getComprimento() + this.getAltura());
  }

  public String toString() {
    return "Retangulo [comprimento=" + this.getComprimento() + ", altura=" + this.getAltura() + "]";
  }

}
