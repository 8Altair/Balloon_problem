package Exceptions;

public class CaseError extends RuntimeException
{
    public CaseError(String errorMessage, Throwable error)
    {
        super(errorMessage, error);
    }
}