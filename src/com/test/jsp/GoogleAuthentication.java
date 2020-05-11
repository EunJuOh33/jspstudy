package com.test.jsp;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;

public class GoogleAuthentication extends Authenticator {
	PasswordAuthentication passAuth;

	public GoogleAuthentication() {
		passAuth = new PasswordAuthentication("eunjuoh.dev", "비밀번호");	// 실제 구글 아이디, 비밀번호
	}
	
	public PasswordAuthentication getPassAuth() {
		return passAuth;
	}
}
