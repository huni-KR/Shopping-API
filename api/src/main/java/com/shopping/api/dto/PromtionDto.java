package com.shopping.api.dto;

import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "PromotionDto : 행사 정보", description = "행사의 상세 정보를 나타낸다.")
public class PromtionDto {

	@ApiModelProperty(value = "고유 번호")
	private int promotionId;

	@ApiModelProperty(value = "행사명")
	private String promotionNm;

	@ApiModelProperty(value = "할인 금액")
	private String discountAmount;

	@ApiModelProperty(value = "할인 비율")
	private String discountRate;

	@ApiModelProperty(value = "행사 시작일", example = "2022/06/11")
	private Date promotionStartDate;

	@ApiModelProperty(value = "행사 시작일", example = "2022/06/11")
	private Date promotionEndDate;

	public PromtionDto(int promotionId, String promotionNm, String discountAmount, String discountRate,
			Date promotionStartDate, Date promotionEndDate) {
		super();
		this.promotionId = promotionId;
		this.promotionNm = promotionNm;
		this.discountAmount = discountAmount;
		this.discountRate = discountRate;
		this.promotionStartDate = promotionStartDate;
		this.promotionEndDate = promotionEndDate;
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

	@Override
	public String toString() {
		return "PromtionDto [promotionId=" + promotionId + ", promotionNm=" + promotionNm + ", discountAmount="
				+ discountAmount + ", discountRate=" + discountRate + ", promotionStartDate=" + promotionStartDate
				+ ", promotionEndDate=" + promotionEndDate + "]";
	}
}
