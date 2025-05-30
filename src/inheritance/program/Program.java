package inheritance.program;

import inheritance.entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List <Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++){
            System.out.println("Shape #"+ i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char question = sc.next().toLowerCase().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            while (!color.equals("BLACK") && !color.equals("BLUE") && !color.equals("RED")){
                System.out.print("Only type: (BLACK/BLUE/RED): ");
                color = sc.next();
            }
            if (question == 'r'){
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                list.add(new Circle(color, radius));
            }
        }


        
        sc.close();
    }
}
