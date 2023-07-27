package com.rimmelasghar.boilerplate.springboot.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

// rimmel asghar
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ValidationErrorResponse {

	private HttpStatus status;

	private LocalDateTime time;

	private List<String> message;

}
