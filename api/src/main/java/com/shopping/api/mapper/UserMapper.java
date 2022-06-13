package com.shopping.api.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.dto.UserDto;

@Mapper
public interface UserMapper {
	public int createUser(UserDto user);

	public List<ProductDto> readUser(int no);
	
	public int deleteUser(int no);

	public int nameCheck(String userName);
}
