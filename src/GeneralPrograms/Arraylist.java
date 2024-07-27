package GeneralPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Arraylist {
    public static void arrayListToSet(){
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
        Set<Integer> set = new HashSet<>();
        set.addAll(arrayList);
        System.out.println(arrayList);
        System.out.println(set);

    }

    public static void addTwoArrayList(){
        // Create the first ArrayList
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        // Create the second ArrayList
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Four");
        list2.add("Five");
        list2.add("Six");

        // Add all elements from list2 to list1
        list1.addAll(list2);

        // Now list1 contains all elements from both list1 and list2
        System.out.println("Combined ArrayList: " + list1);

    }

    public static void main(String[] args) {
        arrayListToSet();
        addTwoArrayList();
    }
}
