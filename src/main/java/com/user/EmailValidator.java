package com.user;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailValidator {
	
	public int addition(int a, int b) {
		return a+b;
	}

	private Pattern pattern;
	private Matcher matcher;

	private static final String EMAIL_PATTERN = 
		"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

	public EmailValidator() {
		pattern = Pattern.compile(EMAIL_PATTERN);
	}

	/**
	 * Validate hex with regular expression
	 * 
	 * @param emailId
	 *            hex for validation
	 * @return true valid hex, false invalid hex
	 */
	public boolean validate(String emailId) {
		emailId = emailId.trim();

		matcher = pattern.matcher(emailId);
		return matcher.matches();

	}
}