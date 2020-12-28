package clinica;

public final class Medico extends Cadastro { //CLASSE FILHA DE PESSOA
  private String especialidade;
  private double salario;

  public Medico(String nome, String sexo, int idade, String especialidade){
    super(nome, sexo, idade);
      this.especialidade = especialidade;
  }

  public void receber(){
    salario = 15429;
    System.out.format("O Dr %s recebe um salário de %.2f.\n", getNome(), salario);
  }
    
  public void receber(double aumento){
    aumento = 670;
    salario = 15429+ aumento;
    System.out.format("O Dr. %s recebeu um aumento de R$%.2f e seu salario atual é: R$%.2f.\n\n\n", getNome(), aumento, salario);
  }
  
  public void informacoesPessoais(){
    System.out.format("Nome: %s\nSexo: %s\nIdade: %d\nEspecialidade: %s\n\n", getNome(), getSexo(), getIdade(), getEspecialidade());
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

}