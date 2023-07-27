package com.rimmelasghar.boilerplate.springboot.exceptions;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

// rimmel asghar
@Getter
@RequiredArgsConstructor
public class RegistrationException extends RuntimeException {

	private final String errorMessage;

}
