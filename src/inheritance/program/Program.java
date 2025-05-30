package inheritance.program;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++){
            System.out.println("Shape #"+ i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char question = sc.next().toLowerCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();
            while (!color.equals("BLACK") && !color.equals("BLUE") && !color.equals("RED")){
                System.out.print("Only type: (BLACK/BLUE/RED): ");
                color = sc.next();
            }
        }


        
        sc.close();
    }
}
