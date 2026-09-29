public class Picareta {
    String materialP;
    int durabilidadeP;
    int força;

public void minerar(Bloco bloco){
    if (força < bloco.getDurabilidadeB()){
        System.out.println("A picareta está quebrada :(");
        return;
    }
    else {
        System.out.println("Bloco minerado!");



    }


}
public Picareta(String materialP, int durabilidadeP, int força){
this.materialP = material;
this.durabilidadeP = durabilidade;
this.força = força;
}


}
