//insert 10 rescords
import java.sql.*;
import java.util.Scanner;
public class Test33 {
	public static void main(String[] args)throws Exception {
    Class.forName("com.mysql.jdbc.Driver");
    Connection c=DriverManager.getConnection(
    "jdbc:mysql://localhost:3306/4cse3userdb","root","sunil");
    //Statement ss=c.createStatement();
    //ss.execute("insert into......");
    PreparedStatement s=
    c.prepareStatement("insert into user values(?,?,?,?)");
    int d1;
    String d2,d3,d4;
    for(int i=1;i<=10;i++) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter d1 d2 d3 d4");
    d1=sc.nextInt();
    d2=sc.next();
    d3=sc.next();
    d4=sc.next();
    s.setInt(1,d1);
    s.setString(2, d2);
    s.setString(3, d3);
    s.setString(4, d4);
   int res= s.executeUpdate();
   System.out.println(res+" record inserted");
    }
    c.close();
	}

}
