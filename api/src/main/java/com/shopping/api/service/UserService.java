package com.shopping.api.service;

import java.util.List;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.dto.UserDto;

public interface UserService {
	public boolean createUser(UserDto user);
	
	public List<ProductDto> readUser(int no);

	public boolean deleteUser(int no);
}
