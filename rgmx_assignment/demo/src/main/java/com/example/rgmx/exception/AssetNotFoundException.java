package com.example.rgmx.exception;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus

public class AssetNotFoundException extends RuntimeException {
	public static final long serialVersionUID = 1L;
	public AssetNotFoundException(String message) {
		super(message);
	}
	public AssetNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
