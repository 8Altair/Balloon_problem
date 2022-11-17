package org.Task;

import TryCatch.CaseCheck;
import TryCatch.LengthCheck;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class MainCode
{
    public static void mainCode(PairResult data)
    {
        String word = "BALLOON";

        LengthCheck.lengthCheck(word);
        CaseCheck.caseCheck(word);

        try
        {
            // FIle reading
            Scanner scanner = new Scanner(new File("src/main/java/org/Task/Text"));
            while (scanner.hasNextLine())   // Checking the file line by line
            {
                String text = scanner.nextLine();
                int numberOfAppearances = Solution.solution(data.first(), text);    // Njumber of possible words
                System.out.println("The letters from the word " + data.first()
                        + " appear " + numberOfAppearances + " times in the given text.");

                try
                {
                    FileWriter writer = new FileWriter("Results.txt", true);    // File writing
                    writer.write("The letters from the word " + data.first()
                            + " appear " + numberOfAppearances + " times in the given text.\n");
                    writer.write("\n");
                    writer.close();
                }
                catch (IOException e)
                {
                    System.out.println("An error occurred.");
                    e.printStackTrace();
                }
            }

            try
            {
                FileWriter writer = new FileWriter("Results.txt", true);
                writer.write("\n");
                writer.close();
            }
            catch (IOException e)
            {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

            scanner.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
