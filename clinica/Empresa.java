package clinica;

public class Empresa extends Doacao {
  private String nome;
  private String endereco;

  public Empresa(String nome, String endereco){
    this.nome = nome;
    this.endereco = endereco;
  }

  public void receberDoacao() {
    System.out.format("A %s recebeu doação do Estado.\n", nome);
  }

  public void sairDoacao() {
    System.out.format("A %s doou para o PSF.\n", nome);
  }
  
  public final void divulgarEvento(){
    final String evento = "Outubro Rosa";
    System.out.format("A %s divulgou o evento %s na %s.",nome, evento, endereco);
  }
    
}