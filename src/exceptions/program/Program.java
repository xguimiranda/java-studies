package exceptions.program;

import exceptions.model.entities.Account;
import exceptions.model.exceptions.balanceLimitException;
import exceptions.model.exceptions.withDrawLimitException;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your account data: ");
        System.out.print("Number: ");
        int number = sc.nextInt();
        System.out.print("Holder: ");
        String holder = sc.next();
        System.out.print("Initial balance: ");
        sc.nextLine();
        double balance = sc.nextDouble();
        System.out.print("WithDraw limit: ");
        double withDrawLimit = sc.nextDouble();
        Account acc = new Account(number, holder, balance, withDrawLimit);

        System.out.println();
        System.out.print("Enter amount for withdraw: ");
        double amount = sc.nextDouble();

        
        try {
            acc.withDraw(amount);
            System.out.println(String.format("New balance: %.2f"+ acc.getBalance()));
        }
        catch (withDrawLimitException | balanceLimitException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }
        catch (RuntimeException e){
            System.out.println("Unexpected error");
        }

        sc.close();
    }
}
