package lab5;

public class AgeException extends Exception {
int age;
public AgeException(int age) {
	this.age=age;
}
public String toString() {
	return "AgeException :-"+"The Age should be greater then 15 but your age is "+age;
}
}
