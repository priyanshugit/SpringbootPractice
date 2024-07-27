package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {12, 55, 34, 56, 125, 78};
        System.out.println("Given array");
        mergeSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void mergeSort(int[] arr, int lowerIndex, int upperIndex) {
              divideArray(arr, lowerIndex, upperIndex);
    }
    public static void divideArray(int[] arr, int lowerIndex, int upperIndex) {
        if(lowerIndex < upperIndex) {
            int mid = (lowerIndex + upperIndex) / 2;
            divideArray(arr, lowerIndex, mid);
            divideArray(arr, mid + 1, upperIndex);
            mergeArray(arr, lowerIndex, mid, upperIndex);
        }
    }

    public static void mergeArray(int[] arr, int lowerIndex,int mid, int upperIndex) {
        int n1 = mid - lowerIndex + 1;
        int n2 = upperIndex - mid;
        int[] LeftArray = new int[n1];
        int[] RightArray = new int[n2];
        for(int i = 0; i < n1; i++) {
            LeftArray[i] = arr[lowerIndex + i];
        }
        for(int i = 0; i < n2; i++) {
            RightArray[i] = arr[mid + 1 + i];
        }
        int i = 0, j = 0;
        int k = lowerIndex;
        while(i < n1 && j < n2) {
            if(LeftArray[i] <= RightArray[j]) {
                arr[k] = LeftArray[i];
                i++;
            }else {
                arr[k] = RightArray[j];
                j++;
            }
            k++;
        }
        //Merging two halves
        while(i < n1) {
            arr[k] = LeftArray[i];
            i++;
            k++;
        }
        while(j < n2) {
            arr[k] = RightArray[j];
            j++;
            k++;
        }
    }
}
