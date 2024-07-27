package EmployeeSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithMethodReference {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "raj", 24, 3400.0));
        employees.add(new Employee(2, "shyam", 45, 1000.0));
        employees.add(new Employee(3, "reema", 19, 3000.0));
        employees.add(new Employee(4, "shinu", 54, 5600.0));
        employees.add(new Employee(5, "shinu", 45, 1000.0));
        //sort the List in Java 8 using Method Reference. By using an instance method reference and the Comparator.comparing method,
        // we can also avoid defining even the comparison logic itself. We will use the getter getName() to build the Lambda expression
        // and sort the list by name and then age:
        Collections.sort(employees, Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));
        employees.forEach(System.out::println);
    }
}
