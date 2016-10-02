package com.bdqn.qqmusic.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Genre entity. @author MyEclipse Persistence Tools
 */

public class Genre implements java.io.Serializable {

	// Fields

	private Integer gid;
	private String ggenre;
	private Set records = new HashSet(0);

	// Constructors

	/** default constructor */
	public Genre() {
	}

	/** full constructor */
	public Genre(String ggenre, Set records) {
		this.ggenre = ggenre;
		this.records = records;
	}

	// Property accessors

	public Integer getGid() {
		return this.gid;
	}

	public void setGid(Integer gid) {
		this.gid = gid;
	}

	public String getGgenre() {
		return this.ggenre;
	}

	public void setGgenre(String ggenre) {
		this.ggenre = ggenre;
	}

	public Set getRecords() {
		return this.records;
	}

	public void setRecords(Set records) {
		this.records = records;
	}

}