package com.bdqn.qqmusic.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * User entity. @author MyEclipse Persistence Tools
 */

public class User implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String uname;
	private Integer upwd;
	private String uemail;
	private Set songlistmanages = new HashSet(0);

	// Constructors

	/** default constructor */
	public User() {
	}

	/** minimal constructor */
	public User(String uname, Integer upwd, String uemail) {
		this.uname = uname;
		this.upwd = upwd;
		this.uemail = uemail;
	}

	/** full constructor */
	public User(String uname, Integer upwd, String uemail, Set songlistmanages) {
		this.uname = uname;
		this.upwd = upwd;
		this.uemail = uemail;
		this.songlistmanages = songlistmanages;
	}

	// Property accessors

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public Integer getUpwd() {
		return this.upwd;
	}

	public void setUpwd(Integer upwd) {
		this.upwd = upwd;
	}

	public String getUemail() {
		return this.uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public Set getSonglistmanages() {
		return this.songlistmanages;
	}

	public void setSonglistmanages(Set songlistmanages) {
		this.songlistmanages = songlistmanages;
	}

}