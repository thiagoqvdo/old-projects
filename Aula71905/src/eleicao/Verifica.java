
package eleicao;

/**
 *
 * @author Thiago
 */
public class Verifica {
    public int ze, mane, popo, numero, erro, subtracao;
    public String voto;
    
    
    public void verificacao(){
        
   if (this.voto.equalsIgnoreCase("ze")|| (this.voto.equalsIgnoreCase("ze das couves")) || (this.voto.equalsIgnoreCase("zé")) || (this.voto.equalsIgnoreCase("1")) || (this.voto.equalsIgnoreCase("zé das couves"))){
       ze+=1;
   } else if (this.voto.equalsIgnoreCase("mane") || (this.voto.equalsIgnoreCase("2"))|| (this.voto.equalsIgnoreCase("mane do pilão"))){
       mane+=1;
       
   } else if (this.voto.equalsIgnoreCase("popo")|| (this.voto.equalsIgnoreCase("popó")) || (this.voto.equalsIgnoreCase("3")) || (this.voto.equalsIgnoreCase("popo dos pobres")) || (this.voto.equalsIgnoreCase("popó dos pobres"))){
       popo+=1;
   } else {
       System.out.println("Ops! Algo deu errado, digite um cadidato válido!");
      numero-=1;
      
   }
  }
    public void vencedor(){
        if (this.ze > this.mane && this.ze > this.popo){
            System.out.println("O candidato eleito é Zé das couves!");
        } else if (this.mane > this.ze && this.mane > this.popo){
            System.out.println("O candidato eleito é Mane do Pilão!");
        } else if (this.popo > this.ze && this.popo > this.mane){
            System.out.println("O candidato eleito é Popó dos pobres!");
        } else if (this.mane == this.ze && this.popo < this.mane && this.popo < this.ze){
            System.out.println("Os candidatos Zé das couves e Mane do Pilão empataram!");
        } else if (this.mane == this.popo && this.ze < this.mane && this.ze < this.popo){
            System.out.println("Os candidatos Popó dos pobres e Mane do Pilão empataram!");
        } else if (this.ze == this.popo && this.mane < this.ze && this.mane < this.popo){
            System.out.println("Os candidatos Zé das couves e Mane do Pilão empataram!");
        }
    }
}