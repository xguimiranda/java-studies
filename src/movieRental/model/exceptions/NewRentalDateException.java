package movieRental.model.exceptions;

public class NewRentalDateException extends RuntimeException{

    public NewRentalDateException(String msg){
        super(msg);
    }
}
