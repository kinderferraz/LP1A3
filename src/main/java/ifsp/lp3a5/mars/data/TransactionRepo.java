package ifsp.lp3a5.mars.data;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("singleton")
public class TransactionRepo {

    private final List<Transaction> transactions;

    public TransactionRepo() {
        transactions = new ArrayList<>();
    }

    public Integer saveTransaction(Transaction transaction) {
        int id = 0;

        if (! transactions.isEmpty())
            id = transactions.size();

        transaction.setId(id);
        transactions.add(transaction);
        return id;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public Transaction getTransactionById(Integer id) throws NullPointerException {
        return transactions.stream()
                .filter(transaction -> transaction.getId() != null && transaction.getId().equals(id))
                .findFirst()
                .orElseThrow(NullPointerException::new);
    }

    public List<Transaction> peekLast(Integer amount) {
        return transactions.subList(transactions.size() - amount, transactions.size());
    }

}
