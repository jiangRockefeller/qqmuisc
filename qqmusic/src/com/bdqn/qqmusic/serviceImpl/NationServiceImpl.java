package com.bdqn.qqmusic.serviceImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bdqn.qqmusic.pojo.Nation;
import com.bdqn.qqmusic.pojo.NationDAO;
import com.bdqn.qqmusic.service.NationService;
import com.bdqn.qqmusic.util.HibernateSessionFactory;

public class NationServiceImpl implements NationService {
	NationDAO nationDAO=new NationDAO();
	
	//1	�޸�or���
	public void merge(Nation nation) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			nationDAO.save(nation);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}		
	}

	//2 ɾ��
	public void delete(Nation nation) {
		// TODO Auto-generated method stub

		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		try{
			//nationDAO.
			nationDAO.delete(nation);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
	}
	
	//3	class���Ի�ȡ
	public List<Nation> findByNclass(Nation nation) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		List<Nation> list=null;
		try{
			list=nationDAO.findByNclass(nation.getNclass());
			tx.commit();
		}catch(RuntimeException e){			
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return list;		
	}
	
	//4 id��ѯ
	public Nation findById(Integer id) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		Nation nation=null;
		try{
			nation=nationDAO.findById(id);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return nation;		
	}
	
	//5 ��ѯ����
	public List findAll() {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		List list=null;
		try{
			list=nationDAO.findAll();
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return list;		
	}
	
	//6 Nation���ѯ
	public List<Nation> findByNnation(Nation nation) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		List<Nation> list=null;
		try{
			list=nationDAO.findByNnation(nation.getNnation());
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return list;		
	}
	
	//7 ����+�������ݲ�ѯ
	public List<Nation> findByProperty(String propertyName, Object value){
		
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		List<Nation> list=null;
		try{
			list=nationDAO.findByProperty(propertyName, value);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return list;
		
	}
	
}
