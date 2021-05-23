package com.cg.eis.exception;



public class EmployeeException {
		public void validateSalary(double salary) throws SalaryException{
			if(salary > 3000) {
				System.out.println("Valid salary");
			}else {
				throw new SalaryException("Salary Exception Occured");
			}
		}
	}


