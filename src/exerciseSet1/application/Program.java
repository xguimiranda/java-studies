package exerciseSet1.application;

import exerciseSet1.model.entities.StudentAccountant;

import java.util.HashSet;
import java.util.Locale;
import java.util.Scanner;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Set<StudentAccountant> set = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            set.add(new StudentAccountant(sc.nextInt()));
        }
        System.out.print("How many students for course B? ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            set.add(new StudentAccountant(sc.nextInt()));
        }
        System.out.print("How many students for course C? ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++){
            set.add(new StudentAccountant(sc.nextInt()));
        }

        System.out.println("Total students: "+ set.size());

        sc.close();
    }
}
