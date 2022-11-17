package Test;

import org.Task.Input;
import org.Task.PairResult;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InputTest
{
    @Test
    void testInput()
    {
        // Setup
        final PairResult expectedResult = new PairResult("first", "second");

        // Run the test
        final PairResult result = Input.input();

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
