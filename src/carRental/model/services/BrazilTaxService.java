package carRental.model.services;

public class BrazilTaxService implements TaxService{

    public double tax (double amount){
    if (amount <= 100.00){
        return 0.20;
    }
    else {
        return 0.10;
    }
    }

}
