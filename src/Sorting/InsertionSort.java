package Sorting;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {45, 66, 23, 56, 11, 66, 11};
        insertionSort(arr);

    }
    //Insertion Sort is a sorting algorithm that works by dividing the array into a sorted
    // and an unsorted region. One by one, elements from the unsorted region are picked and
    // placed at the correct position in the sorted region. This process continues until all
    // the elements are sorted. It’s similar to how you would sort playing cards in your hand.
    // It’s efficient for smaller lists or lists that are already partially sorted.
    //T.C = O(n2)
    public static void insertionSort(int[] arr){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(j >=0 && arr[j]> key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
