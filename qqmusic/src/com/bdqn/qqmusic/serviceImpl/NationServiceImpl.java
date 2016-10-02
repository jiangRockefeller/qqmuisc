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
	
	//1	修改or添加
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

	//2 删除
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
	
	//3	class属性获取
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
	
	//4 id查询
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
	
	//5 查询所有
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
	
	//6 Nation类查询
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
	
	//7 属性+属性内容查询
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
