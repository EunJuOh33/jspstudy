package com.test.jsp;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dispatcherServlet")	// 첫 글자는 소문자
public class RedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/* 한글 */
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html);charset=UTF-8");
		
		request.setAttribute("data", "데이터");
		RequestDispatcher rd = request.getRequestDispatcher("redirect.jsp");
		rd.forward(request, response);
	}
}
