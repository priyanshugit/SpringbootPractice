package ArrayPrograms;

public class ArrayInsertion {

    public static void insertAtStart(){
        // Decleration of an array of size 6
        int[] arr = new int[6];
        // Insert element in 4th indexes
        for(int i=0; i< 5; i++)
        {
            arr[i] = i*i;
        }
        // After 4th index, 5 will contain 0
        for(int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
        // Replacing elements to make the 0th index blank
        for(int i = 5; i > 0; i--)
        {
            arr[i] = arr[i-1];
        }
        // insertion at 0th index
        arr[0] = 10;
        System.out.println("After insertion new array will be");
        for(int i=0; i< arr.length; i++)
        {
            System.out.println(arr[i]);
        }
    }

    public static void insertAtEnd() {
        // Decleration of an array of size 6
        int[] arr = new int[6];
        // Insert element at all indexex except 0th index
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i * i;
        }
        // 0th index will contain 0 as default
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        // Replacing elements to make the 5th index blank
        for (int i = 1; i<arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length-1] = 10;
        System.out.println("After insertion at end");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
    public static void insertAtSpecificIndex() {
        // Decleration of an array of size 6
        int[] arr = new int[6];
        // Insert element at all indexex except last index
        for (int i = 1; i < arr.length-1; i++) {
            arr[i] = i * i;
        }
        // last index will contain 0
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index " + i+" "+ arr[i]);
        }
        // insert element 10 at index 3rd
        for (int i = arr.length-1; i> 3; i--) {
            arr[i] = arr[i-1];
        }
        arr[3] = 10;
        System.out.println("Inserting element at 3rd index");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("index " + i+" "+ arr[i]);
        }
    }
    public static void main(String[] args) {
       // insertAtStart();
        //insertAtEnd();
        insertAtSpecificIndex();
    }
}
