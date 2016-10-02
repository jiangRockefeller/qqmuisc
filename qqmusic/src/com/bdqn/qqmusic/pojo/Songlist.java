package com.bdqn.qqmusic.pojo;

import java.sql.Timestamp;

/**
 * Songlist entity. @author MyEclipse Persistence Tools
 */

public class Songlist implements java.io.Serializable {

	// Fields

	private Integer slid;
	private Songlistmanage songlistmanage;
	private Song song;
	private Timestamp slcreateDate;

	// Constructors

	/** default constructor */
	public Songlist() {
	}

	/** minimal constructor */
	public Songlist(Songlistmanage songlistmanage, Song song) {
		this.songlistmanage = songlistmanage;
		this.song = song;
	}

	/** full constructor */
	public Songlist(Songlistmanage songlistmanage, Song song,
			Timestamp slcreateDate) {
		this.songlistmanage = songlistmanage;
		this.song = song;
		this.slcreateDate = slcreateDate;
	}

	// Property accessors

	public Integer getSlid() {
		return this.slid;
	}

	public void setSlid(Integer slid) {
		this.slid = slid;
	}

	public Songlistmanage getSonglistmanage() {
		return this.songlistmanage;
	}

	public void setSonglistmanage(Songlistmanage songlistmanage) {
		this.songlistmanage = songlistmanage;
	}

	public Song getSong() {
		return this.song;
	}

	public void setSong(Song song) {
		this.song = song;
	}

	public Timestamp getSlcreateDate() {
		return this.slcreateDate;
	}

	public void setSlcreateDate(Timestamp slcreateDate) {
		this.slcreateDate = slcreateDate;
	}

}