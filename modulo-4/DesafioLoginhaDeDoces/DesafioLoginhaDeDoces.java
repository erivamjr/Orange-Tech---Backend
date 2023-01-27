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
/**
 * Desafio
 * Uma lojinha de doces tem muitos clientes por ser ao lado de uma escola. Para aumentar as vendas o dono resolveu colocar uma máquina onde os clientes, principalmente as crianças que estão muito acostumadas com a tecnologia, poderiam colocar suas moedas e receber dois doces aleatórios. Cada 1 real irá render 2 doces aleatórios.
 * <p>
 * Entrada
 * A entrada será a quantidade de dinheiro que cada cliente, um por vez, possui.
 * <p>
 * Saída
 * A saída deverá ser a quantidade de doces que cada cliente conseguiu obter. (sem as aspas)
 * <p>
 * Exemplo
 * Entrada	Saída
 * 10	 "O cliente obteve 20 doces"
 * 20	 "O cliente obteve 40 doces"
 * 40	 "O cliente obteve 80 doces"
 */