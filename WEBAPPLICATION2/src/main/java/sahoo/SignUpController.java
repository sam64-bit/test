package sahoo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpController extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse res) 
	throws ServletException, IOException {
		res.setContentType("text/html");
		   res.getWriter().println("<h1> Camu welcomes u</h1>");
	}
   public void doPost(HttpServletRequest req,HttpServletResponse res) 
			throws ServletException, IOException {
	   res.setContentType("text/html");
	   res.getWriter().println("<h1> Camu welcomes u</h1>");
	   String f=req.getParameter("firstname");
	   String l=req.getParameter("lastname");
	   String email=req.getParameter("email");
	   String password=req.getParameter("pass");
	   res.getWriter().println("<h1> Data received from user </h1>");
	   res.getWriter().println("<h1> Name : "+f+" "+l+"</h1>");
	   res.getWriter().println("<h1> Email : "+email+"</h1>");
	   res.getWriter().println("<h1> Password : "+password+"</h1>");
   }
}















