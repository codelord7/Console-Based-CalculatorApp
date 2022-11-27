import java.util.InputMismatchException;

public class CustomInputExceptionHandler extends Exception{

    public CustomInputExceptionHandler(String s,Throwable e){

        super("integer needed",e);
    }

}
