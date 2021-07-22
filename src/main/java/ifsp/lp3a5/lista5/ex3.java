package ifsp.lp3a5.lista5;

import java.util.Optional;
import java.util.Scanner;
import java.util.stream.Stream;

public class ex3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Um numero por favor: ");

        int num = sc.nextInt();
        sc.close();

        Optional<Integer> fatorial = Stream.iterate(1, i -> i <= num, i -> i + 1)
                .reduce((acc, n) -> acc * n);
        System.out.println("O fatorial é " + fatorial.orElse(-1));

    }

}
