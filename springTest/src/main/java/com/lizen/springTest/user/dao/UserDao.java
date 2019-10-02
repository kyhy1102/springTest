package com.lizen.springTest.user.dao;

import java.util.List;

import com.lizen.springTest.user.dto.UserDto;

public interface UserDao {
	
	public UserDto selectOne(int userId);
	public List<UserDto> selectList();
	public int insert(UserDto user);
	public int update(UserDto user);
	public int delete(int userId);
}
