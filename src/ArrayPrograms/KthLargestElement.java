package ArrayPrograms;

public class KthLargestElement {
    public static void main(String[] args) {
        int arr[] = {30, 50, 45, 67, 90, 54};
        int k = 4;
        kthLargestElement(arr,k);
    }
    public static void kthLargestElement(int[] arr, int k) {
        for(int i=0; i<arr.length-1; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]<arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            if(i==k-1){
                System.out.println(k+" Largest element is "+arr[i]);
                break;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
