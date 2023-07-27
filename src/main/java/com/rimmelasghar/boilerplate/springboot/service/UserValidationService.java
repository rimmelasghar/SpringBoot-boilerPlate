package com.rimmelasghar.boilerplate.springboot.service;

import com.rimmelasghar.boilerplate.springboot.utils.ExceptionMessageAccessor;
import com.rimmelasghar.boilerplate.springboot.exceptions.RegistrationException;
import com.rimmelasghar.boilerplate.springboot.repository.UserRepository;
import com.rimmelasghar.boilerplate.springboot.security.dto.RegistrationRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

// rimmel asghar
@Slf4j
@Service
@RequiredArgsConstructor
public class UserValidationService {

	private static final String EMAIL_ALREADY_EXISTS = "email_already_exists";

	private static final String USERNAME_ALREADY_EXISTS = "username_already_exists";

	private final UserRepository userRepository;

	private final ExceptionMessageAccessor exceptionMessageAccessor;

	public void validateUser(RegistrationRequest registrationRequest) {

		final String email = registrationRequest.getEmail();
		final String username = registrationRequest.getUsername();

		checkEmail(email);
		checkUsername(username);
	}

	private void checkUsername(String username) {

		final boolean existsByUsername = userRepository.existsByUsername(username);

		if (existsByUsername) {

			log.warn("{} is already being used!", username);

			final String existsUsername = exceptionMessageAccessor.getMessage(null, USERNAME_ALREADY_EXISTS);
			throw new RegistrationException(existsUsername);
		}

	}

	private void checkEmail(String email) {

		final boolean existsByEmail = userRepository.existsByEmail(email);

		if (existsByEmail) {

			log.warn("{} is already being used!", email);

			final String existsEmail = exceptionMessageAccessor.getMessage(null, EMAIL_ALREADY_EXISTS);
			throw new RegistrationException(existsEmail);
		}
	}

}
