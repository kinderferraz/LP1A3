package ifsp.lp3a5.lista4;

import java.util.Arrays;
import java.util.List;

public class ex3 {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick",
                "Ana Clara", "Pedro", "Alfredo");
        nomes.stream()
                .filter(nome -> nome.toLowerCase().startsWith("w"))
                .findAny()
                .ifPresentOrElse(System.out::println,
                        () -> System.out.println("nenhuma pessoa com W encontrada."));
    }
}
