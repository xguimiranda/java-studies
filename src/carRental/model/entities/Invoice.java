package carRental.model.entities;

public class Invoice {

    private double basicPayment;
    private double tax;


    public double totalPayment(){
       return basicPayment + tax;
    }
}
