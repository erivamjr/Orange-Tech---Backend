import java.util.HashMap;
import java.util.Map;

public class ExerciciosPropostosMap2 {
    public static void main(String[] args) {
        /**
         * Faça um programa que simule um lançamento de dados.
         * Lance o dado 100 vezes e armazene.
         * Depois, mostre quantas vezes cada valor foi inserido.
         */

        Map<Integer, Integer> dados = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            int dado = (int) (Math.random() * 6 + 1);
            if (dados.containsKey(dado)) {
                dados.put(dado, dados.get(dado) + 1);
            } else {
                dados.put(dado, 1);
            }
        }

        for (Integer chave : dados.keySet()) {
            System.out.println("Valor: " + chave + " - Quantidade: " + dados.get(chave));
        }

    }

}
