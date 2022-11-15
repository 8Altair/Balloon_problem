package org.Task;

import java.util.HashMap;

public class Solution
{
    public static int solution(String S, String T)
    {
        HashMap<String, Integer> letterIterations = new HashMap<String, Integer>();
        letterIterations.put("B", 0);
        letterIterations.put("A", 0);
        letterIterations.put("L", 0);
        letterIterations.put("O", 0);
        letterIterations.put("N", 0);

        for(int i = 0; i < S.length(); i++)
        {
            letterIterations.put(letterIterations[i], letterIterations.get(i) + 1);
        }

        /*for(int i = 0; i < S.length(); i++)
        {
            if ((Character.toString(S.charAt(i)).equals("B")))
            {
                letterIterations.put("B", letterIterations.get("B") + 1);
            }
            if ((Character.toString(S.charAt(i)).equals("A")))
            {
                letterIterations.put("A", letterIterations.get("A") + 1);
            }
            if ((Character.toString(S.charAt(i)).equals("L")))
            {
                letterIterations.put("L", letterIterations.get("L") + 1);
            }
            if ((Character.toString(S.charAt(i)).equals("O")))
            {
                letterIterations.put("O", letterIterations.get("O") + 1);
            }
            if ((Character.toString(S.charAt(i)).equals("N")))
            {
                letterIterations.put("N", letterIterations.get("N") + 1);
            }
        }*/

        return Math.min(letterIterations.get("B"), Math.min(letterIterations.get("A"),
                Math.min(letterIterations.get("L") / 2, Math.min(letterIterations.get("O") / 2,
                        letterIterations.get("N")))));
    }
}
