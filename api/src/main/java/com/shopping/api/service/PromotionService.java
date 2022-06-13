package com.shopping.api.service;

import com.shopping.api.dto.PromotionDto;

public interface PromotionService {
	public void createPromotion(PromotionDto promotion);

	public void deletePromotion(int no);
	
	public int nameCheck(String name);
}
