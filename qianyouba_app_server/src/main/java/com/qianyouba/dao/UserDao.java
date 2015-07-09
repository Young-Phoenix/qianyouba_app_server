package com.qianyouba.dao;

import com.qianyouba.entity.User;


public interface UserDao {
	public User login(String username,String password);
}
