package com.lizen.springTest.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lizen.springTest.user.dao.UserDao;
import com.lizen.springTest.user.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public UserDto getDetail(int userId) {
		return userDao.selectOne(userId);
	}
	
	@Override
	public List<UserDto> getList(){
		return userDao.selectList();
	}

}
