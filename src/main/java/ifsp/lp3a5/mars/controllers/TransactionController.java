package ifsp.lp3a5.mars.controllers;

import ifsp.lp3a5.mars.data.Transaction;
import ifsp.lp3a5.mars.services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@Controller
@RequestMapping(path = "/transaction")
public class TransactionController {

    @Autowired
    TransactionService transactionService;

    @GetMapping()
    public ResponseEntity<List<Transaction>> getTransactions() {
        return transactionService.getAll();
    }

    @GetMapping(params = {"id"})
    public ResponseEntity<Transaction> getTransactionById(@RequestParam Integer id) {
        try {
            return transactionService.getTransactionById(id);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @GetMapping(params = {"last"})
    public ResponseEntity<List<Transaction>> getLastTransactions(@RequestParam Integer last) {
        try {
            return transactionService.getLastTransactions(last);
        } catch (Exception e) {
            return ResponseEntity.badRequest().build();
        }
    }

    @PostMapping()
    public ResponseEntity<Integer> postTransaction(@RequestBody Transaction transaction) {
        return transactionService.postTransaction(transaction);
    }

    @PutMapping()
    public ResponseEntity<Void> putTransaction(@RequestBody Transaction transaction) {
        return transactionService.patchTransaction(transaction);
    }
}
