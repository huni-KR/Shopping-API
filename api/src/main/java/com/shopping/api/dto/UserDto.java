package com.shopping.api.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "UserDto : 사용자 정보", description = "사용자의 상세 정보를 나타낸다.")
public class UserDto {

	@ApiModelProperty(value = "고유 번호")
	private int userId;
	
	@ApiModelProperty(value = "이름")
	private String userName;
	
	@ApiModelProperty(value = "타입")
	private String userType;
	
	@ApiModelProperty(value = "상태")
	private String userStat;

	public UserDto(int userId, String userName, String userType, String userStat) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userStat = userStat;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserStat() {
		return userStat;
	}

	public void setUserStat(String userStat) {
		this.userStat = userStat;
	}

	@Override
	public String toString() {
		return "UserDto [userId=" + userId + ", userName=" + userName + ", userType=" + userType + ", userStat="
				+ userStat + "]";
	}
}
