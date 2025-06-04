package employeePaymentSystem.model.entities;

public abstract class Employee {
    private String name;
    private Double hourlyRate;
    private Integer hours;

    public Employee(String name, Double hourlyRate, Integer hours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(Double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public double payment(){
        return hourlyRate * hours;
    }

    public String toString(){
        return name + " - $" + String.format("%.2f", payment());
    }
}
