package com.studentapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.studentapp.model.Address;
import com.studentapp.model.Student;
import com.studentapp.service.IStudentService;

@SpringBootApplication
public class SpringDatajpaOnetooneApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(SpringDatajpaOnetooneApplication.class, args);
	}
	@Autowired
	IStudentService studentService;
	@Override
	public void run(String... args) throws Exception {
		Address address=new Address("Banglore","KAR");
		Student student=new Student("Jo","CSE",address);
//		studentService.addStudent(student);
//		studentService.getByCityAndDepartment("Banglore","CSE").forEach(System.out::println);
//		studentService.getByDepartment("CSE").forEach(System.out::println);
//		studentService.getByCity("Banglore").forEach(System.out::println);
		studentService.getByCity("Banglore").forEach(System.out::println);
		studentService.getByCityAndDepartment("Banglore", "CSE").forEach(System.out::println);
		studentService.getByDepartment("CSE").forEach(System.out::println);
		studentService.getByCityState("Banglore","KAR").forEach(System.out::println);
		
	}
	

}
