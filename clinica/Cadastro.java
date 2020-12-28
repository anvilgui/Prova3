package clinica;

public class Cadastro { 
  private String nome;
  private String sexo;
  private int idade;
    
  public Cadastro(String nome, String sexo, int idade){
    this.nome = nome;
    this.sexo = sexo;
    this.idade = idade;
  }

  protected String pegarGenero(){
    if(sexo.equalsIgnoreCase("feminino")){
      return String.format("A %s", nome);
      }else{
      return String.format("O %s", nome);
    }
  }

  public void dadosPessoais(){
    System.out.format("Nome: %s\nSexo: %s\nIdade: %d\n\n", nome, sexo, idade);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSexo() {
    return sexo;
  }

  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

}