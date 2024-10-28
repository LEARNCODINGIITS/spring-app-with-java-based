package skill.myapp;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class Employee {
	private int id;
	private String name;
	private double salary;
	private Address address;// Has-A relationship
	List<String> mno;

	public Employee() {
		super();
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public void setMno(List<String> mno) {
		this.mno = mno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", address=" + address + ", mno=" + mno
				+ "]";
	}

}
