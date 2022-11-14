import java.util.HashMap;

public class Solution
{
    public static int solution(String S)
    {
        HashMap<String, Integer> letterIterations = new HashMap<String, Integer>();
        letterIterations.put("B", 0);
        letterIterations.put("A", 0);
        letterIterations.put("L", 0);
        letterIterations.put("O", 0);
        letterIterations.put("N", 0);

        for(int i = 0; i < S.length(); i++)
        {
            System.out.println(S.charAt(i));
        }
        return 0;
    }

    public static void call(String [] args)
    {
        System.out.println(solution("BALLOON"));
    }
}
