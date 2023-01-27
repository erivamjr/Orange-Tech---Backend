import java.util.Scanner;

public class DesafioIndustriaDaMulta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidadeAtual = 0;

        do {
            velocidadeAtual = leitor.nextInt();
        } while (velocidadeAtual < 1);
        if (velocidadeAtual <= 60) {
            System.out.println("Nao foi multado");
        } else {
            System.out.println("Foi multado");
        }

    }
}
