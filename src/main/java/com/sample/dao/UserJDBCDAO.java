//package com.sample.dao;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.BeanPropertyRowMapper;
//import org.springframework.stereotype.Repository;
//
//import com.sample.entity.User;
//
//// Generated Dec 9, 2014 1:43:11 PM by Hibernate Tools 4.0.0
//
///**
// * Home object for domain model class User.
// * 
// * @see com.sample.DAO.User
// * @author Hibernate Tools
// */
//
//@Repository
//public class UserJDBCDAO extends JDBCBasicDAO implements IUserDAO {
//
//	public UserJDBCDAO() {
//	}
//
//	@Autowired
//	public UserJDBCDAO(DataSource dataSourceJDBC) {
//		this.setDataSource(dataSourceJDBC);
//	}
//
//	public User getById(Integer userId) {
//		String query = "SELECT * FROM user WHERE EMPLOYEE_ID = ?";
//		return (User) this.getJdbcTemplate().queryForObject(query,
//				new Object[] { userId },
//				new BeanPropertyRowMapper<User>(User.class));
//	}
//}
