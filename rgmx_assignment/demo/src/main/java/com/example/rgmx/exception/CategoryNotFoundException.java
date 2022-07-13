package com.example.rgmx.exception;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus
public class CategoryNotFoundException extends RuntimeException {
	public static final long serialVersionUID = 1L;
	public CategoryNotFoundException(String message) {
		super(message);
	}
	public CategoryNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
