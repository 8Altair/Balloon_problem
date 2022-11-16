package org.Task;

import java.io.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        PairResult data = Input.input();    // Pair of two input strings
        if(data.second().equals("f"))       // FIle reading
        {
            try
            {
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
        else    // Result of two inputs
        {
            System.out.println(Solution.solution(data.first(), data.second()));
        }
    }
}
