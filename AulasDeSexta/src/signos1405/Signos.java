
package signos1405;

/**
 *
 * @author Thiago
 */
public class Signos {
    public int dia, mes;
    
    
    public void verificaSignos(){
        int erro = 0;
        if ((mes == 3 && dia >=21 && dia <= 31)||(mes == 4 && dia>=1 && dia<=20)){
            System.out.println("Seu signo é Áries!");
            erro += 1;
        } else {
        if ((mes == 4 && dia >=21 && dia <= 30)||(mes == 5 && dia>=1 && dia<=20)){
            System.out.println("Seu signo é Touro!");
            erro += 1;
        } 
        }
        if ((mes == 5 && dia >=21 && dia <= 31)||(mes == 6 && dia>=1 && dia<=20)){
            System.out.println("Seu signo é Gêmeos!");
            erro += 1;
        }
        if ((mes == 6 && dia >=21 && dia <= 30)||(mes == 7 && dia>=1 && dia<=21)){
            System.out.println("Seu signo é Câncer!");
            erro += 1;
        }
        if ((mes == 7 && dia >=22 && dia <= 31)||(mes == 8 && dia>=1 && dia<=22)){
            System.out.println("Seu signo é Leão!");
            erro += 1;
        }
        if ((mes == 8 && dia >=23 && dia <= 31)||(mes == 9 && dia>=1 && dia<=22)){
            System.out.println("Seu signo é Virgem!");
            erro += 1;
        }
        if ((mes == 9 && dia >=23 && dia <= 30)||(mes == 10 && dia>=1 && dia<=22)){
            System.out.println("Seu signo é Libra!");
            erro += 1;
        }
        if ((mes == 10 && dia >=23 && dia <= 31)||(mes == 11 && dia>=1 && dia<=21)){
            System.out.println("Seu signo é Escorpião!");
            erro += 1;
        }
        if ((mes == 11 && dia >=22 && dia <= 30)||(mes == 12 && dia>=1 && dia<=21)){
            System.out.println("Seu signo é Sagitário!");
            erro += 1;
        }
        if ((mes == 12 && dia >=22 && dia <= 31)||(mes == 1 && dia>=1 && dia<=20)){
            System.out.println("Seu signo é Capricórnio!");
            erro += 1;
        }
        if ((mes == 1 && dia >=21 && dia <= 30)||(mes == 2 && dia>=1 && dia<=19)){
            System.out.println("Seu signo é Aquário!");
            erro += 1;
        }
        if ((mes == 2 && dia >=20 && dia <= 28)||(mes == 3 && dia>=1 && dia<=20)){
            System.out.println("Seu signo é Peixes!");   
            erro += 1;
        }
        if (mes == 2 && dia == 29) {
                System.out.println("Seu signo é Peixes");
            erro += 1;
            }
        if (erro == 0){
            System.out.println("Ops, ocorreu algum erro!");
            System.out.println("Digite uma data válida!");
        }
    }
}
