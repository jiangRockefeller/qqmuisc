package com.bdqn.qqmusic.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Song entity. @author MyEclipse Persistence Tools
 */

public class Song implements java.io.Serializable {

	// Fields

	private Integer sid;
	private Artist artist;
	private Record record;
	private String sname;
	private String scompose;
	private String sarrangement;
	private Set songlists = new HashSet(0);

	// Constructors

	/** default constructor */
	public Song() {
	}

	/** minimal constructor */
	public Song(Artist artist, Record record, String sname) {
		this.artist = artist;
		this.record = record;
		this.sname = sname;
	}

	/** full constructor */
	public Song(Artist artist, Record record, String sname, String scompose,
			String sarrangement, Set songlists) {
		this.artist = artist;
		this.record = record;
		this.sname = sname;
		this.scompose = scompose;
		this.sarrangement = sarrangement;
		this.songlists = songlists;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public Artist getArtist() {
		return this.artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Record getRecord() {
		return this.record;
	}

	public void setRecord(Record record) {
		this.record = record;
	}

	public String getSname() {
		return this.sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getScompose() {
		return this.scompose;
	}

	public void setScompose(String scompose) {
		this.scompose = scompose;
	}

	public String getSarrangement() {
		return this.sarrangement;
	}

	public void setSarrangement(String sarrangement) {
		this.sarrangement = sarrangement;
	}

	public Set getSonglists() {
		return this.songlists;
	}

	public void setSonglists(Set songlists) {
		this.songlists = songlists;
	}

}