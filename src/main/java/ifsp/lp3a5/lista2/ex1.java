package ifsp.lp3a5.lista2;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;

public class ex1 {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(2, 4, 6, 8, 10);

        doSomething(arr, (n) -> n);
        doSomething(arr, n -> n * 2);
        doSomething(arr, n -> n * n);
        doSomething(arr, n -> n + 3);
    }

    public static void doSomething(List<Integer> arr, IntFunction<Integer> f) {
        arr.forEach(n -> System.out.print(f.apply(n) + ", "));
        System.out.println();
    }

}
