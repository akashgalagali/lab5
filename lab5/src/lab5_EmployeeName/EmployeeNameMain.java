package lab5_EmployeeName;
import java.util.*;

import lab5.AgeException;
public class EmployeeNameMain {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Name:");
		String FirstName=sc.nextLine();
		System.out.println("Enter Last Name:");
		String LastName=sc.nextLine();
		EmployeeNameMain name=new EmployeeNameMain();
		boolean sta=false;
		try {
			sta=name.checkName(FirstName,LastName);	
	} catch (Exception e) {
		System.out.println(e);
	}

	}
 public boolean checkName(String FirstName,String LastName)throws EmployeeNameException {
	 boolean status = false;
		
		if(FirstName.isBlank() || LastName.isBlank())
		{
			status = false;
			throw new EmployeeNameException(FirstName,LastName);
		}
		else
		{
			status = true;
			System.out.println("Name Verified");
		}
		
		return status;
 }
}
