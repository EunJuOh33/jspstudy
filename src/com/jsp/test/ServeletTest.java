package com.jsp.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serveletTest")	//괄호 안에 원하는 주소 적는다. 첫 글자는 소문자
public class ServeletTest extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Car myCar = new Car("현대자동차", "제네시스");
		response.setContentType("text/html");	// HTML파일의 맨 위에 적어주는 것과 같은 의미
		response.setCharacterEncoding("UTF-8");
		Calendar c = Calendar.getInstance();
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		int sec = c.get(Calendar.SECOND);
		PrintWriter pw = response.getWriter();	// 이렇게 하면 html태그를 작성할 수 있다.
		pw.write("<html><head><title>ServeletTest</title></head>");
		pw.write("<body><h1>");
		pw.write("현재 시각은");
		pw.write(Integer.toString(hour));
		pw.write("시 ");
		pw.write(Integer.toString(min));
		pw.write("분 ");
		pw.write(Integer.toString(sec));
		pw.write("초 입니다.");
		pw.write("</h1>");
		pw.write("<h2>");
		pw.write("당신의 자동차는 " + myCar.getCompany() + " 제품이고, 모델명은 " + myCar.getModel() + "입니다.");
		pw.write("</h2>");
		pw.write("</body></html>");
		pw.close();	//스트림은 사용 후 닫는다.
	}

}
