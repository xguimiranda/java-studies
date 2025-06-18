package carRental.model.services;

import carRental.model.entities.CarRental;
import carRental.model.entities.Invoice;

import java.time.Duration;

public class RentalService {

    private double pricePerHour;
    private double pricePerDay;

    private BrazilTaxService brazilTaxService;

    public RentalService(double pricePerHour, double pricePerDay, BrazilTaxService brazilTaxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.brazilTaxService = brazilTaxService;
    }

    public double getPricePerHour() {
        return pricePerHour;
    }

    public void setPricePerHour(double pricePerHour) {
        this.pricePerHour = pricePerHour;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void processInvoice(CarRental cr){
        double minutes = Duration.between(cr.getStart(), cr.getFinish()).toMinutes();
        double hours = minutes / 60.0;

        double basicPayment;
        if (hours <= 12.0){
            basicPayment = pricePerHour * Math.ceil(hours);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = brazilTaxService.tax(basicPayment);
        cr.setInvoice(new Invoice(basicPayment, tax));
    }
}
