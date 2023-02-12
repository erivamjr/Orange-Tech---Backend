import java.util.*;

public class ExerciciosPropostosSet1 {
    /*
    As cores mais destacadas do arco-íris são: vermelha, laranja, amarela, verde, azul, azul-escuro e violeta.
     */
    public static void main(String[] args) {

        Set<String> cores = new HashSet<>(Arrays.asList("vermelha", "laranja", "amarela", "verde", "azul", "azul-escuro", "violeta"));

        System.out.println("--\tExiba todas as cores uma abaixo da outra\t---");

        for (String cor : cores) {
            System.out.println(cor);
        }

        System.out.println("--\tA quantidade de cores que o arco-íris tem\t---");

        System.out.println(cores.size());

        System.out.println("--\tExiba as cores em ordem alfabética\t---");

        Set<String> cores2 = new TreeSet<>(cores);

        System.out.println(cores2);

        System.out.println("--\tExiba as cores na ordem inversa da que foi informada\t---");

        List<String> cores3 = new ArrayList<>(cores);
        System.out.println(cores);
        Collections.reverse(cores3);
        System.out.println(cores3);

        System.out.println("--\tExiba todas as cores que começam com a letra ”v”\t---");

        for (String cor : cores) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("--\tRemova todas as cores que não começam com a letra “v”\t---");

        Iterator<String> iterator = cores.iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (!next.startsWith("v")) iterator.remove();
        }
        System.out.println(cores);

        System.out.println("--\tLimpe o conjunto\t---");

        cores.clear();
        System.out.println(cores);

        System.out.println("--\tConfira se o conjunto está vazio\t---");

        System.out.println(cores.isEmpty());


    }

}
