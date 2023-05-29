import java.sql.*;
public class Test31 {
public static void main(String[] args) throws Exception {
	//step 1 - loading the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	System.out.println("Driver loaded");
	//step 2 - getting the connection
	String dns="jdbc:mysql://localhost:3306/4CSE3";
	Connection con=DriverManager.getConnection(dns,"root","sunil");
	System.out.println("Connection established");

	}

}
