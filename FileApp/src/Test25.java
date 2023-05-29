import java.io.*;
//Hostel - 154, 3,
//pg - 
//Home- 
import java.util.Scanner;
public class Test25 {
public static void main(String args[]) throws Exception {
String filename="students";
String foldername="4CSE3";
FileOutputStream target = 
new FileOutputStream("C:\\"+foldername+"\\"+filename+".dat");
System.out.println("file created");
String header="Name         Regdno          Essaysubmitted\n";
String rec1="Irfan"+"      "+String.valueOf(123)+"      yes\n";
String rec2="Manoj"+"      "+String.valueOf(124)+"      yes\n";
String rec3="Pavan"+"      "+String.valueOf(126)+"       no\n";	
target.write(header.getBytes());
target.write(rec1.getBytes());
target.write(rec2.getBytes());
target.write(rec3.getBytes());
target.close();
System.out.println("3 Records added to students file");
}
}
