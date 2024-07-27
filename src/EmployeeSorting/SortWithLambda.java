package EmployeeSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortWithLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "raj", 24, 3400.0));
        employees.add(new Employee(2, "shyam", 45, 1000.0));
        employees.add(new Employee(3, "reema", 19, 3000.0));
        employees.add(new Employee(4, "shinu", 54, 5600.0));
        employees.add(new Employee(5, "shinu", 45, 1000.0));

        employees.sort((e1, e2)->e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);

        Collections.sort(employees, (e1, e2)-> e1.getName().compareTo(e2.getName()));
        employees.forEach(System.out::println);
    }
}
