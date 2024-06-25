package se.lexicon;

public class App {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount("Kent Persson", "kent.persson@example.com", "0808-0000011", 10000.0);
        account1.deposit(500.0);
        account1.withdraw(200.0);
        account1.withdraw(15000.0);
        System.out.println(account1.displayAccountInfo());
    }
}