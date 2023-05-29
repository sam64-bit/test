import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
@WebServlet("/register")
public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name,email,password;
		name=request.getParameter("n");
		email=request.getParameter("m");
		password=request.getParameter("p");
	response.getWriter().println
	("<body bgcolor='skyblue'><br><br><h1>name received"+name+" </h1>");
	response.getWriter().println("<br><h1>password received"+password+" </h1>");
	response.getWriter().println("<br><h1>email received"+email+" </h1>");
	try {
		Class.forName("com.mysql.jdbc.Driver");
	response.getWriter().println("<br><h2>Driver Loaded</h2></br>");
		Connection c=
		DriverManager.
	getConnection("jdbc:mysql://localhost:3306/test","root","sunil");
	response.getWriter().println("<h2>Connection established</h2>");
		PreparedStatement s=
		c.prepareStatement("insert into user values(?,?,?)");
		s.setString(1, name);
		s.setString(2, email);
		s.setString(3, password);
		s.executeUpdate();
		response.getWriter().println("<h2>record inserted</h2>");
	}catch(Exception e) {}
	}

}








