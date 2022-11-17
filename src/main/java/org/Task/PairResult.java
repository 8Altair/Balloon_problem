package org.Task;

public record PairResult(String first, String second)   // Pair of two strings
{
    public PairResult Values(String S1, String S2) { return new PairResult(this.first(), this.second()); }    // Returns the pair
}
