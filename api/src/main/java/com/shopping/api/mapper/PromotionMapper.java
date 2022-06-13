package com.shopping.api.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.shopping.api.dto.PromotionDto;

@Mapper
public interface PromotionMapper {
	public int createPromotion(PromotionDto promotion);

	public int deletePromotion(int no);

	public int nameCheck(String name);
}
