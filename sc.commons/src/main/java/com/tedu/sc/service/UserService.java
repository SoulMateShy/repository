package com.tedu.sc.service;

import com.tedu.sc.pojo.User;

public interface UserService {
	User getUser(Integer id);
	void addScore(Integer id, Integer score);
}