package com.sample.dao;

import org.springframework.stereotype.Repository;

import com.sample.entity.User;

@Repository
public class UserHBSpDAO extends HBSpBasicDAO<User, Integer> implements
		IUserDAO {
	public UserHBSpDAO() {
		super(User.class);
	}

	@Override
	public User getById(Integer userId) {
		return this.get(userId);
	}
}
