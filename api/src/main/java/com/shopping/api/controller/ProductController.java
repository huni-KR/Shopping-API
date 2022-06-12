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
import com.shopping.api.dto.ProductPromotionDto;
import com.shopping.api.service.ProductService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/product")
public class ProductController {

	private static final Logger logger = LoggerFactory.getLogger(ProductController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private ProductService productService;

	@PostMapping
	@ApiOperation(value="제품 생성", notes="제품을 생성한다.")
	public ResponseEntity<String> createProduct(@RequestBody ProductDto product) {
		logger.debug("createProduct - 호출");
		if (productService.createProduct(product)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}

	@GetMapping("{no}")
	@ApiOperation(value="제품 프로모션 조회", notes="제품에 적용되는 가격이 가장 낮은 프로모션 정보 조회한다.")
	public ResponseEntity<List<ProductPromotionDto>> readProduct(@PathVariable int no) throws Exception {
		logger.debug("readProduct - 호출");
		return new ResponseEntity<List<ProductPromotionDto>>(productService.readProduct(no), HttpStatus.OK);
	}

	@DeleteMapping("{no}")
	@ApiOperation(value="제품 삭제", notes="제품을 삭제한다.")
	public ResponseEntity<String> deleteProduct(@PathVariable int no) throws Exception {
		logger.debug("deleteProduct - 호출");
		if (productService.deleteProduct(no)) {
			return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
}
