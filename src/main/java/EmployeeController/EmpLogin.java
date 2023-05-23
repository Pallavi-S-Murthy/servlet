package EmployeeController;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EmployeeDao.EmpDao;
import EmployeeDto.EmpDto;

@WebServlet("/login")
public class EmpLogin extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doGet(req, resp);
		
		String email=req.getParameter("emailid");
		String pwd = req.getParameter("pwd");
		int password = Integer.parseInt(pwd);
		
		
		EmpDao dao= new EmpDao();
		EmpDto e1= dao.login(email);
		if(e1!=null) {
			if(e1.getPsw()==password) {
//				
				resp.getWriter().print("<h1>Welcome to home page </h1>");
				
				resp.sendRedirect("https://www.facebook.com/");
			}
			else {
				resp.getWriter().print("<h1>Enter proper password </h1>");
				RequestDispatcher dispatcher=req.getRequestDispatcher("login.html");
				dispatcher.include(req, resp);
			}
		}
		else {
			resp.getWriter().print("<h1>Account not found, please signup</h1> <a href=\"signup.html\">signup</a>");
		}
	
	}
	

}
