package Inheritance;

public class Person {
protected String name;
protected int age;
protected char gender;
public Person(String name, int age, char gender) {
	super();
	this.name = name;
	this.age = age;
	this.gender = gender;
}

public void display() {
	System.out.println("Display of person class");
}
public void fun1() {
	System.out.println("fun1 of Person class");
}

@Override
public String toString() {
	return "Person [name=" + name + ", age=" + age + ", gender=" + gender + "]";
}

}
