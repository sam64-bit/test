import java.sql.*;
import java.util.Scanner;
public class Test32 {
	public static void main(String[] args) throws Exception{
         //step1   loading the driver
	 Class.forName("com.mysql.cj.jdbc.Driver");	
	 System.out.println("driver loaded");
		 //step2  getting the connection
	 String address="jdbc:mysql://localhost:3306/4cse3userdb";
	  Connection connection=
			  DriverManager.getConnection(address,"root","sunil");
		 //step3  getting the prompt
	  String insertquery=
			  "insert into user values(?,?,?,?)";
	   PreparedStatement st=connection.prepareStatement(insertquery);
        String id,pwd,un,email;
        Scanner sc=new Scanner(System.in);
        for(int i=1;i<=10;i++) {
        	System.out.println("Enter user details");
        	id=sc.next();
        	pwd=sc.next();
        	un=sc.next();
        	email=sc.next();
        	st.setString(1, id);
        	st.setString(2, pwd);
        	st.setString(3, un);
        	st.setString(4, email);
        	int n=st.executeUpdate();
   		 //step5  get the response
           System.out.println(n +" inserted" );
        }
	}

}
