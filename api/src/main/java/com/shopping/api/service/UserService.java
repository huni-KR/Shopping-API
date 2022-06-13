package com.shopping.api.service;

import java.util.List;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.dto.UserDto;

public interface UserService {
	public void createUser(UserDto user);
	
	public List<ProductDto> readUser(int no);

	public void deleteUser(int no);

	public int nameCheck(String userName);
}
