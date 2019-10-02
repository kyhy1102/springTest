package com.lizen.springTest.user.service;

import java.util.List;

import com.lizen.springTest.user.dto.UserDto;

public interface UserService {
	public UserDto getDetail(int userId);
	public List<UserDto> getList();
	
}
