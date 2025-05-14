package exercise4.aplication;

import exercise4.aplication.util.CurrentyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("What is your dollar price? ");
        CurrentyConverter.dollar = sc.nextDouble();
        System.out.print("How many dollar will be bought? ");
        CurrentyConverter.dollarQuant = sc.nextDouble();
        System.out.println("Amont to be pay in reais: " + String.format(Locale.US, "%.2f", CurrentyConverter.converter()));

        sc.close();
    }
}
