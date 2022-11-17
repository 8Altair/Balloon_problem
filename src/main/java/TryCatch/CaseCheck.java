package TryCatch;

import Exceptions.CaseError;

public class CaseCheck
{
    public static void caseCheck(String S)
    {
        try
        {
            if(S.toLowerCase().equals(S))
            {
                throw new RuntimeException("Wrong input.");
            }
        }
        catch(RuntimeException error)
        {
            throw new CaseError("String must be uppercase only.", error);
        }
    }
}
