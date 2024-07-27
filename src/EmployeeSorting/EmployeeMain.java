package EmployeeSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "raj", 24, 3400.0));
        employees.add(new Employee(2, "shyam", 45, 1000.0));
        employees.add(new Employee(3, "reema", 19, 3000.0));
        employees.add(new Employee(4, "shinu", 54, 5600.0));
        employees.add(new Employee(5, "shinu", 45, 1000.0));

       // Employee objects and sort them in ascending order based on their name first,
        // and then their salary.

        List<Employee> sortedList = employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        System.out.println("********Sorting in ascending order based on their first name and then their salary");
        sortedList.forEach(System.out::println);

        System.out.println("********Sorting in descending order based on their first name and then their salary");
       // List<Employee> descendingSort = employees.stream().sorted(Comparator.comparing(Employee::getName, Comparator.reverseOrder()).thenComparing(Employee::getSalary, Comparator.reverseOrder())).collect(Collectors.toList());
                                            //OR
        List<Employee> descendingSort = employees.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary).reversed()).collect(Collectors.toList());

        descendingSort.forEach(System.out::println);



    }
}
