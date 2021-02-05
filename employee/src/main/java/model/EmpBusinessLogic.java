package model;

public class EmpBusinessLogic {

	public double calculateAppraisal(Employee employee) {
		return employee.getMonthlySalary() < 10000 ? 500 : 1000;
		
	}
 
	public double calculateYearlySalary(Employee employee) {
		return employee.getMonthlySalary() * 12.0;
	}

	public boolean isRetirementAge(Employee employee) {
		return employee.getAge() > 65;
	}


}

