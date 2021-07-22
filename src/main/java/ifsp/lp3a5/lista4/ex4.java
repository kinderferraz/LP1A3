package ifsp.lp3a5.lista4;

import java.util.Arrays;
import java.util.List;

public class ex4 {
    public static void main(String[] args) throws Exception {
        List<String> nomes = Arrays.asList("Paulo", "Camila", "Ana Maria", "Patrick",
                "Ana Clara", "Pedro", "Alfredo");
        nomes.stream()
                .filter(nome -> nome.toLowerCase().startsWith("w"))
                .findAny()
                .orElseThrow(Exception::new);
    }
}
