package com.q3;
import java.util.Scanner;
public class Demo {

	public Demo() {
		// TODO Auto-generated constructor stub
	}
	
	void showDetails(Month m) {
		
		switch(m) {
		case JAN:
			System.out.println("This is the 1st Month of the Year January");
			break;
		case FEB:
			System.out.println("This is the 2nd Month of the Year February");
			break;
		case MAR:
			System.out.println("This is the 1st Month of the Year March");
			break;
		case APR:
			System.out.println("This is the 1st Month of the Year April");
			break;
		case MAY:
			System.out.println("This is the 1st Month of the Year May");
			break;
		case JUN:
			System.out.println("This is the 1st Month of the Year June");
			break;
		case JUL:
			System.out.println("This is the 1st Month of the Year July");
			break;
		case AUG:
			System.out.println("This is the 1st Month of the Year August");
			break;
		case SEP:
			System.out.println("This is the 1st Month of the Year September");
			break;
		case OCT:
			System.out.println("This is the 1st Month of the Year October");
			break;
		case NOV:
			System.out.println("This is the 1st Month of the Year November");
			break;
		case DEC:
			System.out.println("This is the 1st Month of the Year December");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		System.out.println("Enter month:");
		Scanner sc = new Scanner(System.in);
		String month = sc.next();
		
		if(month.equals("JAN")) {
			Month m = Month.JAN;
			demo.showDetails(m);
		}else if(month.equals("FEB")) {
			Month m = Month.FEB;
			demo.showDetails(m);
		}else if(month.equals("MAR")) {
			Month m = Month.MAR;
			demo.showDetails(m);
		}else if(month.equals("APR")) {
			Month m = Month.APR;
			demo.showDetails(m);
		}else if(month.equals("MAYY")) {
			Month m = Month.MAY;
			demo.showDetails(m);
		}else if(month.equals("JUN")) {
			Month m = Month.JUN;
			demo.showDetails(m);
		}else if(month.equals("JUL")) {
			Month m = Month.JUL;
			demo.showDetails(m);
		}else if(month.equals("AUG")) {
			Month m = Month.AUG;
			demo.showDetails(m);
		}else if(month.equals("SEP")) {
			Month m = Month.SEP;
			demo.showDetails(m);
		}else if(month.equals("OCT")) {
			Month m = Month.OCT;
			demo.showDetails(m);
		}else if(month.equals("NOV")) {
			Month m = Month.NOV;
			demo.showDetails(m);
		}else if(month.equals("DEC")) {
			Month m = Month.DEC;
			demo.showDetails(m);
		}else {
			System.out.println("Invalid Month Name");
		}
		
		sc.close();
	}

}
