package com.bdqn.qqmusic.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Language entity. @author MyEclipse Persistence Tools
 */

public class Language implements java.io.Serializable {

	// Fields

	private Integer lid;
	private String llanguage;
	private Set records = new HashSet(0);

	// Constructors

	/** default constructor */
	public Language() {
	}

	/** full constructor */
	public Language(String llanguage, Set records) {
		this.llanguage = llanguage;
		this.records = records;
	}

	// Property accessors

	public Integer getLid() {
		return this.lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public String getLlanguage() {
		return this.llanguage;
	}

	public void setLlanguage(String llanguage) {
		this.llanguage = llanguage;
	}

	public Set getRecords() {
		return this.records;
	}

	public void setRecords(Set records) {
		this.records = records;
	}

}