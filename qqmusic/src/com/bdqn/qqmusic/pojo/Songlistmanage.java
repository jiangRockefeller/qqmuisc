package com.bdqn.qqmusic.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Songlistmanage entity. @author MyEclipse Persistence Tools
 */

public class Songlistmanage implements java.io.Serializable {

	// Fields

	private Integer smid;
	private User user;
	private String smname;
	private Timestamp smcreatedate;
	private Integer smcallcount;
	private String smcoverpath;
	private Set songlists = new HashSet(0);

	// Constructors

	/** default constructor */
	public Songlistmanage() {
	}

	/** minimal constructor */
	public Songlistmanage(User user, String smname) {
		this.user = user;
		this.smname = smname;
	}

	/** full constructor */
	public Songlistmanage(User user, String smname, Timestamp smcreatedate,
			Integer smcallcount, String smcoverpath, Set songlists) {
		this.user = user;
		this.smname = smname;
		this.smcreatedate = smcreatedate;
		this.smcallcount = smcallcount;
		this.smcoverpath = smcoverpath;
		this.songlists = songlists;
	}

	// Property accessors

	public Integer getSmid() {
		return this.smid;
	}

	public void setSmid(Integer smid) {
		this.smid = smid;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getSmname() {
		return this.smname;
	}

	public void setSmname(String smname) {
		this.smname = smname;
	}

	public Timestamp getSmcreatedate() {
		return this.smcreatedate;
	}

	public void setSmcreatedate(Timestamp smcreatedate) {
		this.smcreatedate = smcreatedate;
	}

	public Integer getSmcallcount() {
		return this.smcallcount;
	}

	public void setSmcallcount(Integer smcallcount) {
		this.smcallcount = smcallcount;
	}

	public String getSmcoverpath() {
		return this.smcoverpath;
	}

	public void setSmcoverpath(String smcoverpath) {
		this.smcoverpath = smcoverpath;
	}

	public Set getSonglists() {
		return this.songlists;
	}

	public void setSonglists(Set songlists) {
		this.songlists = songlists;
	}

}