package com.bdqn.qqmusic.service;

import java.util.List;
import com.bdqn.qqmusic.pojo.Artist;
import com.bdqn.qqmusic.pojo.Nation;
import com.bdqn.qqmusic.pojo.Song;

public interface ArtistService {
	
	//1	用name获取Artist
	public 	List<Artist> getArtistByName(String name);
	//2	用id获取Artist
	public 	Artist getArtistById(int id);
	//3	pageNum当前所在页；line一页有多少行artist
	public 	List<Artist> getArtistsByNationPageUnm(Nation Nation,int pageNum,int line);
	//4	用Nation获取Artist
	public 	List<Artist> getArtistsByNation(Nation nation);	
	//5	获取Artist
	public 	List<Artist> getAllArtists();
	//6	增加Artist
	public 	void addArtist(Artist artist);
	//7	删除Artist
	public 	void deleteArtist(Artist artist);	
	//8	编辑song
	public 	void editSong(Song Song);	
}
