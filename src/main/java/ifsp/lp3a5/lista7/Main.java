package ifsp.lp3a5.lista7;

import java.lang.reflect.Field;

public class Main {

    public static void main(String[] args) throws Exception {
        Musica duasDaTarde = new Musica("Duas da tarde", "3:41", "Silva", "Duas da tarde");
        Reflexao.refleteClasse(duasDaTarde);

        Class<?> musicaClass = Class.forName("ifsp.lp3a5.lista7.Musica");
        Object diaba = musicaClass.getConstructor().newInstance();

        Field F;
        F = diaba.getClass().getDeclaredField("titulo");
        F.setAccessible(true);
        F.set(diaba, "Diaba");

        F = diaba.getClass().getDeclaredField("duracao");
        F.setAccessible(true);
        F.set(diaba, "2:46");

        F = diaba.getClass().getDeclaredField("cantor");
        F.setAccessible(true);
        F.set(diaba, "Urias");

        F = diaba.getClass().getDeclaredField("cd");
        F.setAccessible(true);
        F.set(diaba, "Diaba");


        Reflexao.refleteClasse(diaba);
    }

}
