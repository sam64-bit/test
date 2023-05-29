//Delete record where fullname is user11,user10,user9,user8
import java.sql.*;
import java.util.Scanner;
public class Test34 {
	public static void main(String args[]) throws Exception {
	Class.forName("com.mysql.jdbc.Driver");
	Connection c=DriverManager.getConnection(
	"jdbc:mysql://localhost:3306/4cse3userdb","root","sunil");
	PreparedStatement p=c.prepareStatement(
		"delete from user where fullname=?"
			);
	String d1;
	Scanner sc=new Scanner(System.in);
		for(int i=1;i<=4;i++) {
			System.out.println("Enter d1 as fullname");
			d1=sc.next();
			p.setString(1, d1);
			int res=p.executeUpdate();
			System.out.println(res+" record deleted");
		}
	c.close();
	}

}
