//selecting all records from user
//select * from user; DML? no DQL yes createStatement
import java.sql.*;
public class Test35 {
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=DriverManager.getConnection(
		"jdbc:mysql://localhost:3306/4cse3userdb","root","sunil");
   Statement st=c.createStatement();
   ResultSet res=st.executeQuery("select * from user");
   while(res.next()) {
	   System.out.print(res.getInt(1)+"\t");
	   System.out.print(res.getString(2)+"\t");
	   System.out.print(res.getString(3)+"\t");
	   System.out.print(res.getString(4));
	   System.out.println();
   }
   System.out.println("records fetched");
	}

}






