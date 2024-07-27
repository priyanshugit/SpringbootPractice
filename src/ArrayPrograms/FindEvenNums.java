package ArrayPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.IntPredicate;
import java.util.stream.Stream;

public class FindEvenNums {
    public static int[] evenNums(int[] arr, int[] arr1){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int num : arr){
            if(num %2 == 0)
            {
                arrayList.add(num);
            }
        }
        for(int num : arr1){
            if(num %2 == 0)
            {
                arrayList.add(num);
            }
        }
        return arrayList.stream().mapToInt(Integer::intValue).toArray();
    }
    //Do it without using any loops
    public static int[] evenNums2(int[] arr, int[] arr1){
        IntPredicate isevenPred = num -> num%2 ==0;
        return Stream.of(arr, arr1)
                .flatMapToInt(Arrays::stream)
                .filter(isevenPred)
                .toArray();

    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 5, 7, 8, 9};
        int arr1[] = {10, 34, 23, 18, 89};
        int result[] = evenNums(arr, arr1);
        for(int res : result)
        {
            System.out.println(res);
        }
        System.out.println("Using stream API");
        int result1[] = evenNums2(arr, arr1);
        for(int res : result1)
        {
            System.out.println(res);
        }
    }
}
