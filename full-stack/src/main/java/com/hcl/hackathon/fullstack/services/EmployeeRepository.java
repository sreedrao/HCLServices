/**
 * 
 */
package com.hcl.hackathon.fullstack.services;

/**
 * @author sdama
 *
 */

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hcl.hackathon.fullstack.models.Employee;

@Repository
//@CrossOrigin(origins = "http://localhost:4200")
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
