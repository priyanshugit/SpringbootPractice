package ArrayPrograms;

public class ZeroAndOne {
    // Do left shift all the zeros and do right shift all the ones in the given array

    //T.C =O(n)
    public static void approach1(int arr[])
    {
        int count = 0;
        //Count number of zeros
        for(int i=0; i<arr.length; i++){
            if(arr[i]== 0)
                count++;
        }
        for(int i=0; i<count; i++){
            arr[i]=0;
        }
        for(int i=count; i<arr.length; i++){
            arr[i]=1;
        }
        for(int a : arr){
            System.out.println(a);
        }
    }

    public static void main(String[] args) {
        int arr[] = {1, 0, 0, 1, 0, 1,0, 1, 1};
        approach1(arr);



    }
}
