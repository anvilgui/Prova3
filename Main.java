import clinica.Cadastro;
import clinica.Cliente;
import clinica.Medico;
import clinica.Empresa;

public class Main {
  public static void main(String[] args) {
    System.out.println("Classe (Cadastro).");
    Cadastro c1 = new Cadastro("Selma", "Feminino", 51);
    c1.dadosPessoais();

    System.out.println("Classe (Cliente).");
    Cliente c2 = new Cliente("Livia", "Feminino", 43, 8290, 12);
    c2.cancelarConsulta();

    Cliente c3 = new Cliente("Gerson", "Masculino", 19, 9531, 54);
    c3.agendarOrcamento();

    System.out.println("Classe (Medico).");
    Medico c4 = new Medico("Nathan", "Masculino", 53, "ardiologista");
    c4.dadosPessoais(); 
    c4.receber();
    c4.receber(1); 
        
    Medico c5 = new Medico("Caroline", "Feminino", 53, "Ortopedista");
    c5.dadosPessoais(); 

    System.out.println("Classe (Empresa).");
    Empresa empresa1 = new Empresa("Clínica de Saúde", "Avenida 17, Centro, Ituiutaba-MG");
    empresa1.receberDoacao();
    empresa1.sairDoacao();
    empresa1.divulgarEvento();

  }

}