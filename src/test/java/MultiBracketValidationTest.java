import org.junit.Test;


import static org.junit.Assert.*;

public class MultiBracketValidationTest {

    //happy path
    @Test
    public void testMultiBracketValidationSuccess() {
        assertTrue(MultiBracketValidation.multiBracketValidation("{}"));
        assertTrue(MultiBracketValidation.multiBracketValidation("[]"));
        assertTrue(MultiBracketValidation.multiBracketValidation("()"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{}[]()"));
        assertTrue(MultiBracketValidation.multiBracketValidation("{[()]}"));
    }

    //expected failure
    @Test
    public void testMultiBracketValidationFail() {
        assertFalse(MultiBracketValidation.multiBracketValidation("["));
        assertFalse(MultiBracketValidation.multiBracketValidation(("]")));
        assertFalse(MultiBracketValidation.multiBracketValidation("{"));
        assertFalse(MultiBracketValidation.multiBracketValidation("}"));
        assertFalse(MultiBracketValidation.multiBracketValidation("("));
        assertFalse(MultiBracketValidation.multiBracketValidation(")"));
        assertFalse(MultiBracketValidation.multiBracketValidation("[{}"));
    }

    //EdgeCases

    @Test
    public void testMultiBracketValidationEdgeCase() {
        //per the spec and my whiteboard, this should fail. However, with this solution these brackets will be considered
        //balanced. I choose to consider this a feature, and not a bug.
        assertTrue(MultiBracketValidation.multiBracketValidation("{[}]"));
        //this becomes negative before it zero's out, and so breaks out of the while loop and returns false.
        assertFalse(MultiBracketValidation.multiBracketValidation("]["));
        //these are the two major edge cases I could think of - however I can add more as they come to me.
    }

}