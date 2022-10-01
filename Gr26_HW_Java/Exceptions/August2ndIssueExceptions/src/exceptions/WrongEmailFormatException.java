package exceptions;

public class WrongEmailFormatException extends MyExceptionHandler{
    public WrongEmailFormatException(String myMsg) {
        super(myMsg);
    }

}
