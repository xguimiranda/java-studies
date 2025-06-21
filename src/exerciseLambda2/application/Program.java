package exerciseLambda2.application;

import exerciseLambda2.entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter full file path: ");
        String path = sc.next();

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> list = new ArrayList<>();

            String line = br.readLine();
            while (line != null) {

                String[] filds = line.split(",");
                list.add(new Product(filds[0], Double.parseDouble(filds[1])));
                line = br.readLine();
            }

            double avg = list.stream().map(p -> p.getPrice())
                    .reduce(0.0, (x,y) -> x + y) / list.size();

            System.out.println("Average price: "+ String.format("%.2f", avg));

            List<String> names = list.stream().filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted((s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase()))
                    .collect(Collectors.toList()).reversed();

            names.forEach(System.out::println);
        }
        catch (IOException e) {
            System.out.print("Error: "+ e.getMessage());
        }
//        Input File:
//        Tv,900.00
//        Mouse,50.00
//        Tablet,350.50
//        HD Case,80.90
//        Computer,850.00
//        Monitor,290.00
        sc.close();
    }
}
