package com.cg.eis.exception;

public class EmployeeException extends Exception{
int salary;

public EmployeeException(int salary) {
	this.salary = salary;
};
public String toString() {
	return "EmployeeSalaryException :-"+"Employee's salary is  "+salary+" it is less then 3000";
}


}
