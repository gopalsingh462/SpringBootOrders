package com.macy.exception;

public class InvalidOrderIdException extends RuntimeException{
	private String message;

	public InvalidOrderIdException(String message) {
		super();
		this.message = message;
	}

	public InvalidOrderIdException() {

		this.message = "";
	}

	@Override
	public String toString() {
		return "Invalid order ID " + this.message;
	}
}
