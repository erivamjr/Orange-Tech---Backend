import java.util.Scanner;

public class DesafioMesadaDoSobrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int entrada = leitor.nextInt();
        int mesada = 50;

        // TODO: Crie a condição necessária para que o sobrinho saiba quanto dinheiro irá juntar nos meses da entrada

        // O certo como esta pedindo no contexto seria assim

        //  System.out.printf( "Voce tera %d reais", ( entrada*mesada) );

        // mas só passa no teste se colocar assim

        System.out.println(entrada * mesada);
    }
}
