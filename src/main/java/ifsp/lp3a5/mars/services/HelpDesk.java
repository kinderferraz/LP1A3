package ifsp.lp3a5.mars.services;

import ifsp.lp3a5.mars.data.Help;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Collectors;

@Component
public class HelpDesk {

    public ResponseEntity<Help> getHelp(Class<?> cls) {

        Help body = new Help();
        Field[] fields = cls.getDeclaredFields();
        body.setFields(Arrays.stream(fields)
                .map(Field::getName)
                .collect(Collectors.toList()));

        Method[] methods = cls.getMethods();
        body.setMethods(Arrays.stream(methods)
                .map(Method::getName)
                .collect(Collectors.toList()));

        return ResponseEntity.ok(body);

    }

}
