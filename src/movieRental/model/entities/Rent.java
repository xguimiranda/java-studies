package movieRental.model.entities;

public class Rent {
    private String filmName;
    private LocalDate rentDate;
    private LocalDate instanteDate;

    public Rent(String filmName, LocalDate rentDate, LocalDate instanteDate) {
        this.filmName = filmName;
        this.rentDate = rentDate;
        this.instanteDate = instanteDate;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
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
