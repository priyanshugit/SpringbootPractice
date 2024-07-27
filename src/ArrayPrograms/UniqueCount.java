package ArrayPrograms;

public class UniqueCount {
    public static void countUniqueElements(int[] nums)
    {
        int uniqueNumbers = 0;
        for (int i = 0; i < nums.length; i++) {
            // An element should be counted as unique if it's the first
            // element in the Array, or is different to the one before it.
            if (i == 0 || nums[i] != nums[i - 1]) {
                uniqueNumbers++;
            }
        }
        System.out.println(uniqueNumbers);
    }

    public static void main(String[] args) {
        int[] arr = {0, 0, 1, 2, 2, 2, 4};
        countUniqueElements(arr);
    }
}
