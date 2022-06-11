package com.shopping.api.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "ProductDto : 제품 정보", description = "제품의 상세 정보를 나타낸다.")
public class ProductDto {

	@ApiModelProperty(value = "고유 번호")
	private int itemId;
	
	@ApiModelProperty(value = "제품명")
	private String itemName;
	
	@ApiModelProperty(value = "제품 타입")
	private String itemType;
	
	@ApiModelProperty(value = "제품 가격")
	private int itemPrice;
	
	@ApiModelProperty(value = "제품 표시 시작일", example = "2022/06/11")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date itemDisplayStartDate;
	
	@ApiModelProperty(value = "제품 표시 종료일", example = "2022/06/11")
	@JsonFormat(pattern = "yyyy/MM/dd")
	private Date itemDisplayEndDate;

	public ProductDto(int itemId, String itemName, String itemType, int itemPrice, Date itemDisplayStartDate,
			Date itemDisplayEndDate) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.itemType = itemType;
		this.itemPrice = itemPrice;
		this.itemDisplayStartDate = itemDisplayStartDate;
		this.itemDisplayEndDate = itemDisplayEndDate;
	}

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

	@Override
	public String toString() {
		return "ProductDto [itemDisplayEndDate=" + itemDisplayEndDate + ", itemDisplayStartDate=" + itemDisplayStartDate
				+ ", itemId=" + itemId + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", itemType="
				+ itemType + "]";
	}

}
