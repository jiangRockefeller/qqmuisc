package com.bdqn.qqmusic.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Nation entity. @author MyEclipse Persistence Tools
 */

public class Nation implements java.io.Serializable {

	// Fields

	private Integer nid;
	private String nnation;
	private String nclass;
	private Set artists = new HashSet(0);

	// Constructors

	/** default constructor */
	public Nation() {
	}

	/** minimal constructor */
	public Nation(String nnation) {
		this.nnation = nnation;
	}

	/** full constructor */
	public Nation(String nnation, String nclass, Set artists) {
		this.nnation = nnation;
		this.nclass = nclass;
		this.artists = artists;
	}

	// Property accessors

	public Integer getNid() {
		return this.nid;
	}

	public void setNid(Integer nid) {
		this.nid = nid;
	}

	public String getNnation() {
		return this.nnation;
	}

	public void setNnation(String nnation) {
		this.nnation = nnation;
	}

	public String getNclass() {
		return this.nclass;
	}

	public void setNclass(String nclass) {
		this.nclass = nclass;
	}

	public Set getArtists() {
		return this.artists;
	}

	public void setArtists(Set artists) {
		this.artists = artists;
	}

}