import java.io.*;
public class Test26 {
public static void main(String[] args) throws Exception {
File file = new File("C:\\4CSE3\\students.dat");
FileInputStream fis = new FileInputStream(file);
BufferedReader br = 
new BufferedReader(new InputStreamReader(fis));
String line;
while ((line = br.readLine()) != null) {
System.out.println(line);
}
}
}
