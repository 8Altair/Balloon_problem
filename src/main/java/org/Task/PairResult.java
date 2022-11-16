package org.Task;

public record PairResult(String first, String second)   // Pair of two strings
{
    public static PairResult Values(String S1, String S2) { return new PairResult(S1, S2); }    // Returns the pair
}
