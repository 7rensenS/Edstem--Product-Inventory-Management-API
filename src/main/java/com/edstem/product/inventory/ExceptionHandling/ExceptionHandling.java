package com.edstem.product.inventory.ExceptionHandling;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandling {
	@ExceptionHandler(Exception.class)
	public void printException(Exception exception) {
		exception.printStackTrace();
	}

}
