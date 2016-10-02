package com.bdqn.qqmusic.test;

import java.util.List;

import com.bdqn.qqmusic.pojo.Artist;
import com.bdqn.qqmusic.service.ArtistService;
import com.bdqn.qqmusic.serviceImpl.ArtistServiceImpl;

public class TestArtist {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArtistService artistServiceImpl=new ArtistServiceImpl();
		Artist artist=new Artist();
		List<Artist> list;
		artist=artistServiceImpl.getArtistById(16);
		//list=artistServiceImpl.getAllArtists();
		//System.out.println(list.size());
		System.out.println(artist.getAheight());
		//artistServiceImpl.addArtist(artist);
		artist=artistServiceImpl.getArtistById(16);
		System.out.println(artist.getAheight());
	}

}
