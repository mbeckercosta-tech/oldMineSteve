public class Picareta {
    String materialP;
    String durabilidadeP;
    int força;

public void minerar(Bloco bloco){
    if (this.durabilidadeP <=0){
        System.out.println("A picareta está quebrada");
        return;
    }

    if (this.força < bloco.getDurabilidade()){
        System.out.println();
    }


}


}
