package EmployeeController;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import EmployeeDao.EmpDao;
import EmployeeDto.EmpDto;
@WebServlet("/signup")
public class EmpSignUp extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		super.doPost(req, resp);
	
	  String name  =req.getParameter("name");
	  String email =req.getParameter("email");
	  String pws = req.getParameter("psw");
	  int pwd=Integer.parseInt(pws);
	  
	  EmpDto dto=new EmpDto();
	  dto.setName(name);
	  dto.setEmail(email);
	  dto.setPsw(pwd);
	  
	  EmpDao dao=new EmpDao();
	  dao.create(dto);
	  
	}
	

}
