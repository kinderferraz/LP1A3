package ifsp.lp3a5.lista3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

public class ex4 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick",
                "Ana Clara", "Pedro", "Alfredo");

        System.out.println("Nomes que começam com p:");
        nomes.stream().filter(nome -> nome.toLowerCase(Locale.ROOT).startsWith("p")).forEach(System.out::println);
        System.out.println();

        System.out.println("Nomes por tamanho:");
        nomes.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
        System.out.println();

        System.out.println("Nomes que começam com A");
        nomes.stream().map(nome ->
                nome.toLowerCase(Locale.ROOT).startsWith("a")
                        ? nome.concat(" - true")
                        : nome.concat(" - false"))
                .forEach(System.out::println);

        System.out.println();

        System.out.println("Nomes por tamanho, em maiusculo e separado por ,");
        String joinedNomes = nomes.stream()
                .sorted(Comparator.comparing(String::length))
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println(joinedNomes);
    }
}
