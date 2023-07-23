package com.rimmelasghar.application.security.mapper;

import com.rimmelasghar.application.model.User;
import com.rimmelasghar.application.security.dto.AuthenticatedUserDto;
import com.rimmelasghar.application.security.dto.RegistrationRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

	UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

	User convertToUser(RegistrationRequest registrationRequest);

	AuthenticatedUserDto convertToAuthenticatedUserDto(User user);

	User convertToUser(AuthenticatedUserDto authenticatedUserDto);

}
