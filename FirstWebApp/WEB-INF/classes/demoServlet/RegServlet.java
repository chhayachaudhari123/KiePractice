package demoServlet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegServlet extends HttpServlet {

				
		public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException{
			
			String fname = req.getParameter("fname");
			String lname = req.getParameter("lname");
			String username = req.getParameter("username");
			String password = req.getParameter("password");
			String address = req.getParameter("address");
			String contact = req.getParameter("contact");
			
			if(fname.isEmpty()||lname.isEmpty()||username.isEmpty()||password.isEmpty()||address.isEmpty()||contact.isEmpty()){
				
				RequestDispatcher request = req.getRequestDispatcher("registration.jsp");
				
				request.include(req,res);
			}
			else{
				
				RequestDispatcher request = req.getRequestDispatcher("welcome.jsp");
				
				request.forward(req, res);
			}
		}

}
