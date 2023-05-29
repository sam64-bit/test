//create a folder name is student name , use scanner
import java.io.*;
import java.util.Scanner;
public class Test18 {
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		String foldername;
		System.out.println("Enter folder name");
		foldername=sc.next();
		for(int i=1;i<=100;i++) {
		File f = new File("c:\\"+foldername+i);
		if(f.mkdir()==true) {
			System.out.println("folder created in absolute/relative path of the current project");
		}else
			System.out.println("Error in creating folder");
		}

	}

}
