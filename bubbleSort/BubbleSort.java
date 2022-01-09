
public class BubbleSort {
    public static String user = "Hello bad day today No yes";
    public static String[] userValues = user.split(" ",0);

    public static void main(String[] args) {
        BubbleSortOperations op = new BubbleSortOperations();
        String[] unsortedArray = op.convertAllWordsToLowerCase(userValues);
        String[] sortedArray = op.sortedArray(unsortedArray);
        for ( String str : sortedArray ) {
            System.out.println(str);
        }
    }
}

class BubbleSortOperations {

    String[] convertAllWordsToLowerCase(String[] userEntered) {

        for ( int i = 0; i < userEntered.length-1; i++ ) {
            userEntered[i] = userEntered[i].toLowerCase();
        }
        return userEntered;
    }

    String[] sortedArray(String[] unSortedArray){
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

