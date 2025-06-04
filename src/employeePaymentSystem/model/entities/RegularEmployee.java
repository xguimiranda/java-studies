package employeePaymentSystem.model.entities;

public class RegularEmployee extends Employee {
    
    public RegularEmployee(String name, Double hourlyRate, Integer hours) {
        super(name, hourlyRate, hours);
    }

    public final double payment(){
       return super.payment();
    }
}
