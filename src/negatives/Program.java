package negatives;

import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("How many numbers are you going to type? ");
        int n = sc.nextInt();
        int[] vect = new int[n];

        for (int i = 0; i< vect.length; i++){
            System.out.print("Enter a number: ");
            vect[i] = sc.nextInt();
        }
        System.out.println("negative numbers: ");
        for (int j : vect) {
            if (j < 0) {
                System.out.println(j);
            }
        }

    }
}
