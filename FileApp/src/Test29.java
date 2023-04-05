//serialization of student object
import java.io.*;
class Student implements Serializable {
	int regdno;
	String name;
	double cgpa;
	public Student(int regdno, String name, double cgpa) {
		this.regdno = regdno;
		this.name = name;
		this.cgpa = cgpa;
	}
	
}
public class Test29 {
	public static void main(String[] args) throws Exception{
		 Student[] ob=new Student[10];
           ob[0]=new Student(152,"student1",9.52);
           ob[1]=new Student(129,"student2",9.72);
           ob[2]=new Student(59,"student3",9.52);
           ob[3]=new Student(123,"student4",8.39);
           ob[4]=new Student(153,"student5",9.52);
           ob[5]=new Student(154,"student6",9.52);
           ob[6]=new Student(155,"student7",9.52);
           ob[7]=new Student(156,"student8",9.52);
           ob[8]=new Student(157,"student9",9.52);
           ob[9]=new Student(158,"student10",9.52);
          FileOutputStream file=
        	 new FileOutputStream("C:\\4CSE3\\students.ser");
          ObjectOutputStream out=new ObjectOutputStream(file);
        	  for (int i=0;i<10;i++)
        		  out.writeObject(ob[i]);
        	  System.out.println("file written");
        	  out.close();
        	  file.close();
	}}





