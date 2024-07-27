package ArrayPrograms;

import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void removeDuplicate(int arr[]){
        HashSet set = new HashSet();
        for(int i=0;i< arr.length; i++){
            set.add(arr[i]);
        }
        System.out.println(Arrays.toString(set.toArray()));

    }
    // T.C = O(n) , S.C = O(n)
    public static int[] copyWithRemovedDuplicates(int[] nums) {

        // Check for edge cases.
        if (nums == null || nums.length == 0) {
            return nums;
        }

        // Count how many unique elements are in the Array.
        int uniqueNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            // An element should be counted as unique if it's the first
            // element in the Array, or is different to the one before it.
            if (i == 0 || nums[i] != nums[i - 1]) {
                uniqueNumbers++;
            }
        }

        // Create a result Array.
        int[] result = new int[uniqueNumbers];

        // Write the unique elements into the result Array.
        int positionInResult = 0;
        for (int i = 0; i < nums.length; i++) {
            // Same condition as in the previous loop. Except this time, we can write
            // each unique number into the result Array instead of just counting them.
            if (i == 0 || nums[i] != nums[i - 1]) {
                result[positionInResult] = nums[i];
                positionInResult++;
            }
        }
        return result;
    }

    // T.C = O(N2)
    public static void removeDuplicates(int[] nums) {

            // The initial length is simply the capacity.
            int length = nums.length;

            // Assume the last element is always unique.
            // Then for each element, delete it if it is
            // the same as the one after it. Use our deletion
            // algorithm for deleting from any index.
            for (int i = length - 2; i >= 0; i--) {
                if (nums[i] == nums[i + 1]) {
                    // Delete the element at index i, using our standard
                    // deletion algorithm we learned.
                    for (int j = i + 1; j < length; j++) {
                        nums[j - 1] = nums[j];
                    }
                    // Reduce the length by 1.
                    length--;
                }
            }
            // Return the new length.
            for(int i=0; i<length; i++)
                System.out.print(nums[i]+", ");
    }

    //T.c - O(n)
    public static void removeDuplicates2(int[] nums) {
        int k = 1;
        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1] != nums[i])
            {
                nums[k]= nums[i];
                k++;
            }
        }
        for(int i=0; i<k; i++)
            System.out.print(nums[i]+", ");

    }


    public static void main(String[] args) {
        int arr[] = {1,2, 2, 3, 3, 4, 5, 6};
        removeDuplicate(arr);

        int arr1[] = copyWithRemovedDuplicates(arr);
        for(int a: arr1)
            System.out.print(a);
        removeDuplicates(arr);
        removeDuplicates2(arr);



    }
}
