public class Pessoa {
 private String nome;
    private int idade;

  // Construtor da classe Pessoa
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade= idade;
  }

  // Métodos para acessar os atributos
  public String getNome(){
    return nome;
  }

  public int getIdade(){
    return idade;
  }


  public static void main(String[] args) {
    // Criando três objetos Pessoa com nomes e idades diferentes

    Pessoa pessoa1 = new Pessoa("Matheus", 30);
    Pessoa pessoa2 = new Pessoa("Beatriz", 23);
    Pessoa pessoa3 = new Pessoa("Cauã", 4);

    // Exibindo informações das pessoas
    
    System.out.println("Pessoa1 - Nome: " + pessoa1.getNome() + " " + "Idade: " + pessoa1.getIdade());
    System.out.println("Pessoa2 - Nome: " + pessoa2.getNome() + " " + "Idade: " + pessoa2.getIdade());
    System.out.println("Pessoa3 - Nome: " + pessoa3.getNome() + " " + "Idade: " + pessoa3.getIdade());
   }
}
