package com.bdqn.qqmusic.service;

import java.util.List;

import com.bdqn.qqmusic.pojo.Nation;

public interface NationService {
	//1	修改or添加
	public void merge(Nation nation);
	//2 删除
	public void delete(Nation nation);
	//3	class属性获取
	public List<Nation> findByNclass(Nation nation);	
	//4 id查询
	public Nation findById(Integer id);
	//5 查询所有
	public List findAll();
	//6 Nation类查询
	public List<Nation> findByNnation(Nation nation);	
	//7 属性+属性内容查询
	public List<Nation> findByProperty(String propertyName, Object value);	
	
}
