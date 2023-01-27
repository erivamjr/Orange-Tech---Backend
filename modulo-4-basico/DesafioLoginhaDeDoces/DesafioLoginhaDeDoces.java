import java.util.Scanner;

public class DesafioLoginhaDeDoces {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int doce = 0;
        do {
            doce = leitor.nextInt();
        } while (doce < 1);
        System.out.printf("O cliente obteve %d doces", doce * 2);
    }
}
