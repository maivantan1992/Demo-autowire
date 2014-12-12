package com.sample.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sample.entity.User;

@Repository
public class UserHBDAO extends HBBasicDAO implements IUserDAO {
	@Override
	@Transactional
	public User getById(Integer userId) {
		return this.sessionFactory.get(User.class, userId);
	}

}
