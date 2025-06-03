package movieRental.model.entities;

import movieRental.model.exceptions.NewRentalDateException;
import movieRental.model.exceptions.WrongDataException;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Rent {
    private Film film;
    private LocalDate rentDate;
    private final LocalDate instanteDate;
    private Client client;


    public Rent(Client client, Film film, LocalDate instanteDate, LocalDate rentDate) {
        this.client = client;
        this.film = film;
        this.instanteDate = instanteDate;
        this.rentDate = rentDate;
    }


    public LocalDate getRentDate() {
        return rentDate;
    }

    public LocalDate getInstanteDate() {
        return instanteDate;
    }

    public long duration() throws WrongDataException{
        if (ChronoUnit.DAYS.between(instanteDate, rentDate) <= 0) {
            throw new WrongDataException("New rental date must be after today.");
        }
        return ChronoUnit.DAYS.between(instanteDate, rentDate);
    }

    public double totalPrice() {
        return duration() * film.getPrice();
    }

    public void updateRentalDate(LocalDate date) throws NewRentalDateException, WrongDataException {
        if (ChronoUnit.DAYS.between(instanteDate, date) > 30){
            throw new NewRentalDateException("Rental duration cannot exceed 30 days.");
        }
        if (ChronoUnit.DAYS.between(instanteDate, date) <= 0) {
            throw new WrongDataException("New rental date must be after today.");
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
