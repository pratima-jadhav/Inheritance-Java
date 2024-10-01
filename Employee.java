package Inheritance;

public class Employee extends Student {
private int empNo;
private String name;
private int Sal;



public Employee(String name, int age, char gender, int rollNo, String stream, double score, int empNo, String name2,
		int sal) {
	super(name, age, gender, rollNo, stream, score);
	this.empNo = empNo;
	this.name = name;
	this.Sal = Sal;
}



@Override
public String toString() {
	return "Employee [empNo=" + empNo + ", name=" + name + ", Sal=" + Sal + ", rollNo=" + rollNo + ", stream=" + stream
			+ ", score=" + score + ", age=" + age + ", gender=" + gender + "]";
}



}
