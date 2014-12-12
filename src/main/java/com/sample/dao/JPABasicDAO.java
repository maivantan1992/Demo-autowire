package com.sample.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class JPABasicDAO {

	@PersistenceContext
	protected EntityManager em;
}
