package com.fullstack.oops.main;

public class Reports implements FatInterface {

	@Override
	public void convertToPdf() {
		// TODO Auto-generated method stub

	}

	@Override
	public void convertToHtml() {
		// TODO Auto-generated method stub

	}

	@Override
	public void convertToCsv() {
		// TODO Auto-generated method stub

	}

	@Override
	public void convertToText() {
		// TODO Auto-generated method stub

	}

	@Override
	public void convertToJson() {
		// TODO Auto-generated method stub

	}

}


interface LoginService{
	void signIn();
	void signOut();
	void rememberMeCookie();
	String getUserDetails();
	void setSessionExpiration(int seconds);
	void validateToken(int token);
}
class GoogleLoginService implements LoginService{

	@Override
	public void signIn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void signOut() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rememberMeCookie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getUserDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setSessionExpiration(int seconds) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void validateToken(int token) {
		// TODO Auto-generated method stub
		
	}
	
}


