package com.luv2code.cruddemo;

import com.luv2code.cruddemo.entity.Employee;
import com.luv2code.cruddemo.service.EmployeeServiceImpl;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CruddemoApplicationTests {

	@Mock
	private EmployeeServiceImpl employeeService;

	@Test
	void contextLoads() {
	}

	@Test
	void shouldCreateEmployee() {
		Employee employee = new Employee();
		employeeService.save(employee);
		employeeService.deleteById(employee.getId());
	}

}
