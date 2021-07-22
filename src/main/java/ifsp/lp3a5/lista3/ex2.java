package ifsp.lp3a5.lista3;

import java.util.stream.Stream;

public class ex2 {
    public static void main(String[] args) {
        Stream.iterate(0, i -> i <= 9, i -> i + 1)
                .filter(i -> i % 2 == 0)
                .skip(2)
                .limit(2)
                .map(i -> i * 2)
                .forEach(System.out::println);
    }
}
