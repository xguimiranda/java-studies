package movieRental.model.exceptions;

public class WrongDataException extends RuntimeException{

    public WrongDataException(String msg){
        super(msg);
    }
}
