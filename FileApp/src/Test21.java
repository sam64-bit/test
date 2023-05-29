//Reading the file line by line
//BufferedReader is used to read line by line
import java.io.*;
public class Test21 {
	public static void main(String[] args)throws Exception {
       File source = new File("C:\\sunil\\multithread.txt");
       FileReader reader=new FileReader(source);
       BufferedReader br = new BufferedReader(reader);
       String line;
       while((line=br.readLine())!=null) {
       System.out.println(line);
       }
       br.close();       
	}
	}
