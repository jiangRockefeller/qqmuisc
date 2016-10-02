package com.bdqn.qqmusic.service;

import java.util.List;
import com.bdqn.qqmusic.pojo.Artist;
import com.bdqn.qqmusic.pojo.Nation;
import com.bdqn.qqmusic.pojo.Song;

public interface ArtistService {
	
	//1	��name��ȡArtist
	public 	List<Artist> getArtistByName(String name);
	//2	��id��ȡArtist
	public 	Artist getArtistById(int id);
	//3	pageNum��ǰ����ҳ��lineһҳ�ж�����artist
	public 	List<Artist> getArtistsByNationPageUnm(Nation Nation,int pageNum,int line);
	//4	��Nation��ȡArtist
	public 	List<Artist> getArtistsByNation(Nation nation);	
	//5	��ȡArtist
	public 	List<Artist> getAllArtists();
	//6	����Artist
	public 	void addArtist(Artist artist);
	//7	ɾ��Artist
	public 	void deleteArtist(Artist artist);	
	//8	�༭song
	public 	void editSong(Song Song);	
}
