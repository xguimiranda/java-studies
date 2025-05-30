package polimorfismoEmployee.program;

import polimorfismoEmployee.entities.Employee;
import polimorfismoEmployee.entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<>();

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char question = sc.next().toLowerCase().charAt(0);
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("hours: ");
            int hours = sc.nextInt();
            System.out.print("value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (question == 'y') {
                System.out.print("additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee : list) {
            System.out.println(employee.getName() + " - $ " + String.format("%.2f", employee.payment()));
        }


        sc.close();
    }
}
