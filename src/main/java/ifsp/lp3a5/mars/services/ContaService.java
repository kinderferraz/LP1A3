package ifsp.lp3a5.mars.services;

import ifsp.lp3a5.mars.data.Conta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

@Component
public class ContaService {

    @Autowired
    Conta conta;

    @Autowired
    AtualizaSaldo saldo;

    private final Logger logger = LoggerFactory.getLogger(ContaService.class);

    public ResponseEntity<Conta> getConta() throws RuntimeException {
        logger.info("M=getConta, conta={}", conta);

        if (conta.getSaldo() == null)
            throw new RuntimeException("{\"error\": \"Atualize o valor do saldo antes de consultá-lo.\"}");

        if (conta.getTransactionHistory().getTransactions().isEmpty())
            throw new RuntimeException("{\"error\": \"Não existem transações em histórico.\"}");

        return ResponseEntity.ok(conta);
    }

    public void updateConta() {
          saldo.run();
    }
}
