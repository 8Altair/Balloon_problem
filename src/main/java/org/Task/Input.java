package org.Task;

import TryCatch.CaseCheck;
import TryCatch.LengthCheck;
import TryCatch.SelectionCheck;

import java.util.Scanner;

public class Input
{
    public static PairResult input()
    {
        // Word input
        /*System.out.println("Enter the word You are searching:");
        Scanner key = new Scanner(System.in);
        String word = key.nextLine();*/
        String word = "BALLOON";

        LengthCheck.lengthCheck(word);
        CaseCheck.caseCheck(word);

        // Selection input
        /*System.out.println("Press \"i\" for input and \"f\" for file reading of the text.");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();

        SelectionCheck.selectionCheck(answer);*/

        String Text = "BAOOLLNNOLOLGBAX";

        LengthCheck.lengthCheck(Text);
        CaseCheck.caseCheck(Text);

        return new PairResult(word, Text);

        /*if (answer.equals("i"))     // Processing selection
        {
            System.out.println("Enter the text:");
            Scanner input = new Scanner(System.in);
            String Text = input.nextLine();

            LengthCheck.lengthCheck(Text);
            CaseCheck.caseCheck(Text);

            return new PairResult(word, Text);
        }

        return new PairResult(word, answer);*/
    }
}
