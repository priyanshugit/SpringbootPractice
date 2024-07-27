package EmployeeSorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortWithoutLambda {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "raj", 24, 3400.0));
        employees.add(new Employee(2, "shyam", 45, 1000.0));
        employees.add(new Employee(3, "reema", 19, 3000.0));
        employees.add(new Employee(4, "shinu", 54, 5600.0));
        employees.add(new Employee(5, "shinu", 45, 1000.0));

        // Java 8, we were used to create an anonymous inner class for the Comparator to sort as below
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        employees.forEach(System.out::println);

        }
    }

