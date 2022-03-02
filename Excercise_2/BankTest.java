package Excercise_2;

public class BankTest {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount(args[0], Integer.parseInt(args[1]), Float.valueOf(args[2]));
        System.out.println(bank.getName());
        bank.setName("Abhinav Sharma");
        System.out.println(bank.getName());

        System.out.println(bank.getBalance());

        System.out.println(bank.getNumber());
        bank.setNumber(123456);
        System.out.println(bank.getNumber());

        
    }
}
