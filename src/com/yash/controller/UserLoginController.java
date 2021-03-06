package com.yash.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.yash.model.UserDetails;
import com.yash.service.UserService;
import com.yash.serviceimpl.UserServiceImpl;

/**
 * Servlet implementation class UserLoginController
 */
@WebServlet("/UserLoginController")
public class UserLoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String loginName = request.getParameter("loginName");
		String password = request.getParameter("password");
		UserService userService = new UserServiceImpl();
		UserDetails user = userService.getUserById(loginName);
		boolean loginSuccess = password.equals(user.getPassword());
		if (loginSuccess) {
			request.getSession().setAttribute("user", user);
			response.sendRedirect("./welcome.jsp");
		} else {
			response.sendRedirect("./error.jsp");
		}
	}

}
