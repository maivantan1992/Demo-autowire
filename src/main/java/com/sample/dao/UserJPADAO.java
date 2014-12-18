//package com.sample.dao;
//
//import javax.persistence.Query;
//
//import org.springframework.stereotype.Repository;
//
//import com.sample.entity.User;
//
//@Repository
//public class UserJPADAO extends JPABasicDAO implements IUserDAO {
//
//	@Override
//	public User getById(Integer userId) {
//		Query query = this.em.createQuery(
//				"SELECT u FROM User u WHERE u.employeeId = :Id").setParameter(
//				"Id", userId);
//		return (User) query.getSingleResult();
//	}
//
//}
