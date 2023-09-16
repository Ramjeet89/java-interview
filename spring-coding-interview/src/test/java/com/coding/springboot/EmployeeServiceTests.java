package com.coding.springboot;

import com.coding.springboot.model.Employee;
import com.coding.springboot.repository.EmployeeRepository;
import com.coding.springboot.service.impl.EmployeeServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
public class EmployeeServiceTests {

    @Mock
    private EmployeeRepository employeeRepository;

    @InjectMocks
    private EmployeeServiceImpl employeeService;

    private Employee employee;

    @BeforeEach
    public void setUp() {
        employee = Employee.builder()
                .id(1L)
                .firstName("Ramjeet")
                .lastName("Mahto")
                .email("ramjeet.mahto@gmail.com")
                .age(30)
                .build();
    }

    // JUnit test for saveEmployee method
    @DisplayName("JUnit test for saveEmployee method")
    @Test
    public void givenEmployeeObject_whenSaveEmployee_thenReturnEmployeeObject() {
        // given - precondition or setup
        Mockito.when(employeeRepository.findByEmail(employee.getEmail())).thenReturn(Optional.empty());
        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
        System.out.println(employeeService);
        System.out.println(employeeRepository);
        // when -  action or the behaviour that we are going test
        Employee savedEmployee = employeeService.saveEmployee(employee);
        System.out.println(savedEmployee);
        // then - verify the output
        Assertions.assertThat(savedEmployee).isNotNull();
    }

    @DisplayName("JUnit test for getAllEmployees method")
    @Test
    public void givenEmployeesList_whenGetAllEmployees_thenReturnEmployeesList() {
        // given - precondition or setup
        Employee employee1 = Employee.builder()
                .id(2L)
                .firstName("Tony")
                .lastName("Stark")
                .email("tony@gmail.com")
                .build();
        Mockito.when(employeeRepository.findAll()).thenReturn(List.of(employee, employee1));
        List<Employee> employeeList = employeeService.getAllEmployees();
        //then verify the output
        Assertions.assertThat(employeeList).isNotNull();
        Assertions.assertThat(employeeList.size()).isEqualTo(2);
    }

    @DisplayName("JUnit test for getEmployeeById method")
    @Test
    public void givenEmployeeId_whenGetEmployeeById_thenReturnEmployeeObject() {
        //given
        Mockito.when(employeeRepository.findById(1L)).thenReturn(Optional.of(employee));
        //when
        Employee savedEmployee = employeeService.getEmployeeById(employee.getId()).get();
        //then
        Assertions.assertThat(savedEmployee).isNotNull();
    }

    @DisplayName("JUnit test for updateEmployee method")
    @Test
    public void givenEmployeeObject_whenUpdateEmployee_thenReturnUpdatedEmployee() {

        // given - precondition or setup
        Mockito.when(employeeRepository.save(employee)).thenReturn(employee);
        employee.setEmail("ram@g.com");
        employee.setFirstName("Ram");

        // when -  action or the behaviour that we are going test
        Employee updatedEmployee = employeeService.updateEmployee(employee);

        // then - verify the output
        Assertions.assertThat(updatedEmployee.getEmail()).isEqualTo("ram@g.com");
        Assertions.assertThat(updatedEmployee.getFirstName()).isEqualTo("Ram");
    }

    @DisplayName("JUnit test for deleteEmployee method")
    @Test
    public void givenEmployeeId_whenDeleteEmployee_thenNothing() {
        // given - precondition or setup
        long employeeId = 1L;

        Mockito.doNothing().when(employeeRepository).deleteById(employeeId);

        // when -  action or the behaviour that we are going test
        employeeService.deleteEmployee(employeeId);

        // then - verify the output
        verify(employeeRepository, times(1)).deleteById(employeeId);
    }
}
