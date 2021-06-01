package insideofprogramming.throwingexceptions;

/**
 * Custom Exception class which basically initializes Exception class
 */
public class ServerException extends Exception {

    public ServerException(String message) {
        super(message);
    }
}
