import java.io.*;
//checked exception demo
public class Test9 {
	public static void main(String[] args) throws Exception {
		File ob = new File("C:\\sunil\\resume.txt");
		FileReader readop = new FileReader(ob);
		BufferedReader br = new BufferedReader(readop);
		String line;
		while((line=br.readLine())!=null) {
			System.out.println(line);
		}

	}

}
