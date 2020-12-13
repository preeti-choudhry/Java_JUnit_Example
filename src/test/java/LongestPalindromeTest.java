import org.hamcrest.Matcher;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

@RunWith(value = Parameterized.class)
public class LongestPalindromeTest {

    public static String input, result;

    public LongestPalindromeTest(String input, String output)
    {
        this.input=input;
        this.result=output;
    }

    @Parameters
    public static Collection<Object[]> data()
    {
        return Arrays.asList(new Object[][]{
                {"bananas", "anana"},
                {"dabcbac", "abcba"},
                {"cccgig", "ccc"}
                //,{"cccgig", "gig"}
                });
    }

    @Test
    public void longestPalindromeTest()
    {
        LongestPalindrome lp = new LongestPalindrome();
        assertThat(lp.longestPalindrome(input),is(result));
        int len = result.length();
        System.out.println("InputString: "+input+ "; Longest Palindrome: "+ result+ "; Length: "+ len);
    }



}
