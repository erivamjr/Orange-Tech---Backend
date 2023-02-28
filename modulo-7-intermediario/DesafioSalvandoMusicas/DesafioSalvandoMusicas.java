import java.util.Scanner;

public class DesafioSalvandoMusicas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arquivo = scanner.nextLine();
        if (arquivo.endsWith(".mp3")) {
            System.out.println("Salvar");
        } else {
            System.out.println("Deletar");
        }
    }
}
