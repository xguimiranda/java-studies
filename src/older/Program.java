package older;

import older.entities.People;

import java.util.Locale;
import java.util.Scanner;

public class Program{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("How many people will you type? ");
        int n = sc.nextInt();

        People[] vet = new People[n];

        for (int i =0; i< vet.length; i++){
            System.out.println((i+1)+"st people data: ");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Age: ");
            int age = sc.nextInt();
            vet[i] = new People(name, age);
        }

        int older = vet[0].getAge();
        String nameOlder = vet[0].getName();

        for (int i = 1; i < vet.length; i++) {
            if (vet[i].getAge() > older) {
                older = vet[i].getAge();
                nameOlder = vet[i].getName();
            }
        }

        System.out.println("Older person: " + nameOlder + " " + older);
    }
}