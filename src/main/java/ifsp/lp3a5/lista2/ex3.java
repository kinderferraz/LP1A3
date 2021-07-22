package ifsp.lp3a5.lista2;

import java.util.function.BiFunction;

public class ex3 {

    private static class Fatorial {
        static final BiFunction<Integer, Integer, Object> fatorial = (n, acc) -> n == 1
                ? acc
                : Fatorial.fatorial.apply(n - 1, acc * n);
    }

    public static void main(String[] args) {
        System.out.println("O fatorial de 5 é "  + Fatorial.fatorial.apply(5, 1));
        System.out.println("O fatorial de 10 é " + Fatorial.fatorial.apply(10, 1));
        System.out.println("O fatorial de 8 é "  + Fatorial.fatorial.apply(8, 1));
    }

}
