package movieRental.model.entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rent {
    private Film film;
    private LocalDate rentDate;
    private final LocalDate instanteDate;
    private Client client;


    public Rent(Client client, Film film, LocalDate instanteDate, LocalDate rentDate) {
        this.client = client;
        this.instanteDate = instanteDate;
        this.rentDate = rentDate;
    }


    public LocalDate getRentDate() {
        return rentDate;
    }

    public LocalDate getInstanteDate() {
        return instanteDate;
    }

    public long duration(){
        return ChronoUnit.DAYS.between(instanteDate, rentDate);
    }

    public double totalPrice(){
        return duration() * film.getPrice();
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Client: "+ client.toString() + "\n");
        sb.append("Movie: "+ film.toString()+ "\n");
        sb.append("Rental days: "+ duration()+"\n");
        sb.append("Total: $" + String.format("%.2f", totalPrice()));

        return sb.toString();
    }
}
