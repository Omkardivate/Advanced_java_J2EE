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
 * Servlet implementation class UpdateEmp
 */
@WebServlet("/editemp")
public class UpdateEmp extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService service= new EmpServiceImpl();
		int id= Integer.parseInt(request.getParameter("eid"));
		Employee emp= service.getEmployee(id);
		
		request.setAttribute("emp", emp);
		RequestDispatcher rd= request.getRequestDispatcher("Edit.jsp") ;
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EmpService service= new EmpServiceImpl();
		
		int id= Integer.parseInt(request.getParameter("eid"));
		String name= request.getParameter(("ename"));
		String job= request.getParameter(("ejob"));
		Employee emp= new Employee(id,name,job);
		
		int status = service.updateEmp(emp);
		if(status != -1) {
			System.out.println("Record updated...");
		}
		
		RequestDispatcher rd= request.getRequestDispatcher("showemp") ;
		rd.forward(request, response);
	}

}
