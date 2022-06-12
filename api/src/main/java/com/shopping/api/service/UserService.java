package com.shopping.api.service;

import com.shopping.api.dto.UserDto;

public interface UserService {
	public boolean createUser(UserDto user);

	public boolean deleteUser(int no);
}
