package com.shopping.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shopping.api.dto.UserDto;

@Mapper
public interface UserMapper {
	public int createUser(UserDto user);

	public int deleteUser(int no);
}
