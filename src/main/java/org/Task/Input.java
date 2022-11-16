package org.Task;

import java.util.Scanner;

public class Input
{
    public static PairResult input()
    {
        // Word input
        System.out.println("Enter the word You are searching:");
        Scanner key = new Scanner(System.in);
        String word = key.nextLine();

        try
        {
            if(word.length() == 0 || word.length() > 200000)
            {
                throw new RuntimeException("Wrong input.");
            }
        }
        catch(RuntimeException error)
        {
            throw new LengthOutOfRange("Length of the string is out of range.", error);
        }

        try
        {
            if(word.toLowerCase().equals(word))
            {
                throw new RuntimeException("Wrong input.");
            }
        }
        catch(RuntimeException error)
        {
            throw new CaseError("String must be uppercase only.", error);
        }

        // Selection input
        System.out.println("Press \"i\" for input and \"f\" for file reading of the text.");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();

        try
        {
            if(!answer.equals("i") && !answer.equals("f"))
            {
                throw new RuntimeException("Wrong input.");
            }
        }
        catch (RuntimeException error)
        {
            throw new InvalidInput("Value not valid.", error);
        }

        if (answer.equals("i"))
        {
            System.out.println("Enter the text:");
            Scanner input = new Scanner(System.in);
            String Text = input.nextLine();

            try
            {
                if(Text.length() == 0 || Text.length() > 200000)
                {
                    throw new RuntimeException("Wrong input.");
                }
            }
            catch (RuntimeException error)
            {
                throw new LengthOutOfRange("Length of the string is out of range.", error);
            }

            try
            {
                if(Text.toLowerCase().equals(Text))
                {
                    throw new RuntimeException("Wrong input.");
                }
            }
            catch(RuntimeException error)
            {
                throw new CaseError("String must be uppercase only.", error);
            }

            return new PairResult(word, Text);
        }

        return new PairResult(word, answer);
    }
}
