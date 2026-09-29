import java.util.Scanner;

public class Menu {
    static void main() {


        Scanner scanner = new Scanner(System.in);

        System.out.println("1 - criando picareta de madeira")
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            picaretaAtual = new picareta("madeira", 10, 5);
        } else if (escolha == 2) {
            picaretaAtual = new Picareta("pedra", 20, 10);
        } else if (escolha == 3) {
            picaretaAtual = new picareta("ferro", 40, 20);
        } else if (escolha == 4) {
            picaretaAtual = new picareta("diamante", 100, 50);
        }

    }

    }






private Picareta picaretaAtual;


}