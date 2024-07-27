package StringPrograms;

public class MissingNumber {
    //T.C =O(N)
    public static int getMissingNumber(int[] array, int n) {
        int total = (n + 1) * (n + 2) / 2;
        for (int i = 0; i < n; i++) {
            total -= array[i];
        }
        return total;
    }
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 6, 7, 3, 8};
        int missingNumber = getMissingNumber(array, array.length);
        System.out.println("The missing number is: " + missingNumber);
    }
}
