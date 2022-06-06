package com.q1;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the number of elements in the array");
			
			int totalElements = sc.nextInt();
			
			int[] arr = new int[totalElements];
			
			System.out.println("Enter the elements in the array");
			
			for(int i=0; i<arr.length;i++) {
				System.out.println(i+" th element :");
				arr[i]= sc.nextInt();
			}
			
			System.out.println("Enter the index of the array element you want to access");
			String index = sc.next();
			
			int i = Integer.parseInt(index);
			
			System.out.println("The array element at index "+index+ ":"+arr[i]);
			System.out.println("The array element successfully accessed");
			
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}catch(NumberFormatException e) {
			System.out.println(e);
		}
		
	}

}
