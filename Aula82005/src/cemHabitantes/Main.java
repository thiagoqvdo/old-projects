
package cemHabitantes;

import java.util.Scanner;

/**
 *
 * @author Thiago
 */
public class Main {

   
    public static void main(String[] args) {
        Verificacao v = new Verificacao();
        Scanner ler = new Scanner (System.in);
        
        v.maior = 0;
        System.out.print("Informe sua idade: ");
        v.idade = ler.nextInt();
        v.menor = v.idade;
        System.out.print("Informe seu sexo: ");
        v.sexo = ler.nextLine();
        v.sexo = ler.nextLine();
        System.out.print("Informe o seu salário: ");
        v.salario = ler.nextDouble();
        System.out.println("\n");
        v.verifica();
        
        v.numero = 1;
        while(v.numero<=4){
            System.out.print("Informe sua idade: ");
        v.idade = ler.nextInt();
        System.out.print("Informe seu sexo: ");
        v.sexo = ler.nextLine();
        v.sexo = ler.nextLine();
        System.out.print("Informe o seu salário: ");
        v.salario = ler.nextDouble();
        v.verifica();
            System.out.println("\n");
        v.numero++;
    }
        System.out.println(v.total);
        System.out.println("A média salarial do grupo é de "+v.media());
        System.out.println("A maior idade do grupo é de "+v.maior+ " anos");
        System.out.println("A menor idade do grupo é de "+v.menor+ " anos");
        System.out.println("Há "+v.mulheres+ " mulheres com salário até R$ 100");
    }
    
}
