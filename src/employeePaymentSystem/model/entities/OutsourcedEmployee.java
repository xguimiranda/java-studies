package employeePaymentSystem.model.entities;

public class OutsourcedEmployee extends Employee{

    private Double additionalCharge;

    public OutsourcedEmployee(String name, Double hourlyRate, Integer hours, Double additionalCharge) {
        super(name, hourlyRate, hours);
        this.additionalCharge = additionalCharge;
    }

    public Double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(Double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public final double payment(){
        return super.payment() + (additionalCharge * 1.1);
    }
}
