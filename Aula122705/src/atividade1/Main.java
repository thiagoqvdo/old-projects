
package atividade1;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int op;
        String verificaSexo = ("falso");
        Cadastro c = new Cadastro();
        
        
        
        CaesCadastrados cc = new CaesCadastrados();
        
        do{
            
            
            System.out.println("Escolha umas das opções abaixo:");
            System.out.println("1- Cadastrar cão");
            System.out.println("2- Mostrar cães cadastrados");
            op = ler.nextInt();
            
            switch (op){
                case 1:
                    System.out.print("Informe o nome do cão: ");
                    c.nome = ler.nextLine();
                    c.nome = ler.nextLine();
                    System.out.println("\n");
                    System.out.print("Informe o porte: ");
                    c.porte = ler.nextLine();
                    System.out.println("\n");
                    System.out.print("Informe a raça: ");
                    c.raca = ler.nextLine();
                    System.out.println("\n");
                    
                    
                    do{
                    System.out.print("Informe o sexo: ");
                    c.sexo = ler.nextLine();
                        
                    if ((c.sexo.equalsIgnoreCase("feminino") || (c.sexo.equalsIgnoreCase("masculino")))){
                        verificaSexo = ("verdade");
                    } else {
                        System.out.println("Ops! Algo deu errado, por favor informe um sexo válido!");
                        verificaSexo = ("falso");
                        System.out.println("\n");
                    }
                        
                    }while (verificaSexo.equalsIgnoreCase("falso"));
                    cc.cadastrar(c);
                    System.out.println("\n");
                    
                    break;
                case 2:
                    System.out.println("Cães cadastrados: \n"+ cc);
                    break;
                default:
                    System.out.println("Escolha uma opção válida!");
            }
            
        }while(op>0 && op<3);
        System.out.println("Programa encerrado!");
    }
        
    }

