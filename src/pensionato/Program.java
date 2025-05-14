package pensionato;

import pensionato.entities.Students;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Students[] vet = new Students[10];

       System.out.print("How many rooms will be rented? ");
       int n = sc.nextInt();

       for (int i =0; i < n; i++){
           System.out.println();
           System.out.println("Rent #"+ (i+1)+":");
           System.out.print("Name: ");
           String name = sc.next();
           System.out.print("Email: ");
           String email = sc.next();
           System.out.print("Room: ");
           int room = sc.nextInt();
           vet[room] = new Students(name, email);
       }

       System.out.println();
       for (int i=0; i < 10; i++){
           if(vet[i] != null){
               System.out.println(i +": " + vet[i]);
           }
       }
        sc.close();
    }
}
