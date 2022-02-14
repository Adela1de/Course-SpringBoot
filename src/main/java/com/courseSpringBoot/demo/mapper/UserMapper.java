package com.courseSpringBoot.demo.mapper;

import com.courseSpringBoot.demo.DTO.UserDTO;
import com.courseSpringBoot.demo.entities.User;
import com.courseSpringBoot.demo.requests.UserPostRequestBody;
import com.courseSpringBoot.demo.requests.UserPutRequestBody;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class UserMapper {

    public static final UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    public abstract UserDTO toUserDTO(User user);

    public abstract User toUser(UserPostRequestBody userPostRequestBody);

    public abstract User toUser(UserPutRequestBody userPutRequestBody);
}
