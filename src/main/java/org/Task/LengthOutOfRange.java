package org.Task;

public class LengthOutOfRange extends RuntimeException
{
    public LengthOutOfRange(String errorMessage, Throwable error)
    {
        super(errorMessage, error);
    }
}