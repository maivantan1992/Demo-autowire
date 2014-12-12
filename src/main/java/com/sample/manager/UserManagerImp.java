package com.sample.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.dao.IUserDAO;
import com.sample.entity.User;

@Service
public class UserManagerImp implements IUserManager {

	@Autowired
	IUserDAO userDAO;

	public UserManagerImp() {
	}

	public User getById(Integer userId) {
		return userDAO.getById(userId);
	}
}
