package com.lizen.springTest.user.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lizen.springTest.user.dto.UserDto;

@Repository
public class UserDaoImpl implements UserDao{

	@Override
	public UserDto selectOne(int userId) {
		UserDto user = UserDto.builder()
							.name("홍길동")
							.address("서울광역시 마포구")
							.email("springTest@aaa.com")
							.build();
		return user;
	}

	@Override
	public List<UserDto> selectList() {
		List<UserDto> userList = new ArrayList<UserDto>();
		
		userList.add(UserDto.builder()
							.name("홍길동")
							.address("서울광역시 마포구")
							.email("springTest@aaa.com")
							.build());
		userList.add(UserDto.builder()
				.name("김길동")
				.address("인천광역시 부평구")
				.email("springTest@bbb.com")
				.build());
		return userList;
	}

	@Override
	public int insert(UserDto user) {
		return 0;
	}

	@Override
	public int update(UserDto user) {
		return 0;
	}

	@Override
	public int delete(int userId) {
		return 0;
	}

}
