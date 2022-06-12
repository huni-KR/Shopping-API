package com.shopping.api.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.api.dto.ProductDto;
import com.shopping.api.dto.UserDto;
import com.shopping.api.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private UserService userService;

	@PostMapping
	public ResponseEntity<String> createUser(@RequestBody UserDto userDto) {
		logger.debug("createUser - 호출");
		if (userService.createUser(userDto)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

	@GetMapping("{no}")
	public ResponseEntity<List<ProductDto>> readUser(@PathVariable int no) throws Exception {
		logger.debug("readUser - 호출");
		return new ResponseEntity<List<ProductDto>>(userService.readUser(no), HttpStatus.OK);
	}

	@DeleteMapping("{no}")
	public ResponseEntity<String> deleteUser(@PathVariable int no) throws Exception {
		logger.debug("deleteUser - 호출");
		if (userService.deleteUser(no)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
}
