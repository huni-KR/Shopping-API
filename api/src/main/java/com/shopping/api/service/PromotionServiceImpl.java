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
	public boolean createPromotion(PromotionDto promotion) {
		return promotionMapper.createPromotion(promotion) == 1;
	}

	@Override
	public boolean deletePromotion(int no) {
		return promotionMapper.deletePromotion(no) == 1;
	}

}
