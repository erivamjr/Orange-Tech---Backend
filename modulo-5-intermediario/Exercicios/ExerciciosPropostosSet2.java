import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class ExerciciosPropostosSet2 {
    public static void main(String[] args) {

        // Exercício
        // Crie um conjunto com as 5 linguagens de programação favoritas de uma pessoa,
        // depois adicione mais 3 linguagens de programação nesse conjunto,
        // verifique se o conjunto está vazio, exiba no console todas as linguagens que possuem
        // uma letra 'a' nesse nome, depois remova todas as linguagens que não possuem 'm' nesse nome
        // e exiba as linguagens no console, depois limpe o conjunto e verifique se ele está vazio,
        // use o método iterator() para exibir as linguagens no console.

        Set<LinguagemFavorita> linguagens = new HashSet<>(Set.of(
                new LinguagemFavorita("Java", 1995, "IntelliJ"),
                new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"),
                new LinguagemFavorita("Python", 1991, "PyCharm"),
                new LinguagemFavorita("Kotlin", 2011, "IntelliJ"),
                new LinguagemFavorita("C#", 2000, "Visual Studio")
        ));

        System.out.println("Exercício 1");
        System.out.println(linguagens);

        linguagens.add(new LinguagemFavorita("C", 1972, "Code::Blocks"));
        linguagens.add(new LinguagemFavorita("C++", 1983, "Code::Blocks"));
        linguagens.add(new LinguagemFavorita("PHP", 1995, "Visual Studio Code"));

        System.out.println(linguagens.contains(new LinguagemFavorita("Java", 1995, "IntelliJ")));
        System.out.println(linguagens.size());


        System.out.println(linguagens.isEmpty());

        for (LinguagemFavorita linguagem : linguagens) {
            if (linguagem.getNome().startsWith("J") && linguagem.getNome().endsWith("a")) {
                System.out.println(linguagem);
            }
        }


        for (LinguagemFavorita linguagem : linguagens) {
            if (linguagem.getNome().contains("a")) {
                System.out.println(linguagem);
            }
        }

        linguagens.removeIf(linguagem -> !linguagem.getNome().contains("m"));
        System.out.println(linguagens);


        linguagens.clear();
        System.out.println(linguagens.isEmpty());




        linguagens = new HashSet<>(Set.of(
                new LinguagemFavorita("Java", 1995, "IntelliJ"),
                new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"),
                new LinguagemFavorita("Python", 1991, "PyCharm"),
                new LinguagemFavorita("Kotlin", 2011, "IntelliJ"),
                new LinguagemFavorita("C#", 2000, "Visual Studio")
        ));

        linguagens.add(new LinguagemFavorita("C", 1972, "Code::Blocks"));
        linguagens.add(new LinguagemFavorita("C++", 1983, "Code::Blocks"));
        linguagens.add(new LinguagemFavorita("PHP", 1995, "Visual Studio Code"));

        Iterator<LinguagemFavorita> iterator = linguagens.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


    }
}

class LinguagemFavorita {
    private String nome;
    private Integer anoDeCriacao;
    private String ide;

    public LinguagemFavorita(String nome, Integer anoDeCriacao, String ide) {
        this.nome = nome;
        this.anoDeCriacao = anoDeCriacao;
        this.ide = ide;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getAnoDeCriacao() {
        return anoDeCriacao;
    }

    public void setAnoDeCriacao(Integer anoDeCriacao) {
        this.anoDeCriacao = anoDeCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "LinguagemFavorita{" +
                "nome='" + nome + '\'' +
                ", anoDeCriacao=" + anoDeCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }
}