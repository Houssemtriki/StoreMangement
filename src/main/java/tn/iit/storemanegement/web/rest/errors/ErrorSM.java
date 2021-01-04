package tn.iit.storemanegement.web.rest.errors;

public class ErrorSM  extends Error{

    public ErrorSM(String message)
    {
        super (message);
    }


    public ErrorSM(String message, Throwable cause) {
        super (message, cause);
    }
    public ErrorSM(String message,String messageException)
    {
        super(message,new Throwable (messageException));
    }

    public ErrorSM(Throwable cause) {
        super (cause);
    }

}
