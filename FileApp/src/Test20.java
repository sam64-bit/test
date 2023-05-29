//creating a text file multithread.txt
import java.io.*;
public class Test20 {
	public static void main(String[] args) throws Exception{
        File f=new File("C:\\sunil"+"\\multithread.txt");
        String essay="multithreading\nline2\nline3\nline4\nline5";
        FileWriter fw = new FileWriter(f);
        fw.write(essay);
        fw.close();
        System.out.println("1 file created & written");
	}

}
