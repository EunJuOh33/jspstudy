package com.test.jsp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/partUploadPro1Servlet")	// 첫 글자를 소문자로 바꿔준다.
@MultipartConfig(
		fileSizeThreshold = 0,
		location = "C:/tomcat9/wtpwebapps/jspstudy/upload"
)

public class PartUploadPro2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProc(request, response);
	}
	
	protected void doProc(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String writer = request.getParameter("writer");
		response.setContentType("text/html); charset=UTF-8");	// 한글설정
		PrintWriter out = response.getWriter();
		String uploadFileList = "";
		
		for(Part part:request.getParts()) {
			String contentDisposition = part.getHeader("content-disposition");
			String uploadFileName = getUploadFileName(contentDisposition, request);
			part.write(uploadFileName);
			uploadFileNameList += " " + uploadFileNameList;
		}
		out.println("작성자" + writer + "님이" + upload + "하였습니다.");
	

	// 사용 브라우저가 IE거나 Chrome인 경우
	private String getUploadFileName(String contentDisposition, HttpServletRequest request) {
		String agent = request.getHeader("Uswer-Agent");
		boolean ieBrowser = (agent.indexOf("MSIE") > -1) || (agent.indexOf("Trident") > -1);
		
		if(ieBrowser) {
			int lastPathSeparatorIndex = contentSplitStr[2].lastIndexOf("\\");
			int lastQutosIndex = contentSplitr[2].lastIndexOf("\"");
			uploadFileName = contentSplitStr[2].substring(lastPathSeparatorIndex + 1, lastQutosIndex);
		} else {
			int firstQutosIndex = contentSplitStr[2].indexOf("\\");
			int lastQutosIndex = contentSplitStr[2].lastIndexOf("\"");
			uploadFileName = contentSplitStr[2].substring(firstQutosIndex + 1, lastQutosIndex);
		}

		return uploadFileName;
	}
}
