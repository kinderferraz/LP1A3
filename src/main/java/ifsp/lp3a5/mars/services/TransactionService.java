package ifsp.lp3a5.mars.services;

import ifsp.lp3a5.mars.data.Transaction;
import ifsp.lp3a5.mars.data.TransactionRepo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class TransactionService {

    Logger log = LoggerFactory.getLogger(TransactionService.class);

    final TransactionRepo transactionRepo;

    public TransactionService(TransactionRepo transactionRepo) {
        this.transactionRepo = transactionRepo;
    }

    public ResponseEntity<List<Transaction>> getAll() {
        log.info("M= getAll");
        return ResponseEntity.ok(transactionRepo.getTransactions());
    }

    public ResponseEntity<Transaction> getTransactionById(Integer id) {
        log.info("M= getTransactionById, id = {}", id);
        return ResponseEntity.ok(transactionRepo.getTransactionById(id));
    }

    public ResponseEntity<List<Transaction>> getLastTransactions(Integer amount) {
        log.info("M=getLastTransactions, amount = {}", amount);
        return ResponseEntity.ok(transactionRepo.peekLast(amount));
    }

    public ResponseEntity<Integer> postTransaction(Transaction transaction) {
        log.info("M=postTransaction, transaction = {}", transaction);
        return ResponseEntity.ok(transactionRepo.saveTransaction(transaction));
    }

    public ResponseEntity<Void> patchTransaction(Transaction newTransaction) {
        log.info("M=putTransaction, newTransaction = {}", newTransaction);
        Optional<Transaction> maybeTransaction = Optional.ofNullable(transactionRepo.getTransactionById(newTransaction.getId()));
        maybeTransaction.ifPresent(oldTransaction -> {
            oldTransaction.setId(newTransaction.getId());
            oldTransaction.setAmount(newTransaction.getAmount());
            oldTransaction.setDescription(newTransaction.getDescription());
            oldTransaction.setCategoria(newTransaction.getCategoria());
        });
        return ResponseEntity.ok().build();
    }
}
