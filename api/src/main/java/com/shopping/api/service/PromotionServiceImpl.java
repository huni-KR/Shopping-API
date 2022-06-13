package com.shopping.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopping.api.dto.PromotionDto;
import com.shopping.api.mapper.PromotionMapper;

@Service
public class PromotionServiceImpl implements PromotionService {

	@Autowired
	private PromotionMapper promotionMapper;

	@Override
	public void createPromotion(PromotionDto promotion) {
		promotionMapper.createPromotion(promotion);
	}

	@Override
	public void deletePromotion(int no) {
		promotionMapper.deletePromotion(no);
	}

	@Override
	public int nameCheck(String name) {
		return promotionMapper.nameCheck(name);
	}

}
