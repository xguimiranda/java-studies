package exercise2.entities;

public class Employer {
    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary(){
        return grossSalary - tax;
    }
    public void IncreaseSalary(double percentage){
        grossSalary = grossSalary + (grossSalary * percentage/100);
    }
    public String toString(){
        return name + ", $ " + String.format("%.2f", NetSalary());
    }

}
