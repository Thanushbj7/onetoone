package com.studentapp.service;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.studentapp.model.Student;

public interface IStudentService {
void addStudent(Student student);
void updateStudent(Student student);
void deleteStudent(int studentId);
Student getById(int StudentId);
List<Student> getAll();

List<Student> getByDepartment(String department);
List<Student> getByCity(String city);
List<Student> getByCityAndDepartment(String city,String department);
List<Student> getByCityState(String city,String state);

}
