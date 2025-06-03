package movieRental.model.entities;

public class Film {
    private String filmName;
    private Gender gender;
    private Double price;

    public Film() {
    }

    public Film(String filmName, Gender gender, Double price) {
        this.filmName = filmName;
        this.gender = gender;
        this.price = price;
    }

    public String getFilmName() {
        return filmName;
    }

    public void setFilmName(String filmName) {
        this.filmName = filmName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString(){
        return filmName + " - " + gender;
    }

}
