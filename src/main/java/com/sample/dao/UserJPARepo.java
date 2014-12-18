//package com.sample.dao;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//
//import com.sample.entity.User;
//
//@Repository
//public class UserJPARepo implements IUserDAO {
//
//	@Autowired
//	private IUserDAOJPARepo userDAOJPARepo;
//	
//	@Override
//	public User getById(Integer userId) {
//		return this.userDAOJPARepo.findOne(userId);
//	}
//
//}
