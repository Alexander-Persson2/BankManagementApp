package se.lexicon;

public class BankAccount {
    // Fields

    private static int accountCounter = 0;
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    // Constructor

    public BankAccount(String customerName, String email, String phoneNumber, double balance) {
        this.accountNumber = ++accountCounter;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.balance = balance;
    }

    // Getters & Setters

    public int getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Methods

    public void deposit(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " made. New balance: " + this.balance);
        } else if (amount > 0) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Cannot withdraw negative amount.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawal of " + amount + " made. New balance: " + this.balance);
        } else if (amount > 0) {
            System.out.println("Insufficient funds for withdrawal.");
        } else {
            System.out.println("Cannot withdraw negative amount");
        }
    }
}
