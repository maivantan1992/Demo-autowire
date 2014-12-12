package com.sample.dao;

import java.io.Serializable;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class HBSpBasicDAO<E, PK extends Serializable> extends
		HibernateDaoSupport {
	private Class<E> persistentClass;

	public HBSpBasicDAO(final Class<E> persistentClass) {
		this.persistentClass = persistentClass;
	}

	@Autowired
	public void initSessionFatory(SessionFactory sessionFactory) {
		this.setSessionFactory(sessionFactory);
	}

	public E get(PK id) {
		return this.getHibernateTemplate().get(this.persistentClass, id);
	}
}
