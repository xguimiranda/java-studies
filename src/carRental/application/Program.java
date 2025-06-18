package carRental.application;

import carRental.model.entities.CarRental;
import carRental.model.entities.Vehicle;
import carRental.model.services.BrazilTaxService;
import carRental.model.services.RentalService;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com os dados do aluguel");
        System.out.print("Modelo do carro: ");
        String modelo = sc.nextLine();
        System.out.print("Retirada (dd/MM/yyyy hh:mm): ");
        LocalDate start = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.print("Retorno (dd/MM/yyyy hh:mm): ");
        LocalDate finish = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        CarRental cr = new CarRental(start, finish, new Vehicle(modelo));

        System.out.print("Entre com o preço por hora: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Entre com o preço por dia: ");
        double pricePerDay = sc.nextDouble();
        RentalService rt = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());

        System.out.println("FATURA:");
        System.out.println("Pagamento basico: "+ cr.getInvoice().getBasicPayment());
        System.out.println("Imposto: "+ cr.getInvoice().getTax());
        System.out.println("Pagamento total: "+ cr.getInvoice().totalPayment());

        sc.close();
    }
}
