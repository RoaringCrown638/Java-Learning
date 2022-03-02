package Excercise_2;

public class BankAccount {
    private String holderName;
    private float balance;
    private int number;

    public BankAccount(String name, int number) {
        this.holderName = name;
        this.number = number;
        this.balance = 0;
    }

    public BankAccount(String name, int number, float amount) {
        this.holderName = name;
        this.number = number;
        this.balance = amount;
    }

    public void setName(String name) {
        this.holderName = name;
    }

    public String getName() {
        return this.holderName;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNumber() {
        return Integer.toString(this.number);
    }

    public String getBalance() {
        return Float.toString(this.balance);
    }

    public void deposit(int amount) {
        this.balance += amount;
    }

    public void withdraw(int amount) {
        this.balance -= amount;
    }
}