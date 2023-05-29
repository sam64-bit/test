//deserialization of Employee
import java.io.FileInputStream;
import java.io.ObjectInputStream;
public class Test30 {
	public static void main(String[] args)throws Exception {
         Student ob=null;
         FileInputStream file=
        new FileInputStream("C:\\4CSE3\\students.ser");
       ObjectInputStream oi=new ObjectInputStream(file);
       for(int i=0;i<10;i++) {
       ob=(Student)oi.readObject();
       System.out.print(ob.regdno+" ");
       System.out.print(ob.name+" ");
       System.out.print(ob.cgpa);
       System.out.println();
       }       
	}
}
