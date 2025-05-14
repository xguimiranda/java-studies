package exercise2.aplication;

import java.util.Locale;
import java.util.Scanner;
import exercise2.entities.Employer;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Employer em = new Employer();

        System.out.print("Name: ");
        em.name = sc.nextLine();

        System.out.print("Gross Salary: ");
        em.grossSalary = sc.nextDouble();

        System.out.print("Tax: ");
        em.tax = sc.nextDouble();
        System.out.println();

        System.out.println("Employer: " + em);
        System.out.println();

        System.out.print("Which percentage to increase salary?: ");
        double percentage = sc.nextDouble();
        em.IncreaseSalary(percentage);
        System.out.println();

        System.out.printf("Update data: "+ em);

        sc.close();
    }
}
