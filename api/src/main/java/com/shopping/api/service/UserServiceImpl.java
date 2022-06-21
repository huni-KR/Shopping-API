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
	
	public UserServiceImpl(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	@Override
	public void createUser(UserDto user) {
		userMapper.createUser(user);
	}
	
	@Override
	public List<ProductDto> readUser(int no) {
		return userMapper.readUser(no);
	}

	@Override
	public void deleteUser(int no) {
		userMapper.deleteUser(no);
	}

	@Override
	public int nameCheck(String userName) {
		return userMapper.nameCheck(userName);
	}
}