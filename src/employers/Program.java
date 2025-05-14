package employers;

import employers.entities.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("How many rooms will be rented? ");
        int n = sc.nextInt();

        List<Employee> list = new ArrayList<>();


        for (int i =0; i < n; i++){
            System.out.println();
            System.out.println("Employer #"+ (i+1)+":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Salary: ");
            Double salary = sc.nextDouble();

            Employee emp = new Employee(id, name, salary);
            list.add(emp);
        }

        System.out.print("Enter the employee id tha  will have the salary increase: ");
        int idTest = sc.nextInt();
        Integer pos = position(list, idTest);
        if (pos == null){
            System.out.println("This id does not exist! ");
        }else{
            System.out.print("Enter the percentage: ");
            double percent = sc.nextDouble();
            list.get(pos).increaseSalary(percent);
        }
        System.out.println("List of employers: ");
        for (Employee emp : list){
            System.out.println(emp);
        }

        sc.close();
    }

    public static Integer position(List<Employee> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getID() == id) {
                return i;
            }
        }
        return null;
    }
}
