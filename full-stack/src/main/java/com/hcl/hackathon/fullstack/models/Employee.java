/**
 * 
 */
package com.hcl.hackathon.fullstack.models;

import javax.persistence.*;

/**
 * @author sdama
 * 
 * */

@Entity
@Table(name = "employee")
public class Employee { 
	
    @Id
    @GeneratedValue(generator = "employee_generator")
    @SequenceGenerator(
            name = "employee_generator",
            sequenceName = "employee_sequence",
            initialValue = 1000
    )
    
    @PrimaryKeyJoinColumn
    private Long employeeId;
    
    @Column(name = "employee_name")
    private String empName;

    @Column(name = "age")
    private Integer age;
    
    @Column(name = "address")
    private String address;

	/**
	 * @return the employeeId
	 */
	public Long getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * @return the age
	 */
	public Integer getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Integer age) {
		this.age = age;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
    
    
}