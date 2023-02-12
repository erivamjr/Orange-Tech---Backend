import java.util.*;

public class ExerciciosPropostosSet2 {
    public static void main(String[] args) {


        System.out.println("--\tOrdem Aleatória\t---");

        Set<LinguagemFavorita> linguagens = new HashSet<>(){{
            add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("Kotlin", 2011, "IntelliJ"));
            add(new LinguagemFavorita("C#", 2000, "Visual Studio"));

        }};

        for (LinguagemFavorita linguagemFavorita : linguagens) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("--\tOrdem de Inserção\t---");

        Set<LinguagemFavorita> linguagens2 = new LinkedHashSet<>(){{
            add(new LinguagemFavorita("Java", 1995, "IntelliJ"));
            add(new LinguagemFavorita("JavaScript", 1995, "Visual Studio Code"));
            add(new LinguagemFavorita("Python", 1991, "PyCharm"));
            add(new LinguagemFavorita("Kotlin", 2011, "IntelliJ"));
            add(new LinguagemFavorita("C#", 2000, "Visual Studio"));

        }};

        for (LinguagemFavorita linguagemFavorita : linguagens2) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("--\tOrdem Natural (Nome)\t---");

        Set<LinguagemFavorita> linguagens3 = new TreeSet<>(linguagens2);

        for (LinguagemFavorita linguagemFavorita : linguagens3) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("--\tOrdem IDE\t---");

        Set<LinguagemFavorita> linguagens4 = new TreeSet<>(new ComparatorIde());
        linguagens4.addAll(linguagens2);

        for (LinguagemFavorita linguagemFavorita : linguagens4) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("--\tOrdem Ano de Criação e Nome\t---");

        Set<LinguagemFavorita> linguagens5 = new TreeSet<>(new ComparatorNome());
        linguagens5.addAll(linguagens2);

        for (LinguagemFavorita linguagemFavorita : linguagens5) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }

        System.out.println("--\tOrdem Nome, ano de criação e IDE\t---");

        Set<LinguagemFavorita> linguagens6 = new TreeSet<>(new ComparatorNomeAnoDeCriacaoIde());
        linguagens6.addAll(linguagens2);

        for (LinguagemFavorita linguagemFavorita : linguagens6) {
            System.out.println(linguagemFavorita.getNome() + " - " + linguagemFavorita.getAnoDeCriacao() + " - " + linguagemFavorita.getIde());
        }
    }
}

class LinguagemFavorita implements Comparable<LinguagemFavorita> {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LinguagemFavorita that = (LinguagemFavorita) o;
        return Objects.equals(nome, that.nome) && Objects.equals(anoDeCriacao, that.anoDeCriacao) && Objects.equals(ide, that.ide);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, anoDeCriacao, ide);
    }

    @Override
    public int compareTo(LinguagemFavorita linguagemFavorita) {
        return this.getNome().compareToIgnoreCase(linguagemFavorita.getNome());
    }
}

class ComparatorIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int ide = l1.getIde().compareToIgnoreCase(l2.getIde());
        if (ide != 0) return ide;

        return l1.compareTo(l2);
    }
}

class ComparatorNome implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;

        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

class ComparatorNomeAnoDeCriacaoIde implements Comparator<LinguagemFavorita> {

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareToIgnoreCase(l2.getNome());
        if (nome != 0) return nome;

        int ano = Integer.compare(l1.getAnoDeCriacao(), l2.getAnoDeCriacao());
        if (ano != 0) return ano;

        return l1.getIde().compareToIgnoreCase(l2.getIde());
    }
}

