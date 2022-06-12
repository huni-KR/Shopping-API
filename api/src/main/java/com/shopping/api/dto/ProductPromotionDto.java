package com.shopping.api.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ProductDto : 제품 정보", description = "제품의 상세 정보를 나타낸다.")
public class ProductPromotionDto {

	@ApiModelProperty(value = "고유 번호")
	private int itemId;

	@ApiModelProperty(value = "제품명")
	private String itemName;

	@ApiModelProperty(value = "제품 타입")
	private String itemType;

	@ApiModelProperty(value = "제품  가격")
	private int itemPrice;
	
	@ApiModelProperty(value = "제품 할인 가격")
	private int itemDiscountPrice;

	@ApiModelProperty(value = "제품 표시 시작일", example = "2022-06-11")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date itemDisplayStartDate;

	@ApiModelProperty(value = "제품 표시 종료일", example = "2022-06-11")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date itemDisplayEndDate;

	@ApiModelProperty(value = "고유 번호")
	private int promotionId;

	@ApiModelProperty(value = "행사명")
	private String promotionNm;

	@ApiModelProperty(value = "할인 금액")
	private String discountAmount;

	@ApiModelProperty(value = "할인 비율")
	private String discountRate;

	@ApiModelProperty(value = "행사 시작일", example = "2022-06-11")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date promotionStartDate;

	@ApiModelProperty(value = "행사 시작일", example = "2022-06-11")
	@JsonFormat(pattern = "yyyy-MM-dd")
	private Date promotionEndDate;

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}

	public int getItemDiscountPrice() {
		return itemDiscountPrice;
	}

	public void setItemDiscountPrice(int itemDiscountPrice) {
		this.itemDiscountPrice = itemDiscountPrice;
	}
	
	public Date getItemDisplayStartDate() {
		return itemDisplayStartDate;
	}

	public void setItemDisplayStartDate(Date itemDisplayStartDate) {
		this.itemDisplayStartDate = itemDisplayStartDate;
	}

	public Date getItemDisplayEndDate() {
		return itemDisplayEndDate;
	}

	public void setItemDisplayEndDate(Date itemDisplayEndDate) {
		this.itemDisplayEndDate = itemDisplayEndDate;
	}

	public int getPromotionId() {
		return promotionId;
	}

	public void setPromotionId(int promotionId) {
		this.promotionId = promotionId;
	}

	public String getPromotionNm() {
		return promotionNm;
	}

	public void setPromotionNm(String promotionNm) {
		this.promotionNm = promotionNm;
	}

	public String getDiscountAmount() {
		return discountAmount;
	}

	public void setDiscountAmount(String discountAmount) {
		this.discountAmount = discountAmount;
	}

	public String getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(String discountRate) {
		this.discountRate = discountRate;
	}

	public Date getPromotionStartDate() {
		return promotionStartDate;
	}

	public void setPromotionStartDate(Date promotionStartDate) {
		this.promotionStartDate = promotionStartDate;
	}

	public Date getPromotionEndDate() {
		return promotionEndDate;
	}

	public void setPromotionEndDate(Date promotionEndDate) {
		this.promotionEndDate = promotionEndDate;
	}
}
