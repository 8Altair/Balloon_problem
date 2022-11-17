package Test;

import org.Task.PairResult;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PairResultTest
{

    private PairResult pairResultUnderTest;

    @BeforeEach
    void setUp() {
        pairResultUnderTest = new PairResult("first", "second");
    }

    @Test
    void testValues()
    {
        // Setup
        final PairResult expectedResult = new PairResult("first", "second");

        // Run the test
        final PairResult result = pairResultUnderTest.Values("S1", "S2");

        // Verify the results
        assertEquals(expectedResult, result);
    }
}
