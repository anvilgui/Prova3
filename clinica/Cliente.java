package clinica;

public class Cliente extends Cadastro{
    private int consulta;
    private int orcamento;

    public Cliente(String nome, String sexo, int idade, int consulta, int orcamento){
      super(nome, sexo, idade); 
      this.consulta = consulta;
      this.orcamento = orcamento;
    }

    public void cancelarConsulta(){
      String genero = pegarGenero();
      super.dadosPessoais();
      System.out.format("%s cancelou a consulta de número %d.\n\n", genero, consulta);
    }

    public int getConsulta() {
      return consulta;
    }

    public void setConsulta(int consulta) {
      this.consulta = consulta;
    }

    public void agendarOrcamento(){
      String genero = pegarGenero();
      super.dadosPessoais();
      System.out.format("%s agendou um orçamento de número %d.\n\n", genero, orcamento);
    }

    public int getOrcamento() {
      return consulta;
    }

    public void setOrcamento(int orcamento) {
      this.orcamento = orcamento;
    }

}