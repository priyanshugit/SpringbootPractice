package ArrayPrograms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicate {
    //T.C = O(n2)
    public static void duplicateElement(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }
    //T.C = O(n)
    public static void duplicateElement2(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        int count =0;
        boolean duplicate = false;
//        for(int i=0; i<arr.length; i++){
//            if(map.containsKey(arr[i])){
//                count = map.get(arr[i]);
//                map.put(arr[i], count+1);
//            }
//            else
//                map.put(arr[i], 1);
//        }
        for(int i=0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

       // String value = numbers.getOrDefault(4, "Not Found");
       // In this case, if the key 4 is not present in the HashMap,
        // the string "Not Found" will be returned2. If the key 4 is present,
        // the value associated with that key in the HashMap will be returned2.

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() >1){
                System.out.print(entry.getKey()+" ");
                duplicate = true;
            }
        }
        System.out.println(" ");
        if(!duplicate){
            System.out.println("No duplicate element");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,9,3,4,5,3,6,7,8,9};
        int[] arr2 = {1, 2, 3, 4, 5, 7, 8};
        duplicateElement(arr);
        duplicateElement2(arr);
        duplicateElement2(arr2);
    }
}
