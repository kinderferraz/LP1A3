package ifsp.lp3a5.lista1.ex14;

import static java.lang.Thread.sleep;

public class CaixaEletronico {

    private Double saldo;
    public static boolean emEspera = false;

    public CaixaEletronico(Double saldo) {
        this.saldo = saldo;
    }

    public synchronized void saque(Double valor) {
        try {
            while(emEspera)
                wait();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Realizando saque de " + valor);

        if (valor > this.saldo) {
            System.out.println("Valores insuficientes para saque de " + valor);
            alimentarCaixa(500);
        }

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
        try {
            while(emEspera)
                wait();
        } catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Transferindo ");

        try {
            sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Transferência concluída");

    }

    public synchronized void alimentarCaixa(double valor){
        emEspera = true;
        System.out.println("Recolocando dinheiro, caixa em espera por 10s");
        this.saldo += valor;

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        emEspera = false;
        notify();
    }

}
