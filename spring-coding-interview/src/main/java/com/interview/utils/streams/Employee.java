package com.interview.utils.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private int age;
    private Gender gender;
    private String department;
    private int yearOfJoining;
    private double salary;
    private List<String> phones;

    public Employee() {

    }

    public Employee(int id, String firstName, String lastName, String email, int age, Gender gender, String department, int yearOfJoining, double salary, List<String> phones) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.department = department;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
        this.phones = phones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void setPhones(List<String> phones) {
        this.phones = phones;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", department='" + department + '\'' +
                ", yearOfJoining=" + yearOfJoining +
                ", salary=" + salary +
                ", phones=" + phones +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> listOfEmployee = List.of(
                new Employee(111, "Jiya ", "Brein", "jiya.brein@gmail.com", 32, Gender.FEMALE, "HR", 2011, 25000.0, List.of("9798463412", "9108815727")),
                new Employee(122, "Paul", " Niksui", "paul.niksui@yahoo.com", 25, Gender.MALE, "Sales And Marketing", 2015, 13500.0, List.of("9798463412", "9108815727")),
                new Employee(133, "Martin", " Theron", "martin.theron@gmail.com", 29, Gender.MALE, "Infrastructure", 2012, 18000.0, List.of("9798463412", "9108815727")),
                new Employee(144, "Murali", "Gowda", "murali.gowda@hotmail.com", 28, Gender.MALE, "Product Development", 2014, 32500.0, List.of("9798463412", "9108815727")),
                new Employee(155, "Nima", " Roy", "nima.roy@gmail.com", 27, Gender.FEMALE, "HR", 2013, 22700.0, List.of("9798463412", "9108815727")),
                new Employee(166, "Iqbal", " Hussain", "iqbal.hussain@gmail.com", 43, Gender.MALE, "Security And Transport", 2016, 10500.0, List.of("9798463412", "9108815727")),
                new Employee(177, "Manu", " Sharma", "manu.sharma@gmail.com", 35, Gender.MALE, "Account And Finance", 2010, 27000.0, List.of("9798463412", "9108815727")),
                new Employee(188, "Wang", "Liu", "wang.lui@gmail.com", 31, Gender.MALE, "Product Development", 2015, 34500.0, List.of("9798463412", "9108815727")),
                new Employee(199, "Amelia", "Zoe", "amelia.zoe@gmail.com", 24, Gender.FEMALE, "Sales And Marketing", 2016, 11500.0, List.of("9798463412", "9108815727")),
                new Employee(200, "Jaden", "Dough", "jaden.dough@yahoo.com", 38, Gender.MALE, "Security And Transport", 2015, 11000.5, List.of("9798463412", "9108815727")),
                new Employee(211, "Jasna", "Kaur", "jasna.kaur@gmail.com", 27, Gender.FEMALE, "Infrastructure", 2014, 15700.0, List.of("9798463412", "9108815727")),
                new Employee(222, "Nitin", " Joshi", "nitin.joshi@gmail.com", 25, Gender.MALE, "Product Development", 2016, 28200.0, List.of("9798463412", "9108815727")),
                new Employee(233, "Jyothi", "Reddy", "jyothi.reddy@gmail.com", 27, Gender.MALE, "Account And Finance", 2013, 21300.0, List.of("9798463412", "9108815727")),
                new Employee(244, "Nicolus", "Den", "nicolus.den@yahoo.com", 24, Gender.MALE, "Sales And Marketing", 2017, 10700.5, List.of("9798463412", "9108815727")),
                new Employee(255, "Ali", "Baig", "ali.baig@gamil.com", 23, Gender.MALE, "Infrastructure", 2018, 12700.0, List.of("9798463412", "9108815727")),
                new Employee(266, "Sanvi", "Pandey", "sanvi.pandey@yahoo.com", 26, Gender.FEMALE, "Product Development", 2015, 28900.0, List.of("9798463412", "9108815727")),
                new Employee(277, "Anuj", "Chettiar", "anuj.chetterjee.hotmail.com", 31, Gender.MALE, "Product Development", 2012, 35700.0, List.of("9798463412", "9108815727"))
        );
        getCountOfMaleFemale(listOfEmployee);
        getDepartmentName(listOfEmployee);
        findGender(listOfEmployee);
        getNameOfEmp(listOfEmployee);
        countByDept(listOfEmployee);
        avgSalary(listOfEmployee);
        oldestEmp(listOfEmployee);

        getEmpSalary(listOfEmployee);
        listDownDept(listOfEmployee);
        seniorEmp(listOfEmployee);
        thirdHighestSalaryWithHighestAge(listOfEmployee);
        sortByName(listOfEmployee);
        increment10percentSalary(listOfEmployee);
        increment10percentSalaryUsingSet(listOfEmployee);
        greaterThen35000After10PercentIncrement(listOfEmployee);
        findFirstEmployeeGreaterThen35000After10PercentIncrement(listOfEmployee);
        flatMapEmployee(listOfEmployee);
        sortCircuitData(listOfEmployee);
        sortingByEmployeeFirstName(listOfEmployee);
        sortingByEmployeeFirstNameAndLastName(listOfEmployee);
        reduceEmployeeSalary(listOfEmployee);
        maxSalaryOfEmployee(listOfEmployee);
        countEmployee(listOfEmployee);
        sortEmployeeBasedOnGender(listOfEmployee);
        sortByAge(listOfEmployee);
    }

    private static void sortByAge(List<Employee> listOfEmployee) {
        List<Employee> sortByAge = listOfEmployee.stream().sorted(Comparator.comparing(Employee::getAge)).toList();
        sortByAge.forEach(System.out::println);
    }

    private static void sortEmployeeBasedOnGender(List<Employee> listOfEmployee) {
        List<Employee> sortedByGender = listOfEmployee.stream()
                .filter(employee -> employee.getGender() == Gender.MALE)
                .sorted(Comparator.comparing(Employee::getFirstName))
                .toList();
        sortedByGender.forEach(System.out::println);
    }

    private static void countEmployee(List<Employee> listOfEmployee) {
        long count = listOfEmployee.stream().count();
        IntSummaryStatistics summary = listOfEmployee.stream()
                .mapToInt(Employee::getId)
                .summaryStatistics();
        System.out.println("Count:: " + count);
        System.out.println(summary.getCount());
    }

    private static void maxSalaryOfEmployee(List<Employee> listOfEmployee) {
        Employee maxSalary = listOfEmployee.stream()
                .max(Comparator.comparing(Employee::getSalary))
                .orElseThrow(NoClassDefFoundError::new);
        System.out.println("Max Salary:: " + maxSalary);
    }

    private static void reduceEmployeeSalary(List<Employee> listOfEmployee) {
        Double totalSalary = listOfEmployee.stream()
                .map(Employee::getSalary)
                .reduce(0.0, Double::sum);
        System.out.println("Total Salary: " + totalSalary);
    }

    private static void sortingByEmployeeFirstNameAndLastName(List<Employee> listOfEmployee) {
        List<Employee> sortByFirstNameAndLastName = listOfEmployee.stream()
                .sorted(Comparator.comparing(Employee::getFirstName)
                        .thenComparing(Employee::getLastName))
                .toList();
        System.out.println("Sort By Employee FirstName and LastName: " + sortByFirstNameAndLastName);
    }

    private static void sortingByEmployeeFirstName(List<Employee> listOfEmployee) {
        List<Employee> sortByEmployeeFirstName = listOfEmployee
                .stream()
                .sorted(Comparator.comparing(Employee::getFirstName))
                .toList();
        System.out.println(sortByEmployeeFirstName);
    }

    //sort circuit operations
    private static void sortCircuitData(List<Employee> listOfEmployee) {
        List<Employee> sortCircuitData = listOfEmployee
                .stream()
                .skip(1)
                .limit(1)
                .collect(Collectors.toList());
        System.out.println(sortCircuitData);
    }

    private static void flatMapEmployee(List<Employee> listOfEmployee) {
        String phones = listOfEmployee.stream()
                .map(Employee::getPhones)
                .flatMap(strings -> strings.stream()).collect(Collectors.joining(","));
        System.out.println(phones);
    }

    private static void findFirstEmployeeGreaterThen35000After10PercentIncrement(List<Employee> listOfEmployee) {
        Employee greaterThen35000 = listOfEmployee.stream()
                .filter(emp -> emp.getSalary() > 35000)
                .map(emp -> new Employee(
                        emp.getId(),
                        emp.getFirstName(),
                        emp.getLastName(),
                        emp.getEmail(),
                        emp.getAge(),
                        emp.getGender(),
                        emp.getDepartment(),
                        emp.getYearOfJoining(),
                        emp.getSalary() * 1.10,
                        emp.getPhones()))
                .findFirst()
                .orElse(null);
        System.out.println("First Employee Greater Then 35000 After 10 % Increment: " + greaterThen35000);
    }

    private static void greaterThen35000After10PercentIncrement(List<Employee> listOfEmployee) {
        List<Employee> greaterThen35000 = listOfEmployee.stream()
                .filter(emp -> emp.getSalary() > 35000)
                .map(emp -> new Employee(
                                emp.getId(),
                                emp.getFirstName(),
                                emp.getLastName(),
                                emp.getEmail(),
                                emp.getAge(),
                                emp.getGender(),
                                emp.getDepartment(),
                                emp.getYearOfJoining(),
                                emp.getSalary() * 1.10,
                                emp.getPhones()
                        )
                ).toList();
        System.out.println("Greater Then 20000 After 10 % Increment: " + greaterThen35000);
    }

    private static void increment10percentSalaryUsingSet(List<Employee> listOfEmployee) {
        Set<Employee> employees = listOfEmployee.stream()
                .map(emp -> new Employee(
                                emp.getId(),
                                emp.getFirstName(),
                                emp.getLastName(),
                                emp.getEmail(),
                                emp.getAge(),
                                emp.getGender(),
                                emp.getDepartment(),
                                emp.getYearOfJoining(),
                                emp.getSalary() * 1.10,
                                emp.getPhones()
                        )
                ).collect(Collectors.toSet());
        System.out.println("After increment of 10% Using Set:  " + employees);
    }

    private static void increment10percentSalary(List<Employee> listOfEmployee) {
        List<Employee> employees = listOfEmployee.stream().map(emp -> new Employee(
                        emp.getId(),
                        emp.getFirstName(),
                        emp.getLastName(),
                        emp.getEmail(),
                        emp.getAge(),
                        emp.getGender(),
                        emp.getDepartment(),
                        emp.getYearOfJoining(),
                        emp.getSalary() * 1.10,
                        emp.getPhones()
                )
        ).toList();
        System.out.println("After Increment 10%:  " + employees);
    }

    private static void sortByName(List<Employee> listOfEmployee) {
        List<Employee> sortByName = listOfEmployee.stream().sorted(Comparator.comparing(Employee::getFirstName)).toList();
        sortByName.forEach(System.out::println);
    }

    //find the third-highest salary with the highest age in the organization
    private static void thirdHighestSalaryWithHighestAge(List<Employee> listOfEmployee) {
        Optional<Employee> thirdHighestSalaryWithHighestAge = listOfEmployee.stream()
                .sorted(Comparator.comparingDouble(Employee::getSalary).reversed()
                        .thenComparing(Employee::getAge).reversed()).skip(2).findFirst();
        if (thirdHighestSalaryWithHighestAge.isPresent()) {
            Employee employee = thirdHighestSalaryWithHighestAge.get();
            System.out.println("Name: " + employee.getFirstName() + "" + employee.getLastName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Salary: " + employee.getSalary());
        } else {
            System.out.println("No employee found.");
        }
    }

    //Find out the height of experienced employees in the organization
    private static void seniorEmp(List<Employee> listOfEmployee) {
        Optional<Employee> seniorEmp = listOfEmployee.stream()
                .sorted(Comparator.comparingInt(Employee::getYearOfJoining))
                .findFirst();
        Employee seniorMostEmployee = seniorEmp.get();
        System.out.println("Senior Most Employee Details :");
        System.out.println("----------------------------");
        System.out.println("ID : " + seniorMostEmployee.getId());
        System.out.println("Name : " + seniorMostEmployee.getFirstName() + "" + seniorMostEmployee.getLastName());
        System.out.println("Age : " + seniorMostEmployee.getAge());
    }

    //Find out the average and total salary of the organization.
    private static void listDownDept(List<Employee> listOfEmployee) {
        Map<String, List<Employee>> empList = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment));
        Set<Map.Entry<String, List<Employee>>> entrySet = empList.entrySet();
        for (Map.Entry<String, List<Employee>> entry : entrySet) {
            System.out.println("--------------------------------------");
            System.out.println("Employees In " + entry.getKey() + " : ");
            System.out.println("--------------------------------------");
            List<Employee> list = entry.getValue();
            for (Employee e : list) {
                System.out.println(e.getFirstName() + "" + e.getLastName());
            }
        }
    }

    //List down the employees of each department.
    private static void getEmpSalary(List<Employee> listOfEmployee) {
        DoubleSummaryStatistics empSalary = listOfEmployee.stream()
                .collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("Average Salary = " + empSalary.getAverage());
        System.out.println("Total Salary = " + empSalary.getSum());
    }

    //Find out the oldest employee, his/her age and department?
    private static void oldestEmp(List<Employee> listOfEmployee) {
        Optional<Employee> oldestEmp = listOfEmployee.stream().max(Comparator.comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmp.get();
        System.out.println("Name : " + oldestEmployee.getFirstName() + "" + oldestEmployee.getLastName());
        System.out.println("Age : " + oldestEmployee.getAge());
        System.out.println("Department : " + oldestEmployee.getDepartment());
    }

    //Find out the average salary of each department.
    private static void avgSalary(List<Employee> listOfEmployee) {
        Map<String, Double> avgSalary = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));
        avgSalary.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    // Count the number of employees in each department.
    private static void countByDept(List<Employee> listOfEmployee) {
        Map<String, Long> countByDept = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.counting()));
        countByDept.forEach((ch, count) -> System.out.println(ch + ":" + count));

       /* System.out.println("++++++++++++++++++++++");
        Set<Map.Entry<String, Long>> entrySet = countByDept.entrySet();
        for (Map.Entry<String, Long> entry : entrySet) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }*/
    }

    //Get the Names of employees who joined after 2015.
    private static void getNameOfEmp(List<Employee> listOfEmployee) {
        listOfEmployee.stream().filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getFirstName)
                .forEach(System.out::println);
    }

    //Find the average age of Male and Female Employees.
    private static void findGender(List<Employee> listOfEmployee) {
        Map<Gender, Double> avgAge = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingInt(Employee::getAge)));
        System.out.println(avgAge);
    }

    //Write a program to print the names of all departments in the organization
    private static void getDepartmentName(List<Employee> listOfEmployee) {
        listOfEmployee.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    //Find out the count of male and female employees present in the organization?
    private static void getCountOfMaleFemale(List<Employee> listOfEmployee) {
        Map<Gender, Long> noOfMaleAndFemaleEmployees = listOfEmployee.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
    }


}
