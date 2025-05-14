package bankExercise.aplication;

import java.util.Locale;
import java.util.Scanner;
import bankExercise.entities.DateBank;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);


        System.out.print("Enter accont number: ");
        int accountNumber = sc.nextInt();
        System.out.print("Enter your accont holder: ");
        String holder = sc.next();

        char firstDeposit;
        double initialDeposit=0;
        DateBank db;

        while(true) {
            System.out.print("Is there an initial deposit (y/n): ");
            firstDeposit = sc.next().toLowerCase().charAt(0);

            if (firstDeposit == 'y') {
                System.out.print("Enter initial deposit value: ");
                initialDeposit = sc.nextDouble();
                db = new DateBank(accountNumber, holder, initialDeposit);
                break;
            } else if (firstDeposit == 'n') {
                db = new DateBank(accountNumber, holder);
                break;
            } else {
                System.out.println("Please use only (y/n).");
            }
        }

        System.out.println("Accont data: ");
        System.out.println(db);
        System.out.println();

        System.out.println();
        System.out.print("Enter your deposit value: ");
        double deposit = sc.nextDouble();
        db.depositBalance(deposit);
        System.out.println("Updated accont balance: ");
        System.out.println(db);
        System.out.println();

        System.out.print("Enter a withdraw value: ");
        double withdraw = sc.nextDouble();
        db.withdrawBalance(withdraw);
        System.out.println("Updated accont balance: ");
        System.out.println(db);

        sc.close();
    }
}
