package com.lizen.springTest.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lizen.springTest.user.dto.UserDto;
import com.lizen.springTest.user.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/list.do", method=RequestMethod.GET)
	public String list(Model model) {
		List<UserDto> userList = userService.getList();
		
		model.addAttribute("userList", userList);
		
		return "main/user/userList";
	}
	
	
	@RequestMapping(value="/goAddPage.do", method=RequestMethod.GET)
	public String add(Model model) {
		return "main/user/userAdd";
	}
}
