//file copy
import java.io.*;
public class Test22 {
	public static void main(String[] args) throws Exception{
      File source = new File("C:\\sunil\\multithread.txt");
      File target = new File("C:\\sunil\\multithread_copy.txt");
      FileReader fr=new FileReader(source);
      FileWriter fw=new FileWriter(target);
      BufferedReader br = new BufferedReader(fr);
      BufferedWriter bw = new BufferedWriter(fw);
      String line;
      while((line=br.readLine())!=null) {
    	  bw.write(line);
    	  bw.newLine();
      }
      bw.close();
      br.close();
      System.out.println(" 1 file copied");
	}

}




