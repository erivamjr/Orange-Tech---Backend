import java.util.*;

import static javax.swing.UIManager.put;

public class ExerciciosPropostosMap1{
    public static void main(String[] args) {

        System.out.println("Crie um dicionário e relacione os estados e suas populações: ");
        Map<String, Double> populacaoEstimadaDoNE = new HashMap<>() {{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};
        System.out.println(populacaoEstimadaDoNE.toString());

        System.out.println("Substitua a população do estado do RN por 3.534.165: ");
        populacaoEstimadaDoNE.put("RN", 3.534165);

        System.out.println("Confira se o estado PB está no dicionário, caso não adicione: PB - 4.039.277: ");
        populacaoEstimadaDoNE.putIfAbsent("PB", 4.039277);

        System.out.println("Exiba a população PE: ");
        System.out.println(populacaoEstimadaDoNE.get("PE"));

        System.out.println("Exiba todos os estados e suas populações na ordem que foi informado: ");
        Map<String, Double> populacaoEstimadaDoNE1 = new LinkedHashMap<>(){{
            put("PE", 9.616621);
            put("AL", 3.351543);
            put("CE", 9.187103);
            put("RN", 3.534265);
        }};
        System.out.println(populacaoEstimadaDoNE1.toString());

        System.out.println("Exiba os estados e suas populações em ordem alfabética: ");
        Map<String, Double> populacaoEstimadaDoNE2 = new TreeMap<>(populacaoEstimadaDoNE);
        System.out.println(populacaoEstimadaDoNE2.toString());

        System.out.println("Exiba o estado com o menor população e sua quantidade: ");
        Double menorPopulacao = Double.MAX_VALUE;
        String estadoMenorPopulacao = "";
        for (Map.Entry<String, Double> entry : populacaoEstimadaDoNE.entrySet()) {
            if (entry.getValue() < menorPopulacao) {
                menorPopulacao = entry.getValue();
                estadoMenorPopulacao = entry.getKey();
            }
        }
        System.out.println(estadoMenorPopulacao + " - " + menorPopulacao);

        System.out.println("Exiba o estado com a maior população e sua quantidade: ");
        Double maiorPopulacao = Double.MIN_VALUE;
        String estadoMaiorPopulacao = "";
        for (Map.Entry<String, Double> entry : populacaoEstimadaDoNE.entrySet()) {
            if (entry.getValue() > maiorPopulacao) {
                maiorPopulacao = entry.getValue();
                estadoMaiorPopulacao = entry.getKey();
            }
        }
        System.out.println(estadoMaiorPopulacao + " - " + maiorPopulacao);

        System.out.println("Exiba a soma da população desses estados: ");
        Double soma = 0d;
        for (Double populacao : populacaoEstimadaDoNE.values()) {
            soma += populacao;
        }
        System.out.println(soma);

        System.out.println("Exiba a média da população deste dicionário de estados: ");
        System.out.println(soma / populacaoEstimadaDoNE.size());

        System.out.println("Remova os estados com a população menor que 4.000.000: ");
        Iterator<Double> iterator = populacaoEstimadaDoNE.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 4000000) iterator.remove();
        }
        System.out.println(populacaoEstimadaDoNE);

        System.out.println("Apague o dicionário de estados: ");
        populacaoEstimadaDoNE.clear();

        System.out.println("Confira se o dicionário está vazio: ");
        System.out.println(populacaoEstimadaDoNE.isEmpty());

    }

}
