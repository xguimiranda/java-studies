package db_deletarDados;

public class DBIntegrityException extends RuntimeException {

    public DBIntegrityException(String message) {
        super(message);
    }
}
