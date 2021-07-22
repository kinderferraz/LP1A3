package ifsp.lp3a5.lista5;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex1 {

    public static void main(String[] args) {

        Supplier<BigInteger> random = () -> new BigInteger(
                String.valueOf((int) Math.floor(Math.random() * 100 + 1)));

        List<BigInteger> numeros =  Stream.generate(random).limit(100).collect(Collectors.toList());

        System.out.println("Lista:");
        System.out.println(numeros + "\n");

        System.out.print("Soma: ");
        numeros.stream().reduce(BigInteger::add).ifPresent(System.out::println);

        System.out.println("Multipicação: " + numeros.stream()
                .reduce(new BigInteger("1"), BigInteger::multiply));

        System.out.print("Maior: ");
        numeros.stream().reduce(BigInteger::max).ifPresent(System.out::println);

        System.out.print("Menor: ");
        numeros.stream().reduce(BigInteger::min).ifPresent(System.out::println);
    }

}
