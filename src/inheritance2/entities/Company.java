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
        if (employeesNumber > 10){
            return getAnualIncome() * 0.14;
        }else {
            return getAnualIncome() * 0.16;
        }
    }
}
