package com.shopping.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.dto.UserDto;
import com.shopping.api.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean createUser(UserDto user) {
		return userMapper.createUser(user) == 1;
	}
	
	@Override
	public List<ProductDto> readUser(int no) {
		return userMapper.readUser(no);
	}

	@Override
	public boolean deleteUser(int no) {
		return userMapper.deleteUser(no) == 1;
	}
}