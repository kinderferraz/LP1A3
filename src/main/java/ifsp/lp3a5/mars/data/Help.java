package ifsp.lp3a5.mars.data;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class Help {

    List<String> fields;
    List<String> methods;

}
