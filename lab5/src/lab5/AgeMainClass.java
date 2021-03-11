package lab5;
import java.util.*;

public class AgeMainClass {

	public static void main(String[] args) {
		System.out.println("Enter the Age");
		Scanner sc=new Scanner(System.in);
		int age =sc.nextInt();
		AgeMainClass ag=new AgeMainClass();
		boolean sta=false;
		try {
			sta=ag.AgeCheck(age);	
	} catch (Exception e) {
		System.out.println(e);
	}
		
		
	}
	public boolean AgeCheck(int age )throws AgeException
	{

		boolean status = false;
		
		if(age<15)
		{
			status = false;
			throw new AgeException(age);
		}
		else
		{
			status = true;
			System.out.println("Age Verified");
		}
		
		return status;
		
		
	}
}
