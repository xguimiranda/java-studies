package inheritance2.entities;

public class Individual extends  TaxPayer{
    private Double healthcareCosts;

    public Individual() {
    }

    public Individual(String name, Double annualIncome, Double healthcareCosts) {
        super(name, annualIncome);
        this.healthcareCosts = healthcareCosts;
    }

    public Double getHealthcareCosts() {
        return healthcareCosts;
    }

    public void setHealthcareCosts(Double healthcareCosts) {
        this.healthcareCosts = healthcareCosts;
    }

    @Override
    public Double tax(){
        double tax;
        double discount;
        if (getAnnualIncome() < 20000){
            tax = 0.15;
        }else {
            tax = 0.25;
        }
        if (getHealthcareCosts() < 0){
            discount = getHealthcareCosts() * 0.50;
            return getAnnualIncome() * tax - getHealthcareCosts() * discount;
        }else {
            return getHealthcareCosts() * tax;
        }
    }
}
