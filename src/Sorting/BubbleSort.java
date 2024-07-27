package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 8, 9 };
        bubbleSort(arr);
    }
    //Bubble Sort is a simple sorting algorithm that works by repeatedly swapping adjacent elements
    // if they are in the wrong order.This process continues until no more swaps are needed,
    // indicating that the list is sorted. It’s called “Bubble Sort” because elements “bubble”
    // up to their correct positions. It’s not very efficient for large lists, but it’s easy to
    // understand and implement.
    //T.C = O(n2)
    public static void bubbleSort(int[] arr) {
        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i]<arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}
