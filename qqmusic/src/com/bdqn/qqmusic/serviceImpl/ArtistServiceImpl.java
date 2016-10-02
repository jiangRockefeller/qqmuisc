package com.bdqn.qqmusic.serviceImpl;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.bdqn.qqmusic.pojo.Artist;
import com.bdqn.qqmusic.pojo.ArtistDAO;
import com.bdqn.qqmusic.pojo.Nation;
import com.bdqn.qqmusic.pojo.Song;
import com.bdqn.qqmusic.service.ArtistService;
import com.bdqn.qqmusic.util.HibernateSessionFactory;

public class ArtistServiceImpl implements ArtistService {
	ArtistDAO artistDAO=new ArtistDAO();
	//1	用name获取Artist
	public List<Artist> getArtistByName(String name) {				//finish
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		//Artist artist=new Artist();
		List<Artist> list=null;
		try{
			list=artistDAO.findByAname(name);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return list;
	}
	//2	用id获取Artist
	public Artist getArtistById(int id) {					//finish
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		Artist artist=new Artist();
		try{
			artist=artistDAO.findById(id);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return artist;
	}
	//3	pageNum当前所在页；line一页有多少行artist
	public List<Artist> getArtistsByNationPageUnm(Nation Nation, int pageNum,				//nufinish
			int line) {
		// TODO Auto-generated method stub
		return null;
	}
	//4	用Nation获取Artist
	public List<Artist> getArtistsByNation(Nation nation) {					//nufinish
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		List<Artist> list=null;
		try{
			//artistDAO.
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return list;
	}
	//5	获取Artist
	public List<Artist> getAllArtists() {								//finish
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		List<Artist> list=null;
		try{
			list=artistDAO.findAll();
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		return list;
	}
	//6	增加Artist
	public void addArtist(Artist artist) {					//finish
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		//List<Artist> list=null;
		try{			
			artistDAO.save(artist);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
	}
	//7	删除Artist
	public void deleteArtist(Artist artist) {				//finish
		// TODO Auto-generated method stub
		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		//List<Artist> list=null;
		try{
			//Artist artist1=artistDAO.get(artist.getAid());
			artistDAO.delete(artist);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
	}
	//8	编辑song
	public void editSong(Song Song) {				//unfinish
		// TODO Auto-generated method stub

		Session session=HibernateSessionFactory.getSession();
		Transaction tx=session.beginTransaction();
		//List<Artist> list=null;
		try{
			//Artist artist1=artistDAO.get(artist.getAid());
			//artistDAO.merge(Song);
			tx.commit();
		}catch(RuntimeException e){
			e.printStackTrace();
			tx.rollback();
		}finally{
			session.close();
		}
		
	}

}
