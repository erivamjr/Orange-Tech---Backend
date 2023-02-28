import java.util.Scanner;

public class DesafioDcMonalds {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        String[] ingredientes = leitor.nextLine().split(";");
        for (String ingrediente : ingredientes) {
            System.out.println(ingrediente);
        }

        leitor.close();

    }
}
