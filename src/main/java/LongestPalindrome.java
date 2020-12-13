
//This logic has Time Complexity of O(n^2), and Space Complexity of O(1).

public class LongestPalindrome {

    String longestPalin;

    public String longestPalindrome(String inputStr)
    {
        int len = inputStr.length();

        // if the input string is null or has length =1 (single character), then return the same as result.
        if( inputStr==null || len==1)
            return inputStr;

        //initialising longest palindrome with first charcter of input string.
        longestPalin = inputStr.substring(0,1);

        for(int i=0;i<len;i++)
        {
            String temp;

            /*
            //if input string is of even length then we need to center 2 positions to check Palindrome.
            if(len%2!=0)
            {
                temp = returnPalindrome(inputStr,i,i+1);
            }
            else  //if input string is of even length then we need to center 1 position to check Palindrome.
            {
                temp = returnPalindrome(inputStr,i,i);
            }
            */

            temp = returnPalindrome(inputStr,i,i);
            if(temp.length()>longestPalin.length())
                longestPalin = temp;

            //print each Palindrome found with length>1
            if (temp.length()>1)
                System.out.println("Found Palindrome: "+ temp+" , with length="+temp.length());

            temp = returnPalindrome(inputStr,i,i+1);
            if(temp.length()>longestPalin.length())
                longestPalin = temp;

            //print each Palindrome found with length>1
            if (temp.length()>1)
                System.out.println("Found Palindrome: "+ temp+" , with length="+temp.length());

        }

        return longestPalin;
    }

    public String returnPalindrome(String input,int begin,int end)
    {
        while(begin>=0 && end < input.length() && input.charAt(begin)==input.charAt(end))
        {
              begin--;
                end++;
        }
        return (input.substring(begin+1,end));
    }


}
