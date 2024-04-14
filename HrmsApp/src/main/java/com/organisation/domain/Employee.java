package com.organisation.domain;

import java.util.List;

public class Employee {
	
	private long employeeId;
	private String employeeName;
	private String companyName;
	private String managerName;
	
	public List<EmployeeDetails> getEmployeeDetailsList() {
		return employeeDetailsList;
	}
	public void setEmployeeDetailsList(List<EmployeeDetails> employeeDetailsList) {
		this.employeeDetailsList = employeeDetailsList;
	}
	private List<EmployeeDetails> employeeDetailsList;

	public long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

}
