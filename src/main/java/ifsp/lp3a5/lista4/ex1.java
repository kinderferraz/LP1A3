package ifsp.lp3a5.lista4;

import java.util.Optional;

public class ex1 {
    public static void main(String[] args) {

        Optional<String> empty = Optional.empty();
        Optional<String> notEmpity = Optional.of("not null");

        System.out.println(empty.orElse("hello! it's me / I've been wondering if"));
        System.out.println(empty.orElseGet(() -> "after all these years you'd like to meet"));

        System.out.println(notEmpity.orElse("to go ooover"));
        System.out.println(notEmpity.orElseGet(() -> "everything"));

    }
}
