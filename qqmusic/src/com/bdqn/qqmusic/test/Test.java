package com.bdqn.qqmusic.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.qqmusic.util.HibernateSessionFactory;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Transaction tx=null;
		Session session=null
		session=HibernateSessionFactory.getSession();
		session.beginTransaction();
	}

}
