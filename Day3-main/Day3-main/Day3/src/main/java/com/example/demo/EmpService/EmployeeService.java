
package com.example.demo.EmpService;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmpRepo;



@Service
public class EmployeeService {

@Autowired
private EmpRepo repo;

// addStudent
public Employee addStudent(Employee obj) {
return repo.save(obj);
}

// getStudent
public List<Employee> getStudent() {
List<Employee> arr = new ArrayList<>();
arr = repo.findAll();
return arr;
}

//deleteById  
public void deleteById(Long id) {
repo.deleteById(id);
}

////getById
//public List<Student> findById(Long id) {
//List<Student> stud = repo.findById(id);
//return stud;
//}

}
