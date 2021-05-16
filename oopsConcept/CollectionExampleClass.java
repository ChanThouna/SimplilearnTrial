package oopsConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class CollectionExampleClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList <String> myList = new ArrayList<String>();
		myList.add("Omila");
		myList.add("Chanchan");
		myList.add("Meena");
		System.out.println(myList);
		
		
		ArrayList <Object> newList = new ArrayList<Object>();
		newList.add("Heema");
		newList.add(1345);
		newList.add(123.56);
		newList.add('C');
		System.out.println(newList);
		
		System.out.println("After Sort");
		
		Collections.sort(myList);
		System.out.println(myList);
		
		
		System.out.println("reverse order");
		Collections.sort(myList,Collections.reverseOrder());
		System.out.println(myList);
		
		myList.remove(1);
		myList.add("Jolina");
		System.out.println(myList);
		
		Stack<String> myStack = new Stack<String>();
		myStack.push("Leela");
		myStack.push("Kelvina");
		myStack.push("Jasmine");
		System.out.println(myStack);
		myStack.pop();
		System.out.println(myStack);
		

	}

}
