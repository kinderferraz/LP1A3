package ifsp.lp3a5.lista1.ex14;

public class OperacaoEmAgencia implements Runnable {

    private static final CaixaEletronico caixa = new CaixaEletronico(2000.00);
    private static boolean executando = false;
    private String operacao;
    private double valor;

    public OperacaoEmAgencia(String operacao) {
        this.operacao = operacao;
        new Thread(this).start();
    }

    public OperacaoEmAgencia(String operacao, double valor) {
        this.operacao = operacao;
        this.valor = valor;
        new Thread(this).start();
    }

    @Override
    public void run() {
        if (operacao.equalsIgnoreCase("saque"))
            caixa.saque(valor);
        else
            caixa.transferir(valor);
    }
}
