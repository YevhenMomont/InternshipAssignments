import org.junit.Test;

import static org.junit.Assert.*;

public class RecursionTest {


    private static final String EXPECTED_STRING = "h*e*ll*o";
    private static final String EXPECTED_STRING2 = "h*e*a*l*o";
    private static final String EXPECTED_STRING3 = "a*bc";
    private static final String EXPECTED_STRING4 = "o*a*b";

    @Test
    public void interviewRecursionTest() {
        assertEquals(EXPECTED_STRING, Recursion.interviewRecursionTest("hello"));
        assertEquals(EXPECTED_STRING2, Recursion.interviewRecursionTest("healo"));
        assertEquals(EXPECTED_STRING3, Recursion.interviewRecursionTest("abc"));
        assertEquals(EXPECTED_STRING4, Recursion.interviewRecursionTest("oab"));

    }
}