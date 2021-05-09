package test;

import java.util.Scanner;

public class DataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	System.out.println("Hello World");
	
	int num1 = 11;
	int num2 = 20;
	
	int sum = num1 + num2;
	
	System.out.println(sum);
	
	float num3 = (float)num2/num1;
	int num4 = num1 * num2;
	
	/*System.out.println("Multiplication"+ num4);
	System.out.println("Division " + num3);

	String name = "Chanchan";
	System.out.println("Length " + name.length());
    System.out.println("Uppercase " + name.toUpperCase());	
	Scanner scanner = new Scanner(System.in);
	System.out.println("Please enter the name");
	String name1 = scanner.next();
	
	System.out.println(" Uppercase" +name1.toUpperCase());*/
	
	int array[] = {2,3,1, 5,6};
	System.out.println("The third value is " + array[2]);
	
	
	String arr2[] = 
		{"Nisha","Bora","Lala","Jisha"};
	System.out.println("length " + arr2.length);
	System.out.println("last value " + arr2[arr2.length - 1]);
	
	
	
	
	
	

	
	
	}

}
