package com.bdqn.qqmusic.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record implements java.io.Serializable {

	// Fields

	private Integer rid;
	private Type type;
	private Genre genre;
	private Company company;
	private Language language;
	private String rname;
	private Timestamp rdate;
	private String rcoverpath;
	private Set songs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Record() {
	}

	/** minimal constructor */
	public Record(String rname) {
		this.rname = rname;
	}

	/** full constructor */
	public Record(Type type, Genre genre, Company company, Language language,
			String rname, Timestamp rdate, String rcoverpath, Set songs) {
		this.type = type;
		this.genre = genre;
		this.company = company;
		this.language = language;
		this.rname = rname;
		this.rdate = rdate;
		this.rcoverpath = rcoverpath;
		this.songs = songs;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Type getType() {
		return this.type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Genre getGenre() {
		return this.genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Language getLanguage() {
		return this.language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}

	public String getRname() {
		return this.rname;
	}

	public void setRname(String rname) {
		this.rname = rname;
	}

	public Timestamp getRdate() {
		return this.rdate;
	}

	public void setRdate(Timestamp rdate) {
		this.rdate = rdate;
	}

	public String getRcoverpath() {
		return this.rcoverpath;
	}

	public void setRcoverpath(String rcoverpath) {
		this.rcoverpath = rcoverpath;
	}

	public Set getSongs() {
		return this.songs;
	}

	public void setSongs(Set songs) {
		this.songs = songs;
	}

}