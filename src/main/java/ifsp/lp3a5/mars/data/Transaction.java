package ifsp.lp3a5.mars.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {

    @Nullable
    private Integer id;

    private Double amount;

    private LocalDateTime date;

    private String description;

    @Nullable
    private Categoria categoria;

}
