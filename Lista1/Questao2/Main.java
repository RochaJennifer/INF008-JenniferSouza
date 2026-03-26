package Lista1.Questao2;

public class Main {
    public static void main(String[] args) {

        CashRegister caixa = new CashRegister("CX-01", 100.0);

        caixa.processPayment(50.0);
        caixa.processPayment(20);
        caixa.processPayment(30.5, "Venda de produto");

        caixa.processRefund(10.0);

        System.out.println(caixa.getDailyReport());
    }
}
