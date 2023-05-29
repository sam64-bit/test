import java.io.*;
//Creating a folder 
public class Test19 {
public static void main(String[] args) throws Exception {
		String foldername="sunil";
		File f=new File(foldername);
		if(f.mkdir()==true)
		    System.out.println("1 folder created");
		else
			System.out.println("error in creation");
	}
	
}
