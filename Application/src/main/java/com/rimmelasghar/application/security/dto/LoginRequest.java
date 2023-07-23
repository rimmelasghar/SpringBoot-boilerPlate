package com.rimmelasghar.application.security.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class LoginRequest {

	@NotEmpty(message = "{login_username_not_empty}")
	private String username;

	@NotEmpty(message = "{login_password_not_empty}")
	private String password;

}
