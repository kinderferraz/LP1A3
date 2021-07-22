package ifsp.lp3a5.lista3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ex1 {
    private static boolean duplicate = true;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o último número da lista?");
        int last = sc.nextInt();

        List<Integer> list = Stream
                .iterate(1, i -> i <= last, ex1::getNext)
                .collect(Collectors.toList());

        System.out.println("Mostrando todos os números");
        list.forEach(System.out::print);
        System.out.println();

        System.out.println("Mostrando todos os números sem repetição");
        list.stream().distinct().forEach(System.out::print);
        System.out.println();

        System.out.println("Ímpares");
        list.stream().distinct().filter(i -> i % 2 != 0).forEach(System.out::print);
        System.out.println();

        System.out.println("Pares");
        list.stream().distinct().filter(i -> i % 2 == 0).forEach(System.out::print);
        System.out.println();

        System.out.println("Maiores que 5");
        list.stream().distinct().filter(i -> i > 5).forEach(System.out::print);
        System.out.println();

        System.out.println("Vezes 4");
        list.stream().distinct().map(i -> i * 4).forEach(System.out::print);
        System.out.println();

        sc.close();
    }

    private static int getNext(int i) {
        int next = duplicate ? i : i+1;
        duplicate = ! duplicate;
        return next;
    }
}
