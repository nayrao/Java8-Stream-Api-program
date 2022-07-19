package com.example;

import java.util.ArrayList;
import java.util.List;

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
		//SpringApplication.run(StreamApiTutorialApplication.class, args);
		
		//foreach use case
		employees.stream().forEach(employee->System.out.println(employee));
	}

}
