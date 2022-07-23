package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApiTutorialApplication {
	
	static List<Employee> employees=new ArrayList<>();
	static {
		employees.add(new Employee("Raja", "Nayapamu",10000.0,List.of("Project1","project2") ));
		employees.add(new Employee("Sukumar", "Nayapamu",30000.0,List.of("Project4","project2") ));
		employees.add(new Employee("Rani", "Katta",20000.0,List.of("Project1","project2") ));
		employees.add(new Employee("Roja", "Jonnala",7000.0,List.of("Project11","project12") ));
	}

	public static void main(String[] args) {
		SpringApplication.run(StreamApiTutorialApplication.class, args);
		System.out.println("Entered by rajesh");
		System.out.println("Git Demo Purpose");
		//foreach use case
		employees.stream().forEach(employee->System.out.println(employee));
		
		//using map() to increase the salary for each employee
		List<Employee> increasedSalary = employees.stream().map(employee-> new Employee(employee.getFirstName(),
				employee.getLastName(),
				employee.getSalary() * 1.10,
				employee.getProjects())).collect(Collectors.toList());
		
		System.out.println(increasedSalary);
		
		//write program whose salary is greater than 10000 then increase that salary only
		List<Employee> filterEmployee = employees.stream()
		.filter(employee->employee.getSalary() >10000).map(employee-> new Employee(employee.getFirstName(),
				employee.getLastName(),
				employee.getSalary() * 1.10,
				employee.getProjects())).collect(Collectors.toList());
		
		System.out.println("Filter Employeee::"+filterEmployee);
		//findFirst Logic
		Optional<Employee> findFirst = employees.stream()
		.filter(employee->employee.getSalary() >10000).map(employee-> new Employee(employee.getFirstName(),
				employee.getLastName(),
				employee.getSalary() * 1.10,
				employee.getProjects())).findFirst();
		System.out.println("FindFirst::"+findFirst);
	}

}
