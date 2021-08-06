package ifsp.lp3a5.mars.data;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CategoriaRepo {

    private final List<Categoria> categorias;

    public CategoriaRepo() {
        categorias = new ArrayList<>();
    }

    public List<Categoria> getCategorias() {
        return categorias;
    }

    public Integer addCategoria(Categoria categoria) {
        int id = 0;

        if (!categorias.isEmpty())
            id = categorias.size();

        categoria.setId(id);
        categorias.add(categoria);
        return id;
    }

    public Categoria findCategoria(Integer id) throws Exception {
        return categorias.stream()
                .filter(categoria -> categoria.getId() == id)
                .findFirst()
                .orElseThrow(Exception::new);
    }

}
