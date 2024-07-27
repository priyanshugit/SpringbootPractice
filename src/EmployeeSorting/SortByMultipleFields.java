package EmployeeSorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortByMultipleFields {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee(1, "raj", 24, 3400.0));
        employees.add(new Employee(2, "shyam", 45, 1000.0));
        employees.add(new Employee(3, "reema", 19, 3000.0));
        employees.add(new Employee(4, "shinu", 54, 5600.0));
        employees.add(new Employee(5, "shinu", 45, 1000.0));

       Comparator<Employee> sortByName = (e1, e2) -> e1.getName().compareToIgnoreCase(e2.getName());
       Comparator<Employee> sortByAge = Comparator.comparing(Employee::getAge);
       Comparator<Employee> sortBySalary = (e1, e2) -> e1.getSalary().compareTo(e2.getSalary());

       employees.stream().sorted(sortByName.thenComparing(sortByAge).thenComparing(sortBySalary)).forEach(System.out::println);

    }
}
