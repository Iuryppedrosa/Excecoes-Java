import model.entities.Account;
import model.entities.exceptions.DomainException;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Number: ");
        int number = input.nextInt();

        input.nextLine();

        System.out.print("Holder: ");
        String holder = input.nextLine();

        System.out.print("Initial Balance: ");
        double initialBalance = input.nextDouble();


        System.out.print("Limit withdraw: ");
        double limitWithdraw = input.nextDouble();

        Account c = new Account(number, holder, initialBalance, limitWithdraw);

        System.out.println("Enter the amount for withdraw: ");
        double withdraw = input.nextDouble();

        try{
            c.withdraw(withdraw);
            System.out.print("New balance: " + c.getBalance());
        } catch (DomainException e) {
            System.out.println(e.getMessage());
        }
    }
}