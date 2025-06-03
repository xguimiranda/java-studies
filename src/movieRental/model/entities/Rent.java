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
}
