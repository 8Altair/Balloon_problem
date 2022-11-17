package Test;

import org.Task.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SolutionTest
{
    @Test
    void testSolution()
    {
        Assertions.assertEquals(0, Solution.solution("S", "T"));
    }
}
