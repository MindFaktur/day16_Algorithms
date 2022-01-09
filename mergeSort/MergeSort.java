

public class MergeSort{

    public void mergeSort(int arr[],int leftIndex,int rightIndex)
    {
        if(leftIndex<rightIndex)
        {
            int mid;
            mid = (leftIndex+rightIndex)/2;
            mergeSort(arr,leftIndex,mid);
            mergeSort(arr,mid+1,rightIndex);
            merge(arr,leftIndex,mid,rightIndex);
        }
    }
    public void merge(int arr[],int leftIndex,int mid,int rightIndex)
    {
        int n1=(mid-leftIndex+1);
        int n2=rightIndex-mid;
        int  left[]=new int[n1];
        int right[]= new int[n2];
        int i;
        for (i=0;i<n1;i++)
        {
            left[i]=arr[leftIndex+i];
        }
        for (i=0;i<n2;i++)
        {
            right[i]=arr[mid+1+i];
        }
        int li,ri,ai;
        li=0;
        ri=0;
        ai=leftIndex;
        while (li<n1 && ri <n2)
        {
            if(left[li]<=right[ri])
            {
                arr[ai]= left[li];
                ai++;
                li++;
            }
            else
            {
                arr[ai]= right[ri];
                ai++;
                ri++;
            }
        }
        while(li < n1)
        {
            arr[ai]= left[li];
            ai++;
            li++;
        }
        while(ri < n2)
        {
            arr[ai]= right[ri];
            ai++;
            ri++;
        }
    }
    public void printArray(int arr[])
    {
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
    public static void main(String args[])
    {
        int arr[]={1,8,6,2,3,5,4,9};
        MergeSort obj= new MergeSort();
        System.out.println("array before applying merge sort");
        obj.printArray(arr);
        obj.mergeSort(arr,0,7);
        System.out.println("\narray after applying merge sort");
        obj.printArray(arr);
    }
}