package test;

import java.util.Scanner;

public class EvenNumberChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner  = new Scanner(System.in);
		System.out.println("Please enter an integer");
	    //System.out.println("");
		int num = scanner.nextInt();
		int num2 = num%2;
		
		if(num2 == 0) {
			System.out.println(" The number is an even number");
		}else 
			System.out.println("The number is an odd number");

	}

}
