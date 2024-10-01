package EmailValidation;

import java.util.Scanner;

public class EmailValidation {

	public  void CheckEmail(String email) {
		
		int a=email.indexOf("@");		//rerturn position of @
		int d=email.lastIndexOf(".");	//if @ not present will return-1
		System.out.println(a);
		System.out.println(d);
		if(a>-1 && d>-1 && a<d) {
			System.out.println("valid email");
		}
			else
				System.out.println("invalid email...");
		}
		
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			EmailValidation emailValidations= new EmailValidation();
			System.out.println("Enter Email ID");
			String email = sc.next();
			emailValidations.CheckEmail(email);
	}

}
