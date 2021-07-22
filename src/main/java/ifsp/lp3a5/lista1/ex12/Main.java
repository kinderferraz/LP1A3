package ifsp.lp3a5.lista1.ex12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int stop;
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o número de partida?");
        int start = sc.nextInt();
        sc.nextLine();

        do {
            System.out.println("Qual o número alvo?");
             stop = sc.nextInt();
            sc.nextLine();
        } while (stop < start);

        Thread t = new Thread(new Soma(start, stop));
        t.start();

        sc.close();
    }
}
