package employers.entities;

public class Employee {
    private final Integer ID;
    private final String name;
    private Double salary;


    public Employee(int id, String name, double salary) {
        this.ID = id;
        this.name = name;
        this.salary = salary;
    }

    public Integer getID() {
        return ID;
    }

    public void increaseSalary(double porcentagem){
        salary += salary * porcentagem / 100.0;
    }

    public String toString (){
        return ID + ", " + name + ", " + String.format("%.2f", salary);
    }
}
