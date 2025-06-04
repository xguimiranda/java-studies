package employeePaymentSystem.application;

import employeePaymentSystem.model.entities.Employee;
import employeePaymentSystem.model.entities.OutsourcedEmployee;
import employeePaymentSystem.model.entities.RegularEmployee;

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
        for (int i = 1; i <= n; i++){
            System.out.println();
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced (y/n)? ");
            char question = sc.next().toLowerCase().charAt(0);
            while (question != 'y' && question != 'n'){
                System.out.print("Outsourced, only use yes our no(y/n)? ");
                question = sc.next().toLowerCase().charAt(0);
            }
            System.out.print("name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            sc.nextLine();
            int hours = sc.nextInt();
            System.out.print("Hourly Rate: ");
            double hourlyRate = sc.nextDouble();
            if (question == 'y'){
                System.out.println("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutsourcedEmployee(name, hourlyRate, hours, additionalCharge));
            }else{
                list.add(new RegularEmployee(name, hourlyRate, hours));
            }
        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee employee : list){
            System.out.println(employee);
        }


        sc.close();
    }
}
