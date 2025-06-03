package movieRental.model.entities;

import movieRental.model.exceptions.NewRentalDateException;
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

    public void updateRentalDate(LocalDate date) throws NewRentalDateException {
        if (ChronoUnit.DAYS.between(instanteDate, date) > 30){
            throw new NewRentalDateException("Rental duration cannot exceed 30 days.");
        }
        this.rentDate = date;
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
