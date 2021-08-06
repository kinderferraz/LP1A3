package ifsp.lp3a5.mars.controllers;

import ifsp.lp3a5.mars.data.Conta;
import ifsp.lp3a5.mars.services.ContaService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/account")
public class ContaController {

    @Autowired
    ContaService contaService;

    @GetMapping
    public ResponseEntity<Conta> getConta() throws RuntimeException {
        return contaService.getConta();
    }

    Logger log = LoggerFactory.getLogger(ContaController.class);

    @PostMapping
    public ResponseEntity<Void> atualizarSaldo() {
        log.info("M=atualizarSaldo");
        contaService.updateConta();
        return ResponseEntity.ok().build();
    }

}
