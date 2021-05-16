package oopsConcept;

import java.io.FileOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FileOutputStream fileOutputStream;
		
		try {
			fileOutputStream = new FileOutputStream("abc.txt");
			String msg = "Welcome to Java";
			
			byte ByteArray[] = msg.getBytes();
			
			fileOutputStream.write(ByteArray);
			System.out.println("Message written to file successfully");
			
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
