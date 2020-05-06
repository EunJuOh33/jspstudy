package com.test.jsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/dog2.do")
public class DogServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		/* 넘어오는 이름을 모를 경우 */
		Enumeration<String> enu = request.getParameterNames();
		while(enu.hasMoreElements() ) {
			String name = enu.nextElement();
			String[] arr = request.getParameterValues(name);
			
			out.println("<html>");
			out.println("<head>");
			out.println("<meta charset='UTF-8' />");
			out.println("<title>강아지 사진</title>");
			out.println("</head>");
			out.println("<body>");
			
			for(String value:arr) {
				if(name.equals("dog")) {
					out.println("<img src='" + value + "' alt='-' style='width:200px;'>");
				} else {
					out.println("<h3>키: " + name + ", 값: " + value + "</h3><br/>");
				}
			}
			out.println("</body>");
			out.println("</html>");
		}
	}
}
