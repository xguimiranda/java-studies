package exercise3.aplication;

import exercise3.entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Aplication {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    sc.useLocale(Locale.US);
    Students st = new Students();

    System.out.print("Name of the student: ");
    st.name = sc.nextLine();
    System.out.println("What were your School grades? ");
    st.grade1 = sc.nextDouble();
    st.grade2 = sc.nextDouble();
    st.grade3 = sc.nextDouble();
    System.out.println();
    System.out.printf(Locale.US, "FINAL GRADE: %.2f%n", st.finalGrade());
    System.out.println(st.pass());

    sc.close();
    }
}
