package ifsp.lp3a5.lista1.ex11;

public class Main {
    public static void main(String[] args) {
        String[] aTestar = {"aaauiuouoiuia",
                "hkjhkjkjbdjjb",
                "Eu to linda, livre, leve, e solta"};

        for(String s : aTestar){
            Thread t = new Thread(new Contador(s));
            t.start();
        }
    }
}
