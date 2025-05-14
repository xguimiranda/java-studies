package heights;

import heights.entities.PeopleData;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("How many people will be typed: ");
        int n = sc.nextInt();
        PeopleData[] vect = new PeopleData[n];

        for (int i =0; i< vect.length; i++){
            System.out.println((i+1)+"st person's details: ");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            vect[i] = new PeopleData(name, age, height);
        }

        double totalHeight = 0.0;
        for (PeopleData person : vect) {
            totalHeight += person.getHeight();
        }
        double average = totalHeight / vect.length;
        System.out.printf("Average height: %.2f\n", average);

        int countUnder16 = 0;
        for (PeopleData person : vect) {
            if (person.getAge() < 16) {
                countUnder16++;
            }
        }
        double percentageUnder16 = ((double) countUnder16 / vect.length) * 100.0;
        System.out.printf("People with less than 16 years: %.1f%%\n", percentageUnder16);

        for (PeopleData person : vect) {
            if (person.getAge() < 16) {
                System.out.println(person.getName());
            }
        }
    }
}