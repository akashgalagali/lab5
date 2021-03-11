package lab5_EmployeeName;

public class EmployeeNameException extends Exception {
String firstName;
String lastName;
public EmployeeNameException(String firstName, String lastName) {
	this.firstName = firstName;
	this.lastName = lastName;
}
@Override
public String toString() {
	return "EmployeeNameException :-"+"[firstName=" + firstName + ", lastName=" + lastName + "]";
}

}
