package TryCatch;

import Exceptions.LengthOutOfRange;

public class LengthCheck
{
    public static void lengthCheck(String S)
    {
        try
        {
            if(S.length() == 0 || S.length() > 200000)
            {
                throw new RuntimeException("Wrong input.");
            }
        }
        catch(RuntimeException error)
        {
            throw new LengthOutOfRange("Length of the string is out of range.", error);
        }
    }
}
