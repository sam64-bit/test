package sunil;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FactorialController extends HttpServlet{
	public void doPost(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {
			res.setContentType("text/html");
			PrintWriter out = res.getWriter();
       String s=req.getParameter("n1");
       int n=Integer.parseInt(s);
       long f=1;
       for(int i=1;i<=n;i++) 
    	   f=f*i;
       out.println("factorial is "+f);
       
}
	
}	
	




