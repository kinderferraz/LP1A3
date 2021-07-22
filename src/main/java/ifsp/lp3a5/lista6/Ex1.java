package ifsp.lp3a5.lista6;

import java.util.Scanner;

public class Ex1 {

    public static void readNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite dois números");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 < 0    || n2 < 0)    throw new IllegalArgumentException("Erro: número negativo");
        if (n1 > 1000 || n2 > 1000) throw new IllegalArgumentException("Erro: digite um número menor que 1000");

        System.out.println(n1 / (float) n2);

        sc.close();
    }

    public static void main(String[] args) {
        try {
            readNumbers();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Não divida por 0, você vai quebrar o mundo.");
        } catch (Exception e) {
            System.out.println("Outra exceção, ixi!");
        } finally {
            System.out.println("Execução finalizada.");
        }

    }
}
