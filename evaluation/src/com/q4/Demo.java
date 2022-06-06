package com.q4;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter username :" );
		String username = sc.next();
		
		System.out.println("Enter password :");
		String password = sc.next();
		
		System.out.println("Enter mobile :");
		String mobile = sc.next();
		
		System.out.println("Enter email :");
		String  email = sc.next();
		
		boolean nameValid = Pattern.matches("[a-zA-Z]{3,8}", username) ;
		boolean passValid = Pattern.matches("[a-zA-Z0-9]{3,8}", password);
		boolean mobileValid = Pattern.matches("[6789][0-9]{9}", mobile);
		boolean emailValid = Pattern.matches("[a-zA-Z0-9]", email);
		
		if(nameValid ==true && passValid==true && mobileValid==true) {
			Customer c1 = new Customer(username,password,mobile,email);
			System.out.println("Username :"+ c1.getUsername());
			System.out.println("Password :"+ c1.getPassword());
			System.out.println("Mobile :"+ c1.getMobileNumber());
			System.out.println("Email :"+ c1.getEmail());
		}else {
			System.out.println("Invalid details");
		}
		
	}

}
