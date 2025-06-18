package carRental.model.entities;

public class Invoice {

    private double basicPayment;
    private double tax;

    public Invoice(double basicPayment, double tax) {
        this.basicPayment = basicPayment;
        this.tax = tax;
    }

    public double totalPayment(){
       return basicPayment + tax;
    }
}
