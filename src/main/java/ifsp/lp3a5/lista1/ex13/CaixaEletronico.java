package ifsp.lp3a5.lista1.ex13;

import static java.lang.Thread.sleep;

public class CaixaEletronico {

    private Double saldo;

    public CaixaEletronico(Double saldo) {
        this.saldo = saldo;
    }

    public synchronized void saque(Double valor) {
        System.out.println("Realizando saque de " + valor);

        if (valor > this.saldo)
            throw new IllegalArgumentException("Valores insuficientes para saque de " + valor);

        System.out.println("Sacando "+ valor);
        this.saldo = this.saldo - valor;

        try {
            sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(valor + " sacados");
    }

    public synchronized void transferir(double valor) {
        System.out.println("Transferindo ");

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Transferência concluída");

    }
}
