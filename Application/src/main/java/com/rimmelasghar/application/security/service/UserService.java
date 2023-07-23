package com.rimmelasghar.application.security.service;

import com.rimmelasghar.application.model.User;
import com.rimmelasghar.application.security.dto.AuthenticatedUserDto;
import com.rimmelasghar.application.security.dto.RegistrationRequest;
import com.rimmelasghar.application.security.dto.RegistrationResponse;

public interface UserService {

	User findByUsername(String username);

	RegistrationResponse registration(RegistrationRequest registrationRequest);

	AuthenticatedUserDto findAuthenticatedUserByUsername(String username);

}
