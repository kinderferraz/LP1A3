package ifsp.lp3a5.lista1.ex10;

public class Calculo implements Runnable{
    private double num1, num2;
    private String op;

    public Calculo(double num1, double num2, String op){
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;

        new Thread(this).start();
    }


    @Override
    public void run() {

        System.out.println("O resultado de " + num1 + " "
                + op + " " + num2+"="+calculo());

    }

    private Double calculo(){
        switch (this.op){
            case "+":{
                return this.num1 + this.num2;
            }
            case "-":{
                return this.num1 - this.num2;
            }
            case "*":{
                return this.num1 * this.num2;
            }
            case "/":{
                return this.num1 / this.num2;
            }
            default:{
                throw new IllegalArgumentException("O operador é inválido");
            }
        }
    }
}
