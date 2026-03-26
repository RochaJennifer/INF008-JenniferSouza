package Lista1.Questao2;

public class CashRegister {
    private double currentBalance;
    private int transactionCount;
    private String registerId;

    public CashRegister(){
        this.currentBalance = 0.0;
        this.transactionCount = 0;
        this.registerId = "DEFAULT";
    }

    public CashRegister(String registerId){
        this.currentBalance = 0.0;
        this.transactionCount = 0;
        this.registerId = registerId;
    }

    public CashRegister(String registerId, double initialBalance){
        this.currentBalance = initialBalance;
        this.transactionCount = 0;
        this.registerId = registerId;
    }

    public void processPayment(double amount){
        if(amount <= 0){
            System.out.println("Valor invalido para pagamento");
            return;
        }

        currentBalance += amount;
        transactionCount++;

        System.out.println("Pagamento de R$" + amount + " processado.");
    }

    public void processPayment(int amount) {
        processPayment((double) amount);
    }

    public void processPayment(double amount, String description) {
        processPayment(amount);
        System.out.println("Descrição: " + description);
    }

    public void processRefund(double amount) {
        if (amount > currentBalance) {
            System.out.println("Saldo insuficiente!");
            return;
    }

    currentBalance -= amount;
    transactionCount++;
}

    public String getDailyReport() {
        return "Caixa: " + registerId +
            "\nSaldo: " + currentBalance +
            "\nTransações: " + transactionCount;
    }
 }
