import java.util.Scanner;

public class DesafioImoveisDisponiveis {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String frase = scanner.nextLine();
        String[] array = new String[3];

        array = frase.split("/");

        System.out.println("Imovel: " + array[0] + " R$" + array[1] + " " + array[2]);

        scanner.close();

    }
}
