package movieRental.program;


import movieRental.model.entities.Client;
import movieRental.model.entities.Film;
import movieRental.model.entities.Gender;
import movieRental.model.entities.Rent;
import movieRental.model.exceptions.NewRentalDateException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter client data: ");
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("CPF: ");
            sc.nextLine();
            String cpf = sc.next();
            sc.nextLine();
            Client client = new Client(name, cpf);

            System.out.println("Enter movie data:");
            System.out.print("Title: ");
            String title = sc.next();
            System.out.print("Genre (ACTION/DRAMA/COMEDY/DOCUMENTARY): ");
            sc.nextLine();
            String genreInput = sc.next().toUpperCase();
            Gender gender = Gender.valueOf(genreInput);
            System.out.print("Price per day: ");
            double price = sc.nextDouble();
            LocalDate intantDate = LocalDate.now();
            System.out.println();

            System.out.println("Enter rental data:");
            System.out.print("Days of rental: ");
            LocalDate rentDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            Rent rent = new Rent(client, new Film(title, gender, price), intantDate, rentDate);
            System.out.println();
            System.out.println("RENTAL SUMMARY:");
            System.out.println(rent);
            System.out.println();
            System.out.print("Do you want to update rental duration? (y/n): ");
            char question = sc.next().toLowerCase().charAt(0);

        if (question == 'y'){
            System.out.print("New rental duration (max 30 days): ");
            LocalDate newRentalDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            rent.updateRentalDate(newRentalDate);
            System.out.println("UPDATED RENTAL: ");
            System.out.println(rent);
        }
        }
        catch (NewRentalDateException e){
            System.out.println("ERROR: "+ e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("ERROR: imput error!");
        }
        catch (DateTimeParseException e){
            System.out.println("Error: Invalid Date!");
        }
        catch (RuntimeException e){
            System.out.println("Unexpect ERROR!");
        }
        sc.close();
    }
}
