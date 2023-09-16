/*
package com.coding.interview;

import com.coding.interview.model.Employee;
import com.coding.interview.repository.EmployeeRepository;
import com.coding.interview.service.impl.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Optional;
import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.mockito.Mockito.when;

@SpringBootTest
class SpringCodingInterviewApplicationTests {

	@InjectMocks
	private EmployeeServiceImpl employeeService;

	@Mock
	private EmployeeRepository employeeRepository;

	@Test
	public void getEmpByIdTest() {
		when(employeeRepository.getById(1L)).thenReturn(createEmployeeStub());
		Employee emp = employeeService.getEmpById(1L);
		assertEquals(emp.getName(),"decode");

	}

	private Optional<Employee> createEmployeeStub() {
		Employee emp = new Employee();
		emp.setId(1L);
		emp.setName("decode");
		emp.setAge(23);
		return Optional.of(emp);
	}

}
*/
