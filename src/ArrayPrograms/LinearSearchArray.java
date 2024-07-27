package ArrayPrograms;

import java.util.Arrays;
import java.util.OptionalInt;

public class LinearSearchArray {
    public static Integer linearSearch(int[] arr, int item){
        for(int current : arr)
        {
            if(current == item)
            {
                return item;
            }
        }
        return null;
    }
    public static OptionalInt linearSearch2(int[] arr, int item){
        return Arrays.stream(arr).filter(x -> x == item).findFirst();
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        System.out.println(linearSearch(arr, 2));
        System.out.println(linearSearch(arr, 9));

        linearSearch2(arr, 3).ifPresent(System.out::println);
        linearSearch2(arr, 19).ifPresent(System.out::println);

    }
}
