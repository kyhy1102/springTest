package com.lizen.springTest;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.lizen.springTest.user.service.UserService;

@Controller
public class HomeController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/test.do", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		System.out.println(userService.getDetail(5).getAddress() + "//");
		System.out.println(userService.getDetail(5).getAddress() + "//");
		System.out.println(userService.getList().get(0).getName() + "//");
		System.out.println(userService.getList().get(1).getName() + "//");
		
		model.addAttribute("test", "test.do 호출 입니다.");
		
		return "index";
	}
	
}
