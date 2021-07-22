package ifsp.lp3a5.lista3;

import javax.naming.InitialContext;
import java.util.stream.Stream;

public class ex5 {
    public static void main(String[] args) {
        Stream.iterate(new Integer[]{0, 1},
                pair -> new Integer[]{pair[0] + pair[1], pair[0]})
                .limit(10)
                .mapToInt(f -> f[0])
                .forEach(System.out::println);
    }
}
