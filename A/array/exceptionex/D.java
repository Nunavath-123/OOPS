package exceptionex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;

import netscape.javascript.JSObject;

public class D {

	public static void main(String[] args)throws FileNotFoundException {
		/*
		 * FileInputStream fin=new FileInputStream("D:/Dummy/T1.txt");
		 * System.out.println("Good Morning...!");
		 */
		
		 
		
		File file = new File("C:\\user\\Desktop\\dir1\\dir2\\newFileName.txt");
		file.getParentFile().mkdirs();
		PrintStream out=new PrintStream(file);
		out.print("Hi");
		out.close();
	}
}
		