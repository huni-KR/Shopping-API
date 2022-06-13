package com.shopping.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "PromotionItemDto : 행사 상품 정보", description = "행사 상품 상세 정보를 나타낸다.")
public class PromotionItemDto {

	@ApiModelProperty(value = "행사 번호")
	private int promotionId;
	
	@ApiModelProperty(value = "상품 번호")
	private int itemId;

	public PromotionItemDto(int promotionId, int itemId) {
		this.promotionId = promotionId;
		this.itemId = itemId;
	}

	public int getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	@Override
	public String toString() {
		return "PromotionItem [promotionId=" + promotionId + ", itemId=" + itemId + "]";
	}

}
