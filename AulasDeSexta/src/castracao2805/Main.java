
package castracao2805;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
       Scanner ler = new Scanner (System.in);
       
       int op = 0;
       CadastraCaes cc = new CadastraCaes();
       Cadastrados c1 = new Cadastrados();
       int qntdFemeas = 0, qntdMachos = 0, totalDeCaes = 0;
       boolean verificaSexo = false;
        
       
       do {
           Cadastrados c = new Cadastrados();
           c.divideLinha();
           System.out.println("Escolha uma das opções abaixo:");
           System.out.println("1- Cadastrar cão      2- Mostrar cães cadastrados     3- Pesquisar por porte de cães           9- Encerrar o programa");
           op = ler.nextInt();
           c.divideLinha();
           c.espacamento();
           switch (op) {
               case 1: 
                   c.divideLinha();
                    System.out.print("Informe o nome do cão: ");
                    c.nome = ler.nextLine();
                    c.nome = ler.nextLine();
                    c.espacamento();
                    
                    System.out.print("Informe o porte: ");
                    c.porte = ler.nextLine();
                    c.espacamento();
                    
                    System.out.print("Informe a raça: ");
                    c.raca = ler.nextLine();
                    c.espacamento();
                   
                    
                   do {
                       System.out.print("Informe o sexo: ");
                       c.sexo = ler.nextLine();
                       if (c.sexo.equalsIgnoreCase("masculino") || c.sexo.equalsIgnoreCase("feminino") || c.sexo.equalsIgnoreCase("macho") || c.sexo.equalsIgnoreCase("femea")){
                       verificaSexo = (true);
                       if (c.sexo.equalsIgnoreCase("masculino") || c.sexo.equalsIgnoreCase("macho")){
                       qntdMachos+=1;
                       totalDeCaes+=1;
                       } else {
                       qntdFemeas++;
                       totalDeCaes+=1;
                       }
                       } else {
                       verificaSexo = (false);
                       System.out.println("Você digitou um sexo inválido! Por favor uma opção válida! \n");
      }
                       
                   }while (verificaSexo==(false));
                   c.divideLinha();
                   
                   
                   cc.cadastra(c);
                   System.out.println("Cão registrado com sucesso!");
                   c.espacamento();
                   c.espacamento();
                   break;
               case 2: 
                   c.divideLinha();
                   System.out.println("Cães cadastrados: \n" + cc);
                   System.out.println( "Total de fêmeas: "+ qntdFemeas + "\n"+ "Total de machos: "+ qntdMachos + "\n"+ "Total de cães cadastrados: " + totalDeCaes);
                   c.divideLinha();
                   c.espacamento();
                   break;
               case 3:
                   c.divideLinha();
                   System.out.print("Informe o porte que deseja pesquisar: ");
                   c.porte = ler.nextLine();
                   c.porte = ler.nextLine();
                   System.out.println(cc.pesquisaPorte(c.porte));
                   c.divideLinha();
                   c.espacamento();
                   break;
                   
               case 9:
                   c.divideLinha();
                   System.out.println("Você deseja encerrar o programa?");
                   System.out.println("Digite 'sim' se quiser encerrar o programa, senão digite 'nao'!");
                   c.encerra = ler.nextLine();
                    
                   do{
                   c.encerra = ler.nextLine();
                   c.verificaEncerramento();
                       c.espacamento();
                   
           } while (c.verificaEncerra==(false));
                   c.divideLinha();
                   c.espacamento();
                   break;
                       
                   default:
                   System.out.println("Ops! Algo deu errado, informe uma opção válida!");
                       c.espacamento();
       
           
           } 
       } while(c1.encerra.equalsIgnoreCase("n") || c1.encerra.equalsIgnoreCase("nao"));
        System.out.println("Programa Encerrado!");
    }
    
    
    
}

