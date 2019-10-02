package com.lizen.springTest.user.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDto {
	private int userId;
	private String name;
	private String address;
	private String email;
}
