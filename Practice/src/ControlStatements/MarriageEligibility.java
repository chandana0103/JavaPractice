package ControlStatements;
//If person age less than 30 and salary greater than 1 lakh then eligible for marriage

import java.util.Scanner;

public class MarriageEligibility {

	public static void main(String[] args) {
		
		System.out.println("enter age: ");
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		System.out.println("enter salary: ");
		int salary=sc.nextInt();
		
		//int age=23;
		//int salary=150000;
		if(age<30 && salary>100000) {
			System.out.println("He is eligible for marriage");
		}
		else {
			System.out.println("He is not eligible for marriage");

		}
	}

}
