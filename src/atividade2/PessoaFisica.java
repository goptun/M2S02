package atividade2;

public class PessoaFisica {
  private String nome;
  private char sexo;
  private String dataNascimento;
  private String endereco;
  private String cpf;
  private String mensagemDeErro;

  public PessoaFisica(String nome, char sexo, String dataNascimento, String endereco, String cpf) {
    this.nome = nome;
    this.sexo = sexo;
    this.dataNascimento = dataNascimento;
    this.endereco = endereco;

    if (validarCPF(cpf)) {
      this.cpf = cpf;
    } else {
      this.mensagemDeErro = "CPF inválido";
    }
  }

  private boolean validarCPF(String cpf) {
    if (cpf.length() != 11) {
      return false;
    }

    for (int i = 0; i < cpf.length(); i++) {
      if (!Character.isDigit(cpf.charAt(i))) {
        return false;
      }
    }

    return true;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public char getSexo() {
    return sexo;
  }

  public void setSexo(char sexo) {
    this.sexo = sexo;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public String getEndereco() {
    return endereco;
  }

  public void setEndereco(String endereco) {
    this.endereco = endereco;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    if (validarCPF(cpf)) {
      this.cpf = cpf;
      this.mensagemDeErro = null;
    } else {
      this.mensagemDeErro = "CPF inválido";
    }
  }

  public void exibirMensagemDeErro() {
    if (mensagemDeErro != null) {
      System.out.println(mensagemDeErro);
    }
  }

  public void exibirPessoaFisica() {
    if (mensagemDeErro == null) {
      System.out.println("Nome: " + nome);
      System.out.println("Sexo: " + sexo);
      System.out.println("Data de Nascimento: " + dataNascimento);
      System.out.println("Endereço: " + endereco);
      System.out.println("CPF: " + cpf);
    } else {
      System.out.println("Mensagem de Erro: " + mensagemDeErro);
    }
  }
}
