public class BankAccount {
    String accountHolderName;
    double balance;

    public BankAccount(String accountHolderName, double balance) { // Costruttore per inizializzare il nome del titolare e il saldo
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) { // Metodo per depositare denaro, verifica che l'importo sia positivo
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) { // Metodo per prelevare denaro, verifica che l'importo sia positivo e che ci siano fondi sufficienti
        if (amount > 0 ) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient funds.");
        }
    }

    public void displayBalance() { // Metodo per visualizzare il saldo attuale
        System.out.println("Current Balance: " + balance);
    }
}
