package com.demo.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.model.Employee;
import com.demo.service.EmpService;
import com.demo.service.EmpServiceImpl;

/**
 * Servlet implementation class InsertServlet
 */
@WebServlet("/insertemp")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		EmpService service= new EmpServiceImpl();
		int id= Integer.parseInt(req.getParameter(("eid")) ) ;
		String name= req.getParameter(("ename"));
		String job= req.getParameter(("ejob"));
		service.insertEmployee(id,name, job);
		System.out.println("inserted...");
		
		RequestDispatcher rd= req.getRequestDispatcher("showemp") ;
		rd.forward(req, res);
		
	}

}
