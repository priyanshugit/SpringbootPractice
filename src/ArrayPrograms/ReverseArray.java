package ArrayPrograms;

public class ReverseArray {
    public static void reverseArray(int[] arr){
        int[] reversed = new int[arr.length];
        for(int i= arr.length-1; i>=0; i--)
        {
            reversed[arr.length-1-i] = arr[i];
        }

        for(int rev : reversed)
            System.out.print(rev+" ");
    }

    public static void inPlaceReverse(int[] arr){
        for(int i=0; i< arr.length/2; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-1-i];
            arr[arr.length-1-i] = temp;
        }
        for(int rev : arr)
            System.out.print(rev+" ");
    }
    public static void main(String[] args) {
        int arr[] = {1, 2,4, 4, 5, 6, 7};
        reverseArray(arr);
        System.out.println();
        inPlaceReverse(arr);
        System.out.println();
        inPlaceReverse(arr);
    }
}
