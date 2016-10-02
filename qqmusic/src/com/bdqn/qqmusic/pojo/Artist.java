package com.bdqn.qqmusic.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Artist entity. @author MyEclipse Persistence Tools
 */

public class Artist implements java.io.Serializable {

	// Fields

	private Integer aid;
	private Nation nation;
	private String aname;
	private String agraduation;
	private String anationality;
	private String abirthplace;
	private String aprofession;
	private String aheight;
	private String aweight;
	private String abloodtype;
	private String aachievement;
	private String ainterests;
	private String apicpath;
	private String atype;
	private Set songs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Artist() {
	}

	/** minimal constructor */
	public Artist(Nation nation, String aname) {
		this.nation = nation;
		this.aname = aname;
	}

	/** full constructor */
	public Artist(Nation nation, String aname, String agraduation,
			String anationality, String abirthplace, String aprofession,
			String aheight, String aweight, String abloodtype,
			String aachievement, String ainterests, String apicpath,
			String atype, Set songs) {
		this.nation = nation;
		this.aname = aname;
		this.agraduation = agraduation;
		this.anationality = anationality;
		this.abirthplace = abirthplace;
		this.aprofession = aprofession;
		this.aheight = aheight;
		this.aweight = aweight;
		this.abloodtype = abloodtype;
		this.aachievement = aachievement;
		this.ainterests = ainterests;
		this.apicpath = apicpath;
		this.atype = atype;
		this.songs = songs;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public Nation getNation() {
		return this.nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public String getAgraduation() {
		return this.agraduation;
	}

	public void setAgraduation(String agraduation) {
		this.agraduation = agraduation;
	}

	public String getAnationality() {
		return this.anationality;
	}

	public void setAnationality(String anationality) {
		this.anationality = anationality;
	}

	public String getAbirthplace() {
		return this.abirthplace;
	}

	public void setAbirthplace(String abirthplace) {
		this.abirthplace = abirthplace;
	}

	public String getAprofession() {
		return this.aprofession;
	}

	public void setAprofession(String aprofession) {
		this.aprofession = aprofession;
	}

	public String getAheight() {
		return this.aheight;
	}

	public void setAheight(String aheight) {
		this.aheight = aheight;
	}

	public String getAweight() {
		return this.aweight;
	}

	public void setAweight(String aweight) {
		this.aweight = aweight;
	}

	public String getAbloodtype() {
		return this.abloodtype;
	}

	public void setAbloodtype(String abloodtype) {
		this.abloodtype = abloodtype;
	}

	public String getAachievement() {
		return this.aachievement;
	}

	public void setAachievement(String aachievement) {
		this.aachievement = aachievement;
	}

	public String getAinterests() {
		return this.ainterests;
	}

	public void setAinterests(String ainterests) {
		this.ainterests = ainterests;
	}

	public String getApicpath() {
		return this.apicpath;
	}

	public void setApicpath(String apicpath) {
		this.apicpath = apicpath;
	}

	public String getAtype() {
		return this.atype;
	}

	public void setAtype(String atype) {
		this.atype = atype;
	}

	public Set getSongs() {
		return this.songs;
	}

	public void setSongs(Set songs) {
		this.songs = songs;
	}

}