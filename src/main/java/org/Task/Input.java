package org.Task;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.apache.commons.lang3.tuple.Pair;

public class Input
{
    public static String input()
    {
        System.out.println("Enter the word You are searching:");
        Scanner key = new Scanner(System.in);
        String word = key.nextLine();

        System.out.println("Press \"i\" for input and \"f\" for file reading of the text.");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();

        if(answer.equals("i"))
        {
            Scanner stringObject = new Scanner(System.in);
            return new Pair<String, String>(10, "Hello Geeks!");//stringObject.nextLine();
        }

        try
        {
            Scanner scanner = new Scanner(new File("\"C:\\Users\\dinoa\\IdeaProjects\\Balloon_problem\\Text.txt\""));
            while (scanner.hasNextLine())
            {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        }
        catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }

        return ;
}
