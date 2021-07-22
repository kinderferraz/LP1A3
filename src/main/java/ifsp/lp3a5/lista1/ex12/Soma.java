package ifsp.lp3a5.lista1.ex12;

import java.util.ArrayList;

public class Soma implements Runnable {

    private final Integer start, stop;

    public Soma(Integer start, Integer stop) {
        this.start = start;
        this.stop = stop;
    }

    @Override
    public void run() {
        ArrayList<Integer> resultado = listarNumeros();
        System.out.println("Para somar " + stop + " a partir de " + start +
                " são necessários " + resultado.size());
        System.out.println(resultado);
        System.out.println(resultado.stream().reduce(0, Integer::sum));
    }

    private ArrayList<Integer> listarNumeros (){
        int soma = 0;
        ArrayList<Integer> resultado = new ArrayList<>();
        for (int i = start; soma < stop; i++) {
            soma += i;
            resultado.add(i);
        }
        return resultado;
    }

}
