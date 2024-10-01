package Inheritance;

public class TestPerson {

	public static void main(String[] args) {
	 Person person =new Person("Pratima", 22, 'F');
	 System.out.println(person);  // will call toString()method	 
	 person.display();
	 person.fun1();
	 
	System.out.println("=========");
	 Student student= new Student("Pratima",22,'F',22,"Comp",89);
	 System.out.println(student);
	 student.display();
	 
	 Employee employee= new Employee("Priya",11,'F',12, "civil",65,78,"tcs",50000);
	 System.out.println(employee);
	employee.display();
	
	System.out.println("=========");
	Person person2=new Person("Shweta", 23,'F'); //parent class
	person2=new Student("Shweta",23,'F',33,"IT",99);
	System.out.println(person2);
	
	person2=new Employee("Sayli", 23, 'F',2, "comp", 89, 5, "Accenture", 700000);
	person.display();
	}

}
