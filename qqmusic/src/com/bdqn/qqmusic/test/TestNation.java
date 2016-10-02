package com.bdqn.qqmusic.test;

import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bdqn.qqmusic.pojo.Artist;
import com.bdqn.qqmusic.pojo.Nation;
import com.bdqn.qqmusic.serviceImpl.NationServiceImpl;
import com.bdqn.qqmusic.util.HibernateSessionFactory;

public class TestNation {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		Artist artist=(Artist)session.get(Artist.class, 1);
		
		NationServiceImpl nationService=new NationServiceImpl();
		Nation nation=new Nation();
		//nation.setNid(5);
		
		//nation.setNclass("444");
		//nation.setNnation("22");
		//nation.setNnation("33");
		nation=nationService.findById(3);
		
		//System.out.println(nation.getNnation());

		Set<Artist> set=nation.getArtists();
		
		for(Artist artist1:set){
			System.out.println(artist1.getAheight());
			System.out.println(1);
		}
		
		//List<Nation> list=nationService.findByProperty("nid", 1);
//		for(Nation na:list){
//			System.out.println(na.getNid()+"\t"+na.getNnation()+"\t"+na.getNclass());
//		}
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++");
		
		
/*		for(Object obj:list){
			Object [] o=(Object[])obj;
			System.out.println(o[0]+"\t"+o[1]);
		}*/
		
		//ID查询
		//nation=nationService.findById(3);		
		
		//查询所有
		//List<Nation> list=nationService.findAll();
		
		//删除，要写nation的全部属性
		//nationService.delete(nation);
		
		//合拼，要写nation的全部属性
		//nationService.merge(nation);
		
		//使用Nclass属性查询，不能用其他属性查询
		//List<Nation> list=nationService.findByNclass(nation);
		
		//使用属性+属性内容查询
		//List<Nation> list=nationService.findByProperty("nid", 4);
		
	}

}
