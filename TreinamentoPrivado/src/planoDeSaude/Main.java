package planoDeSaude;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
      Scanner ler = new Scanner (System.in);
      boolean encerramento = false;
      String verifica;
      boolean verificacao = false;
     Cadastramento cc = new Cadastramento();
      
      do {
          int op;
          Cadastra c = new Cadastra();
          
          System.out.println("Escolha uma das opções abaixo: ");
          System.out.println("1- Cadastrados paciente        2- Mostrar lista de paciente       3- Pesquisar paciente         9- Encerrar o programa");
          op = ler.nextInt();
          c.pulaLinha();
          c.divideLinha();
          
          switch (op){
              case 1: 
                  System.out.print("Informe o nome: ");
                  c.nome = ler.nextLine();
                  c.nome = ler.nextLine();
                  c.pulaLinha();
                  
                  System.out.print("Informe o cpf: ");
                  c.cpf = ler.nextLong();
                  c.pulaLinha();
                  
                  System.out.print("Informe o número para contato: ");
                  c.numero = ler.nextLong();
                  c.pulaLinha();
                 
                  System.out.print("Informe o endereço: ");
                  c.endereco = ler.nextLine();
                  c.endereco = ler.nextLine();
                  c.pulaLinha();

                  System.out.print("Informe o cep: ");
                  c.cep = ler.nextLong();
                  cc.fazCadastro(c);
                  c.pulaLinha();
                  c.divideLinha();
                  break;
                  
              case 2:
                  System.out.println(cc.toString());
                  
                  break;
                  
                  
              case 3:
                  System.out.print("Informe o CPF do paciente que deseja procurar: ");
                  c.cpf = ler.nextLong();
                  System.out.println(cc.pacientePesquisado(c.cpf));
                  
                  break;
                  
              case 9:
                  do{
                  System.out.println("Deseja encerrar o programa?");
                  System.out.println("Digite sim, para encerrar o programa e nao para permanecer!");
                  verifica = ler.nextLine();
                  if (verifica.equalsIgnoreCase("sim") || verifica.equalsIgnoreCase("s")){
                      encerramento = true;
                      verificacao = true;
                      
                  } 
                  if (verifica.equalsIgnoreCase("nao") || verifica.equalsIgnoreCase("n")){
                      encerramento = false;
                      verificacao = true;
                  }
                  } while(verificacao == false);
              
                  
          }
            
          
      } while(encerramento == false);
      
        
    }
    
}
