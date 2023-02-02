import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostosList2 {
   

    public static void main(String[] args) {

        List<String> perguntas = new ArrayList<>();
        perguntas.add("Telefonou para a vítima?");
        perguntas.add("Esteve no local do crime?");
        perguntas.add("Mora perto da vítima?");
        perguntas.add("Devia para a vítima?");
        perguntas.add("Já trabalhou com a vítima?");

        List<String> respostas = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        for (String pergunta : perguntas) {
            System.out.println(pergunta);
            String resposta = scanner.next();
            respostas.add(resposta);
        }

        int contador = 0;
        for (String resposta : respostas) {
            if (resposta.equalsIgnoreCase("sim")) {
                contador++;
            }
        }

        if (contador == 2) {
            System.out.println("Suspeita");
        } else if (contador >= 3 && contador <= 4) {
            System.out.println("Cúmplice");
        } else if (contador == 5) {
            System.out.println("Assassina");
        } else {
            System.out.println("Inocente");
        }

    }
}
