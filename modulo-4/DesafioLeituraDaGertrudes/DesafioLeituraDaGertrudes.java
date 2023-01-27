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
/**
 * Desafio
 * Sua tia Gertrudes é uma leitora assídua. E ela gostaria de ter um aplicativo que dissesse para ela, de acordo com o número de páginas de um livro, quanto tempo ela levaria para ler lendo apenas 3 páginas por dia. Como você está aprendendo Java, você se disponibilizou para ajudá-la com esse desenvolvimento.
 * <p>
 * Entrada
 * A entrada será o número de páginas de um determinado livro
 * <p>
 * Saída
 * A saída deverá ser quanto tempo ela vai levar para ler esse livro
 * <p>
 * Exemplo
 * Entrada	Saída
 * 30	    "10 dias"
 * 15	      "5 dias"
 * 90	    "30 dias"
 */
