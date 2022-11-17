package org.Task;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Collections;

public class Solution
{
    public static int solution(String S, String T)  // S for the search word, T for the text in which the search is held
    {
        HashMap<String, Integer> letterIterations1 = new HashMap<String, Integer>();    // All characters inside the S
        for(int i = 0; i < S.length(); i++) // Iterating through the length of the string S
        {
            if(letterIterations1.containsKey(Character.toString(S.charAt(i)))) // Checking if the key already exists
            {
                letterIterations1.put       // Updating value by 1
                        (Character.toString(S.charAt(i)), letterIterations1.get(Character.toString(S.charAt(i))) + 1);
            }
            else    // The pair must be created
            {
                letterIterations1.put(Character.toString(S.charAt(i)), 1);  // Adding a new pair in the map
            }
        }

        HashMap<String, Integer> letterIterations2 = new HashMap<String, Integer>();    // All characters inside the T
        for(int i = 0; i < T.length(); i++) // Iterating through the length of the text T
        {
            if(letterIterations2.containsKey(Character.toString(T.charAt(i))))  // Checking if the key already exists
            {
                letterIterations2.put       // Updating value by 1
                        (Character.toString(T.charAt(i)), letterIterations2.get(Character.toString(T.charAt(i))) + 1);
            }
            else    // The pair must be created
            {
                letterIterations2.put(Character.toString(T.charAt(i)), 1);  // Adding a new pair in the map
            }
        }

        List<Integer> appearances = new ArrayList<>();  // Creating a list of integers
        for(int i = 0; i < S.length(); i++) // Iterating through the length of the string S
        {
            if(letterIterations2.containsKey(Character.toString(S.charAt(i))))
            {
                appearances.add     // Adding an element (integer quotient) in the created list
                        (letterIterations2.get(Character.toString(S.charAt(i))) /
                                letterIterations1.get(Character.toString(S.charAt(i))));
            }
        }

        if(appearances.isEmpty()) { return 0; }
        return Collections.min(appearances);    // Returning the minimum element inside the list
    }
}
