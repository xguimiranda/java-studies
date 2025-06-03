package movieRental.model.entities;

public class Client {
    private String name;
    private String cpf;

    public Client() {
    }

    public Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString(){
        return name + " (CPF: " + cpf + ")";
    }

}
