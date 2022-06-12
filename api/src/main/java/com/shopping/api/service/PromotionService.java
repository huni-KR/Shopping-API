package com.shopping.api.service;

import com.shopping.api.dto.PromotionDto;

public interface PromotionService {
	public boolean createPromotion(PromotionDto promotion);

	public boolean deletePromotion(int no);
}
