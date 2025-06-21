package exerciseLambda3.application;


import exerciseLambda3.entities.Employee;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter full file path: ");
        String path = sc.next();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))){
            List<Employee> list = new ArrayList<>();
            String file = bf.readLine();

            while(file != null){
                String[] filds = file.split(",");
                list.add(new Employee(filds[0], filds[1], Double.parseDouble(filds[2])));
                file = bf.readLine();
            }


        
        }
        catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }


        sc.close();
    }

}
