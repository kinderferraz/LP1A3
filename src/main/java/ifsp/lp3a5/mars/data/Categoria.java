package ifsp.lp3a5.mars.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.lang.Nullable;

@Data
@AllArgsConstructor
public class Categoria {

    @Nullable
    private int id;

    private String name;

}
