package com.yash.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.model.UserDetails;
import com.yash.service.UserService;
import com.yash.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class RegistrationController
 */
@WebServlet("/RegistrationController")
public class RegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public RegistrationController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String name = request.getParameter("name");
		String contact = request.getParameter("contact");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		UserDetails userDetails = new UserDetails(name, contact, address, email, loginName, password);
		try {
			UserService userService = new UserServiceImpl();
			boolean result = userService.register(userDetails);
			out.println("<html>");
			out.println("<head>");
			out.println("<title>Successfull Registration</title>");
			out.println("</head>");
			out.println("<body>");
			out.println("<center>");
			if (result) {
				out.println("<h1>Thanks for your Registration</h1>");
				out.println("To Login with new UserId and Password <a href='login.jsp'>Click Here</a>");
			} else {
				out.println("<h1>Registration Failed</h1>");
				out.println("To try again <a href='registration.jsp'>Click Here</a>");
			}
			out.println("</center>");
			out.println("</body>");
			out.println("</html>");
		} finally {
			out.close();
		}
	}

}
