package Exceptions;

public class InvalidInput extends RuntimeException
{
    public InvalidInput(String errorMessage, Throwable error)
    {
        super(errorMessage, error);
    }
}
