package ifsp.lp3a5.lista7;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Reflexao {

    public static void refleteClasse(Object obj) throws IllegalAccessException {
        System.out.println("Informaçoes da classe:");
        System.out.println("Nome da classe: " + obj.getClass().getName());
        System.out.println("Nome canonico da classe: " + obj.getClass().getCanonicalName());
        System.out.println("Tipo da classe: " + obj.getClass().getTypeName());

        Field[] attrs = obj.getClass().getDeclaredFields();
        for (Field f : attrs) {
            f.setAccessible(true);
            System.out.println(f.getType().getTypeName() + " " + f.getName() + ": " + f.get(obj));
        }

        Method[] methods = obj.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getReturnType().getSimpleName() + " " +
                    method.getName() +
                    "(" + Arrays.toString(method.getParameterTypes()) + ");");
        }

        System.out.println("\n\n");
    }
}
