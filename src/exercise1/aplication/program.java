package exercise1.aplication;

import exercise1.entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Rectangle rec = new Rectangle();

        System.out.println("Enter the retangle widgh and height: ");
        rec.height = sc.nextDouble();
        rec.width = sc.nextDouble();

        System.out.println("Area: "+ rec.area());
        System.out.println("Perimeter: "+ rec.perimeter());
        System.out.println("Diagonal: "+ rec.diagonal());

    sc.close();
    }
}
