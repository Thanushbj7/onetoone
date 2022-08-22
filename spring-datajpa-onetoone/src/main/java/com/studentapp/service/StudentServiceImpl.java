package com.studentapp.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;
import com.studentapp.repositary.IStudentRepositary;
@Service
public class StudentServiceImpl implements IStudentService {
	@Autowired
	IStudentRepositary studentRepositary;

	@Override
	public void addStudent(Student student) {
		studentRepositary.save(student);
		
	}

	@Override
	public void updateStudent(Student student) {
		studentRepositary.save(student);
		
	}

	@Override
	public void deleteStudent(int studentId) {
		studentRepositary.deleteById(studentId);
		
	}

	@Override
	public Student getById(int StudentId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getByDepartment(String department) {
		// TODO Auto-generated method stub
		return studentRepositary.findStudentByDepartment(department);
	}

	@Override
	public List<Student> getByCity(String city) {
		// TODO Auto-generated method stub
		return studentRepositary.findStudentByCity(city);
	}

	@Override
	public List<Student> getByCityAndDepartment(String city, String department) {
		// TODO Auto-generated method stub
		return studentRepositary.findByCityDept(city, department);
	}

	@Override
	public List<Student> getByCityState(String city, String state) {
		// TODO Auto-generated method stub
		return studentRepositary.findByCityState(city, state);
	}



	
	
}
