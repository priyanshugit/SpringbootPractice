package ArrayPrograms;

import java.util.ArrayList;

public class ConvertArrayListToArray {
    public static int[] returnArray(ArrayList<Integer> list){
        return list.stream().mapToInt(Integer :: intValue).toArray();
    }
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        int[] arr =returnArray(arrayList);


    }
}
