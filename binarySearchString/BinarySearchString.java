import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class BinarySearchString {

    public static String user = "Hello had a bad Day In the Office at work";
    public static String[] userValues = user.split(" ",0);

    public static void main(String[] args) {

        String toFind = "day";
        int lengthOfIndex = userValues.length;
        int left = 0, right = lengthOfIndex-1, mid = (left + right)/2;
        String[] caseType = BinarySearchOperations.singleCaseType(userValues);
        String[] sortedUserArray = BinarySearchOperations.sortedArray(caseType);
        BinarySearchOperations.getTheIndexOfGivenString(toFind,sortedUserArray,left,right,mid);
    }
}

class BinarySearchOperations{

    public static String[] singleCaseType(String[] userEntered) {

        for ( int i = 0; i < userEntered.length-1; i++ ) {
            userEntered[i] = userEntered[i].toLowerCase();
        }
        return userEntered;
    }

    public static void getTheIndexOfGivenString(String find,String[] userVal, int left, int right, int mid) {
        int thisLeft = left,thisRight = right,thisMid = mid;
        boolean found = false;
        while ( !found && thisLeft != thisMid ) {
            if( find.compareTo(userVal[thisMid]) == 0 ){
                found = true;
                break;
            }
            else if (find.compareTo(userVal[thisMid]) < 0) {
                thisRight = thisMid;
                thisMid = thisMid/2;
            } else {
                thisLeft = thisMid;
                thisMid = (thisMid + thisRight)/2;
            }
        }
        if( found ) {
            System.out.println(find + " is Present ");
        }else{
            System.out.println("not found");
        }
    }

    public static String[] sortedArray(String[] unSortedArray){
        for ( int i = 0; i < unSortedArray.length-1; i++ ){
            for ( int j = i+1; j < unSortedArray.length; j++ ){
                if ( unSortedArray[i].compareTo(unSortedArray[j]) > 0 ){
                    String temp = unSortedArray[i];
                    unSortedArray[i] = unSortedArray[j];
                    unSortedArray[j] = temp;
                }
            }
        }
        return unSortedArray;
    }

}

