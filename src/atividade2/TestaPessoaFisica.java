package atividade2;

public class TestaPessoaFisica {
  public static void main(String[] args) {
    PessoaFisica pessoa1 = new PessoaFisica("Matheus Ramos", 'M', "01/01/2023", "Rua do Fulano, 999",
        "0123456789");

    pessoa1.exibirPessoaFisica();

    pessoa1.setCpf("01234567890");

    System.out.println("----------------");
    System.err.println("Após ajuste do CPF: ");
    System.out.println("----------------");
    pessoa1.exibirPessoaFisica();
  }
}
