import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExerciciosPropostosList1 {
 
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Double temp = 0.0;
        Double soma = 0.0;
        Double media = 0.0;
        List<Double> temperaturas = new ArrayList<>();
        List<String> meses = new ArrayList<>(Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"));

        for (int i = 0; i < 6; i++) {
            System.out.println("Digite a temperatura do mês " + (i + 1));
            temp = scan.nextDouble();
            temperaturas.add(temp);
            soma += temp;
        }

        media = soma / temperaturas.size();

        System.out.println("A média semestral das temperaturas é: " + media);

        for (int i = 0; i < temperaturas.size(); i++) {
            if (temperaturas.get(i) > media) {
                System.out.println("Temperatura acima da média: " + temperaturas.get(i) + " no mês " + (i + 1) + " - " + (meses.get(i)));
            }
        }

    }
}
