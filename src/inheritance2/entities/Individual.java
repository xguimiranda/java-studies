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
        if (getAnualIncome() < 20000){
            return getAnualIncome() * 0.15 - healthcareCosts * 0.5;
        }else {
            return getAnualIncome() * 0.25 - healthcareCosts * 0.5;
        }
    }
}
