package atividade1;

public class TestaData {
  public static void main(String[] args) {
    Data data = new Data(06, 21, 1993);

    System.out.print("Data: ");
    data.exbirData();

    data.setMes(01);
    data.setDia(23);
    data.setAno(2000);

    System.out.print("Data após alteração: ");
    data.exbirData();
  }
}