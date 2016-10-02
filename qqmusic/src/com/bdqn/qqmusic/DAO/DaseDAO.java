package com.bdqn.qqmusic.DAO;

import org.hibernate.Session;

import com.bdqn.qqmusic.util.HibernateSessionFactory;

/**
 * Data access object (DAO) for domain model
 * @author MyEclipse Persistence Tools
 */
public class DaseDAO implements IBaseHibernateDAO {
	private Session session=null;
	public Session getSession() {
		//FIXME: Implement this method
		session=HibernateSessionFactory.getSession();
		return session;
	}
	
}