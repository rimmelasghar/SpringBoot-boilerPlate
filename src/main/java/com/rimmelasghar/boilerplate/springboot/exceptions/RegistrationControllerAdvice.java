package com.rimmelasghar.boilerplate.springboot.exceptions;

import com.rimmelasghar.boilerplate.springboot.controller.RegistrationController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;

// rimmel asghar
@RestControllerAdvice(basePackageClasses = RegistrationController.class)
public class RegistrationControllerAdvice {

	@ExceptionHandler(RegistrationException.class)
	ResponseEntity<ApiExceptionResponse> handleRegistrationException(RegistrationException exception) {

		final ApiExceptionResponse response = new ApiExceptionResponse(exception.getErrorMessage(), HttpStatus.BAD_REQUEST, LocalDateTime.now());

		return ResponseEntity.status(response.getStatus()).body(response);
	}

}
