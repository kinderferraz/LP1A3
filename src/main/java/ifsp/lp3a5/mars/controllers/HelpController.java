package ifsp.lp3a5.mars.controllers;

import ifsp.lp3a5.mars.data.Categoria;
import ifsp.lp3a5.mars.data.Conta;
import ifsp.lp3a5.mars.data.Help;
import ifsp.lp3a5.mars.data.Transaction;
import ifsp.lp3a5.mars.services.HelpDesk;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("help")
public class HelpController {

    Logger logger = LoggerFactory.getLogger(HelpController.class);

    @Autowired
    HelpDesk helpDesk;

    @GetMapping("/account")
    public ResponseEntity<Help> helpAccount() {
        logger.info("M=helpAccount");
        return helpDesk.getHelp(Conta.class);
    }

    @GetMapping("/category")
    public ResponseEntity<Help> helpCategory() {
        logger.info("M=helpCategory");
        return helpDesk.getHelp(Categoria.class);
    }

    @GetMapping("/transaction")
    public ResponseEntity<Help> helpTransaction() {
        logger.info("M=helpTransaction");
        return helpDesk.getHelp(Transaction.class);
    }

}
