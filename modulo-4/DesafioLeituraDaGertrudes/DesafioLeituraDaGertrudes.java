import java.util.Scanner;

public class DesafioLeituraDaGertrudes {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int paginas = 0;
        do {
            paginas = leitor.nextInt();
            int paginasLidas = 3;
        } while (paginas < 1);
        if (paginas <= 3) {
            System.out.println("1 dias");
        }else {
            System.out.printf("%d dias",paginas/3);
        }
    }
}

