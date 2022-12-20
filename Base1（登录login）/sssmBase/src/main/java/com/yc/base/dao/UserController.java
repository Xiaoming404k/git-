package com.yc.base.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yc.base.entity.UserModel;
import com.yc.base.framework.R;
import com.yc.base.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
	@Autowired
	private UserService userService;

	@PostMapping("/login")
	public R login(@RequestBody UserModel u) {
		
		return userService.login(u);
		
	}
}
