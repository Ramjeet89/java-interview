package com.coding.interview.controller;

import com.coding.interview.model.Employee;
import com.coding.interview.repository.EmployeeRepository;
import com.coding.interview.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping("api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private EmployeeRepository repo;


    @GetMapping("/")
    public ResponseEntity<?> getAllEmployee() {

        /*
         List<String> nameInRepo = repo.findAll().stream().map(Employee::getName).toList();

         method-1
         to find unique and duplicate value from data based

       Set<String> uniqueName = new HashSet<>();
        Set<String> duplicateNames = nameInRepo.stream()
        .filter(name -> !uniqueName.add(name))
        .collect(Collectors.toSet());

         method-2
        Map<String, Long> mapOfNames = nameInRepo.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

            Set<String> names = mapOfNames.entrySet()
            .stream()
            .filter(entry->entry.getValue()>1)
            .map(Map.Entry::getKey)
        .collect(Collectors.toSet());

        //method-3
        Set<String> names = nameInRepo.stream()
                .filter(name -> Collections.frequency(nameInRepo, name) > 1)
                .collect(Collectors.toSet());
        return new ResponseEntity<>(names, HttpStatus.OK);
         */

        //find all employees ages
       /*   List<Integer> ages = repo.findAll().stream().map(Employee::getAge).toList();

        //find the min , max, average, count sum using intSummarySatatices
        IntSummaryStatistics summary = ages.stream().mapToInt(x -> x).summaryStatistics();
        return new ResponseEntity<>(summary.getMax(), HttpStatus.OK);
        */
       /* //sort skip and limit ages
        List<Integer> ages = repo.findAll().stream().map(Employee::getAge).sorted().toList();
        List<Integer> sliceAge =  ages.stream().skip(1).limit(2).toList();*/


      /*  //find name in sorted list
        List<String> nameList = repo.findAll().stream().map(Employee::getName).toList();
        String names = nameList.stream().map(String::toUpperCase).collect(Collectors.joining(", "));*/

        // Map<Integer, List<Employee>> empMap = repo.findAll().stream().collect(Collectors.groupingBy(Employee::getAge));
        Map<Integer, Set<Employee>> empMap = repo.findAll().stream().collect(Collectors.groupingBy(Employee::getAge,TreeMap::new, Collectors.toSet()));
        return new ResponseEntity<>(empMap, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
        Employee employeeDate = employeeService.createEmployee(employee);
        return new ResponseEntity<>(employeeDate, HttpStatus.OK);
    }

    @GetMapping("/emp/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
        Optional<Employee> e = repo.findById(id);
        if (!e.isEmpty()) {
            // Optional<String> name = Optional.ofNullable(e.get().getName());
            // String name = Optional.ofNullable(e.get().getName()).orElse("Anonymous");
            // String name = Optional.ofNullable(e.get().getName()).orElse(callMe()); // decreases the performance
            //String name = Optional.ofNullable(e.get().getName()).orElseGet(()->callMe());
            // increases the performance
            String name = Optional.ofNullable(e.get().getName())
                    .orElseThrow(() -> new IllegalArgumentException("The id you have passed has no associated with name"));
            System.out.println("Name:: " + name);
            return new ResponseEntity<>(name, HttpStatus.OK);
        } else {
            return new ResponseEntity<>("Sorry Employee Id with give is is not present:: ", HttpStatus.NOT_FOUND);
        }
    }

    private String callMe() {
        System.out.println("I am called");
        return "Anonymous";
    }
}
