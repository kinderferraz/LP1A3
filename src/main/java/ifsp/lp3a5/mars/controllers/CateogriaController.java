package ifsp.lp3a5.mars.controllers;

import ifsp.lp3a5.mars.data.Categoria;
import ifsp.lp3a5.mars.data.CategoriaRepo;
import ifsp.lp3a5.mars.services.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(path = "/categorias")
public class CateogriaController {

    @Autowired
    CategoriaRepo categoriaRepo;

    Logger log = LoggerFactory.getLogger(CateogriaController.class);

    @GetMapping
    public ResponseEntity<List<Categoria>> getAllCategorias() {
        return ResponseEntity.ok(categoriaRepo.getCategorias());
    }

    @GetMapping(params = {"id"})
    public ResponseEntity<Categoria> getCategoriaById(@RequestParam Integer id) throws Exception {
        log.info("M=getCategoriaById, id = {}", id);
        return ResponseEntity.ok(categoriaRepo.findCategoria(id));
    }

    @PostMapping
    public ResponseEntity<Integer> postCategoria(@RequestBody Categoria categoria) {
        log.info("M=postCategoria, categoria = {}", categoria);
        return ResponseEntity.ok(categoriaRepo.addCategoria(categoria));
    }
}
