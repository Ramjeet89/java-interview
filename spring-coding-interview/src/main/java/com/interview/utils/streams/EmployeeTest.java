package com.interview.utils.streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class EmployeeTest {

    public static void main(String[] args) {

    }

    public void whenFilterEmployees_thenGetFilteredStream() {
  /*      Integer[] empIds = {1, 2, 3, 4};
        List<Employee> employees = Stream.of(empIds)
                .map(employeeRepository::findById)
                .filter(e -> e != null)
                .filter(e -> e.getSalary() > 2000)
                .collect(Collectors.toList());
    }*/
        List<List<String>> namesNested = Arrays.asList(
                Arrays.asList("Jeff", "Bezos"),
                Arrays.asList("Bill", "Gates"),
                Arrays.asList("Mark", "Zuckerberg"));

        List<String> namesFlatStream = namesNested.stream()
                .flatMap(Collection::stream)
                .toList();
    }
}