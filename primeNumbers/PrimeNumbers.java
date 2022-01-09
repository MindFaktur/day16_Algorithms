import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumbers {

    public static List<Integer> primeNumbers = new ArrayList<>();
    public static List<Integer> palindromeNumbers = new ArrayList<>();
    public static List<Integer> anagramNumbers = new ArrayList<>();
    private static final int maxNumber = 1000;

    public static void main(String[] args) {
        int i = 1;

        while( i <= maxNumber ){
            if ( i > 3 ){
                boolean exist = false;
                for ( int j = 2; j < i; j++ ){
                    if( i % j == 0 ){
                        exist = true;
                        break;
                    }
                }
                if( !exist ){
                    primeNumbers.add(i);
                }

            }else{
                primeNumbers.add(i);
            }
            i++;

        }
        System.out.println("Prime numbers between 0 to " + maxNumber + " : " + primeNumbers);
        System.out.println("palindromes : " + palindromeFinder());
        anagramFinder();
        System.out.println("Anagrams : " + anagramNumbers);

    }

    private static List<Integer> palindromeFinder(){

        return primeNumbers.stream().filter(i -> {
            int rev = 0, check = i;
            while( i > 0 ){
                rev = rev * 10 + i%10;
                i = i/10;
            }
            return rev == check;

        }).collect(Collectors.toList());
    }

    private static void anagramFinder(){

        for( int i = 0; i < primeNumbers.size(); i++ )
        {
            Integer firstNum = primeNumbers.get(i);
            char [] first = String.valueOf(firstNum).toCharArray();
            Arrays.sort(first);
            for (  int j = i+1; j < primeNumbers.size(); j++ )
            {
                Integer secondNum = primeNumbers.get(j);
                char [] second = String.valueOf(secondNum).toCharArray();
                Arrays.sort(second);

                if( (new String(first)).equals(new String(second)) )
                {
                    anagramNumbers.add(firstNum);
                    break;
                }
            }
        }


    }

}
