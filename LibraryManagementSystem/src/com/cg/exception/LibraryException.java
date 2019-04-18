package com.cg.exception;

import java.sql.SQLException;

public class LibraryException extends SQLException {
	private static final long serialVersionUID = 866264577455967591L;

	public LibraryException(String message) {

		super(message);
	}
}
