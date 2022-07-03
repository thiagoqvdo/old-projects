
package castracao2805;

/**
 *
 * @author Thiago
 */
public class Cadastrados {
    public String nome, porte, raca, sexo;
    
    boolean verificaEncerra = false;
    String encerra = "n";
    
   public String getPorte(){
        return porte;
    }

  public void divideLinha(){
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }
  public void espacamento(){
      System.out.println("\n");
  }
  
   
  
  public void verificaEncerramento(){
      if(this.encerra.equalsIgnoreCase("sim") || this.encerra.equalsIgnoreCase("s") || this.encerra.equalsIgnoreCase("nao") || this.encerra.equalsIgnoreCase("n")){
                       this.verificaEncerra = true;
                   } else {
                       System.out.println("Ops! Algo deu errado! Por favor digite 'sim' para encerrar ou 'nao' para permanecer no programa!");
                       this.verificaEncerra = false;
                   }
  }
   
    @Override
    public String toString() {
        return "\n"+ "Nome: " + nome + "\n"+ "Porte: " + porte + "\n"+ "Raça: " + raca + "\n"+ "Sexo: " + sexo + "\n" + "\n";
    }

    
    
    
    
    
}
