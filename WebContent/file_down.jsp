<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.File" %>
<%@ page import="java.net.URLEncoder, java.io.*" %>

<%
	String fileName = request.getParameter("file_name");

	String savePath = "upload";
	ServletContext context = getServletContext();
	String sDownloadPath = context.getRealPath(savePath);
	String sFilePath = sDownloadPath + "\\" + fileName;
	byte b[] = new byte[4096];
	FileInputStream in = new FileInputStream(sFilePath);
	String sMimeType = getServletContext().getMimetype(sFilePath);
	System.out.println("sMimeType>>>" + sMimeType);
	
	if(sMimeType == null) sMimeType = "application/octet-stream";
	
	response.setContentType(sMimeType);
	String agent = request.getHeader("User-Agent");
	boolean ieBrowser = (agent.indexOf("MSIE") > -1) || (agent.indexOf("Trident") > -1);
	
	
	if(ieBrowser) {
		fileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");	
			// '\'(역슬러쉬)가 두 개인 경우, (%20은 공백) 공백으로 바꿔라.
	} else {
		fileName = new String(fileName.getBytes("UTF-8"), "iso-8859-1");
	}
	
	
	response.setHeader("Content-Disposition", "attachment; filename=" + fileName);
	
	ServletOutputStream out2 = response.getOutputStream();
	int numRead;	// numRead 변수 생성
	
	while ((numRead = in.read(b, 0, b.length)) != -1) {	// 바이트배열을 0번부터 b의 길이만큼 읽었을 때, 
		out2.write(b, 0, numRead);	// numRead는 b의 길이
	}
	out2.flush();	// flush 버퍼를 비운다.
	out2.close();
	in.close();
%>