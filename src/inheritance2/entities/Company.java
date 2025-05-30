package inheritance2.entities;

public class Company extends TaxPayer{
    private int employeesNumber;

    public Company() {
    }

    public Company(String name, Double annualIncome, int employeesNumber) {
        super(name, annualIncome);
        this.employeesNumber = employeesNumber;
    }

    public int getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(int employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    @Override
    public Double tax(){
        double tax;
        if (employeesNumber < 10){
            tax = 0.16;
        }else {
            tax = 0.14;
        }
        return getAnnualIncome() * tax;
    }
}
