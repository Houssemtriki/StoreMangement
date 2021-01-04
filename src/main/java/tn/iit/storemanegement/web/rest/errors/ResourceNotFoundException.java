package tn.iit.storemanegement.web.rest.errors;

public class ResourceNotFoundException extends RuntimeException {

    public ResourceNotFoundException(String message,Throwable cause)
    {
        super (message, cause);
    }
    public ResourceNotFoundException(String message)
    {
        super (message);
    }
    public ResourceNotFoundException(Throwable cause)
    {
        super (cause);
    }
}
