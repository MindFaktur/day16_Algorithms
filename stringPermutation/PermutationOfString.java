

public class PermutationOfString {
    public static void main(String[] args)
    {
        String str = "coir";
        int lengthOfString = str.length();
        PermutationOfString permutation = new PermutationOfString();
        permutation.permute(str, 0, lengthOfString-1);
    }


    private void permute(String str, int beginIndex, int stringLength)
    {
        if (beginIndex == stringLength)
            System.out.println(str);
        else
        {
            for (int i = beginIndex; i <= stringLength; i++)
            {
                str = swap(str,beginIndex,i);
                permute(str, beginIndex+1, stringLength);
                str = swap(str,beginIndex,i);
            }
        }
    }


    public String swap(String a, int i, int j)
    {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i] ;
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }

}
