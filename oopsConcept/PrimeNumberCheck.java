package oopsConcept;

import java.util.Scanner;

public class PrimeNumberCheck {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println(" Enter an Integer ");
		Integer num = scanner.nextInt();
			
		if ( num ==1 )
			System.out.println("is not a prime ");
		else if ( num == 2 || num == 3)
			System.out.println("is a prime number");
		else 
			for (int i = 2;i<= num-1;i++) {
				if (num%i == 0 )
				{
					System.out.println("is not a prime ");
					break;	
			}else if(i == num -1 && num%i != 0)
				System.out.println("is a prime");
			}
	}

	}
	

