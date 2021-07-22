package ifsp.lp3a5.lista1.ex13;

public class Main {
    public static void main(String[] args) {
            OperacaoEmAgencia saque1 = new OperacaoEmAgencia("saque", 300.00);
            OperacaoEmAgencia saque2 = new OperacaoEmAgencia("saque", 100.00);

            OperacaoEmAgencia transferencia1 = new OperacaoEmAgencia("transferencia");
            OperacaoEmAgencia transferencia2 = new OperacaoEmAgencia("transferencia");

            OperacaoEmAgencia saque3 = new OperacaoEmAgencia("saque", 1000.00);
            OperacaoEmAgencia transferencia3 = new OperacaoEmAgencia("transferencia");

            OperacaoEmAgencia saque4 = new OperacaoEmAgencia("saque", 800.00);
    }
}
