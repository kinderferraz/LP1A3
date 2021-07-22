package ifsp.lp3a5.lista4;

import java.util.Optional;

public class ex2 {
    public static void main(String[] args) {
        Optional<Integer> comValor = Optional.of(12);
        Optional<Integer> semValor = Optional.empty();

        testarThrow(comValor);
        testarThrow(semValor);
    }

    private static void testarThrow(Optional<Integer> valor) {
        try {
            System.out.println(valor.orElseThrow(IllegalArgumentException::new));
        } catch (Exception ignored) {
            System.out.println("nao preenchida");
        }
    }


}
