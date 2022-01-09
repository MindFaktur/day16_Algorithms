
public class InsertionSort {

    public static String user = "Hello bad day today No yes";
    public static String[] userValues = user.split(" ",0);

    public static void main(String[] args) {
        InsertionSOrtOperations op = new InsertionSOrtOperations();
        String[] unsortedArray = op.convertAllWordsToLowerCase(userValues);
        String[] sortedArray = op.sortedArray(unsortedArray);
        for ( String str : sortedArray ) {
            System.out.println(str);
        }
    }

}

class InsertionSOrtOperations{

    String[] convertAllWordsToLowerCase(String[] userEntered) {

        for ( int i = 0; i < userEntered.length-1; i++ ) {
            userEntered[i] = userEntered[i].toLowerCase();
        }
        return userEntered;
    }

    String[] sortedArray(String[] unSortedArray){
        for ( int j = 1; j < unSortedArray.length; j++ ){
            int i = j-1;
            String temp = unSortedArray[j];
            while( i >= 0 && (unSortedArray[i].compareTo(temp)) > 0  ){
                unSortedArray[i+1] = unSortedArray[i];
                i--;
            }
            unSortedArray[i+1] = temp;
        }
        return unSortedArray;
    }


}
