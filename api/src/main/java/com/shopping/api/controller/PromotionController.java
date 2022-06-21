package com.shopping.api.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shopping.api.dto.PromotionDto;
import com.shopping.api.service.PromotionService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

	private static final Logger logger = LoggerFactory.getLogger(PromotionController.class);
	private static final String SUCCESS = "success";
	private static final String FAIL = "fail";

	@Autowired
	private PromotionService promotionService;

	@PostMapping
	@ApiOperation(value="프로모션 생성", notes="프로모션을 생성한다.")
	public ResponseEntity<String> createPromotion(@RequestBody PromotionDto promotion) {
		logger.debug("createPromotion - 호출");
		if (promotionService.nameCheck(promotion.getPromotionNm()) == 0) {
			promotionService.createPromotion(promotion);
			return new ResponseEntity<String>(SUCCESS, HttpStatus.CREATED);
		}
		return new ResponseEntity<String>(FAIL, HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("{no}")
	@ApiOperation(value="프로모션 삭제", notes="프로모션을 삭제한다.")
	public ResponseEntity<String> deletePromotion(@PathVariable int no) throws Exception {
		logger.debug("deletePromotion- 호출");
		promotionService.deletePromotion(no);
		return new ResponseEntity<String>(SUCCESS, HttpStatus.OK);
	}
}
