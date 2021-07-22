package ifsp.lp3a5.lista5;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ex2 {

    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick",
                "Ana Clara", "Pedro", "Alfredo");

        System.out.println("Nomes com p concatenados por virgula");
        nomes.stream()
                .filter(nome -> nome.toLowerCase(Locale.ROOT).startsWith("p"))
                .reduce((acc, nome) -> acc + ", " + nome).ifPresent(System.out::println);

        System.out.println("\nNomes com a concatenados por virgula");
        nomes.stream()
                .filter(nome -> nome.toLowerCase(Locale.ROOT).startsWith("a"))
                .reduce((acc, nome) -> acc + ", " + nome).ifPresent(System.out::println);

        System.out.println("\nTodos os nomes concatenados por virgula");
        nomes.stream()
                .reduce((acc, nome) -> acc + ", " + nome).ifPresent(System.out::println);
    }

}
