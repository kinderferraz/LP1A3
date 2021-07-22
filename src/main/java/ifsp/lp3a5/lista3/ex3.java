package ifsp.lp3a5.lista3;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex3 {
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("Gerando 100 numeros aleatorios");
        Stream.generate(r::nextInt).limit(100).forEach(i -> {
            System.out.print(i + " ");
            System.out.println();
        });

        System.out.println("Para uma lista de 10 numeros aleatorios");
        List<Integer> ls = Stream.generate(r::nextInt).limit(10).collect(Collectors.toList());
        System.out.println("O menor numero é " + ls.stream().reduce(Integer::min));
        System.out.println("O maior numero é " + ls.stream().reduce(Integer::max));
        System.out.println("O tamanho da lista é " + ls.size());
        // prof, tentei deixar essa linha com stream, mas a IDE foi bastante insistente
        // de que esta não era uma boa prática

    }
}
