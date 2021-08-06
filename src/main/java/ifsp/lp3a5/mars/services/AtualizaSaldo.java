package ifsp.lp3a5.mars.services;

import ifsp.lp3a5.mars.data.Conta;
import ifsp.lp3a5.mars.data.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class AtualizaSaldo implements Runnable {

    @Autowired
    Conta conta;

    Logger log = LoggerFactory.getLogger(AtualizaSaldo.class);

    @Override
    public void run() {
        Double novoSaldo;
        try {
            novoSaldo = conta.getTransactionHistory().getTransactions().stream()
                    .reduce(new Transaction(null, 0.0, null, null, null),
                            (acc, transaction) -> {
                                acc.setAmount(transaction.getAmount() + acc.getAmount());
                                return acc;
                            }
                    )
                    .getAmount();
        } catch (Exception e){
            log.error("M=atualizaSaldo e={}", e.getMessage());
            novoSaldo = 0.0;
        }
        log.info("M=atualizaSaldo run saldo={}", novoSaldo);
        conta.setSaldo(novoSaldo);
    }
}
