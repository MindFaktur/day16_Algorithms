import java.util.Arrays;

public class AnagramDetection
{
    public String stringOne = "bades";
    public String stringTwo = "EarTh";

    private char[] sortedCharString(String unSortedString)
    {
        String unSortedToSmallCase = unSortedString.toLowerCase();
        char[] sortedList = unSortedToSmallCase.toCharArray();

        for ( int i = 0; i < sortedList.length-1; i++ )
        {
            for( int j = i+1; j < sortedList.length; j++  )
            {
                if (sortedList[i] > sortedList[j])
                {
                    char temp = sortedList[j];
                    sortedList[j] = sortedList[i];
                    sortedList[i] = temp;
                }
            }
        }
        return sortedList;
    }

    private boolean isAnagram(String strOne, String strTwo)
    {
        char[] stringOne = sortedCharString(strOne);
        char[] stringTwo = sortedCharString(strTwo);

        for( int i = 0; i < stringOne.length-1; i++ )
        {
            if( stringOne[i] != stringTwo[i] )
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)
    {
        AnagramDetection AG = new AnagramDetection();

        if( AG.stringOne.length() != AG.stringTwo.length() )
        {
            System.out.println("Given Strings are not anagram");
        }

        if( AG.isAnagram(AG.stringOne, AG.stringTwo) )
        {
            System.out.println("The given strings are anagrams");
        }
        else{
            System.out.println("Given Strings are not anagram");
        }

    }

}
