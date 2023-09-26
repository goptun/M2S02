package atividade4;

public class TestaFatura {
  public static void main(String[] args) {
    Fatura fatura1 = new Fatura("0123456789", "Mouse Vertical", 50, 549.90);

    System.out.println("Número da Fatura: " + fatura1.getNumero());
    System.out.println("Descrição: " + fatura1.getDescricao());
    System.out.println("Quantidade: " + fatura1.getQuantidade());
    System.out.println("Preço por Item: R$ " + fatura1.getPrecoPorItem());
    System.out.println("Valor da Fatura: R$ " + fatura1.getValorFatura());
  }
}
