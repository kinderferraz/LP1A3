package ifsp.lp3a5.lista2.ex4;

import java.util.ArrayList;
import java.util.List;

public class ex4 {

    public static void main(String[] args) throws InterruptedException {
        List<Avaliacao> notas = new ArrayList<>();
        Thread t = new Thread(() -> {
            notas.add(new Avaliacao("kinder", "lp3", 9));
            notas.add(new Avaliacao("rogerio", "lp3", 10));
            notas.add(new Avaliacao("cesar fernandes", "lp3", 4));
            notas.add(new Avaliacao("honolulu", "lp3", 7));
        });
        t.start();
        t.join();

        notas.stream()
                .sorted((o1, o2) -> o1.compare(o1, o2))
                .filter(avaliacao -> avaliacao.getNota() > 6)
                .forEach(avaliacao -> System.out.println(avaliacao.aluno + ", " + avaliacao.getNota()));
    }
}
