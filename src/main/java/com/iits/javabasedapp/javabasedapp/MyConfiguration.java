package com.iits.javabasedapp.javabasedapp;
import java.util.Arrays;
import java.util.List;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import skill.myapp.Address;
import skill.myapp.Employee;
 
@Configuration
public class MyConfiguration {
	
	@Bean
	public Address getAddress() {
		Address address =new Address();
		address.setStreet("ABC");
		address.setCity("HYD");
		address.setState("TS");
		return address;
	}
	
	
	@Bean(name = "emp")
	public Employee getEmlpoyee() {
		List<String> mno=Arrays.asList("8877445566","8855221144","7788996655");
		Employee emp=new Employee();
		emp.setId(1001);
		emp.setName("SRK");
		emp.setSalary(30000.00);
		emp.setMno(mno);
		emp.setAddress(getAddress());
		return emp;
		
	}
}
