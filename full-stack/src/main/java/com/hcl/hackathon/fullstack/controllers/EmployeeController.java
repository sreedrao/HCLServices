/**
 * 
 */
package com.hcl.hackathon.fullstack.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;

import com.hcl.hackathon.fullstack.models.Employee;
import com.hcl.hackathon.fullstack.services.EmployeeRepository;
/**
 * @author sdama
 *
 */

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@GetMapping("api/v1/emplist")
	public Collection<Employee> getAllEmployees() {		
		return this.employeeRepository.findAll();		
	}
	//@CrossOrigin(origins = "http://localhost:4200")
	@PostMapping(value = "/api/v1/employee/{mappings}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee) {
	 Employee emp = new Employee();
	 emp.setAge(employee.getAge());
	 emp.setEmpName(employee.getEmpName());
	 emp.setAddress(employee.getAddress());
	 employee = this.employeeRepository.save(emp);
	 return ResponseEntity.ok().body(employee);
	 
	}
	
	/*@CrossOrigin(origins = "http://localhost:4200")
	@DeleteMapping(value = "/api/v1/employee/{empId}")
	public void deleteEmployee(@PathVariable Long empId) {
		this.employeeRepository.deleteById(empId);		
	}
	@CrossOrigin(origins = "http://localhost:4200")
	@GetMapping("/api/v1/employee/{empId}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable Long empId) {
		Optional<Employee> employee = this.employeeRepository.findById(empId);
		return ResponseEntity.ok().body(employee.get());
	}*/
}
