package test;

import main.BalancedBrackets;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        Assert.assertEquals(true, true);
    }

    //POSITIVE TESTS
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void testNoBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("word"));
    }

    @Test
    public void testSimpleWord() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[word]"));
    }

    @Test
    public void testNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Testing [one [two [three]]]"));
    }

    @Test
    public void testNonNestedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("I [will not] go [quietly] into the [night]."));
    }

    // NEGATIVE TESTS

    @Test
    public void testReversedSimpleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void testMissingEndBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[No], this [won't] work.]"));
    }

    @Test
    public void testUnbalancedMultipleBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("What [if] ] I told [you [a secret]?"));
    }

    @Test
    public void testNothingButBracketsLotsAndLotsOfBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[][][][]]][][][][[[][][][[[][][][][["));
    }

    @Test
    public void testOneBracketOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void testOneBracketClose(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }


}
