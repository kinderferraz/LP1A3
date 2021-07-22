package ifsp.lp3a5.lista6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Objects;

public class ex2 {

    public static void main(String[] args) {

        String nome = readfile("nome.txt");
        String sobrenome = readfile("sobrenome.txt");

        System.out.println(nome + " " + sobrenome);
    }

    public static String readfile(String filename) {
        String path = Objects.requireNonNull(ex2.class.getResource(filename)).getFile();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            return bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
